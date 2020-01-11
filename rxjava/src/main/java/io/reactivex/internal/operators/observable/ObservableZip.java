/**
 * Copyright (c) 2016-present, RxJava Contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.functions.ObjectHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.*;

import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.*;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;

public final class ObservableZip<T, R> extends Observable<R> {

    final ObservableSource<? extends T>[] sources;
    final Iterable<? extends ObservableSource<? extends T>> sourcesIterable;
    final Function<? super Object[], ? extends R> zipper;
    final int bufferSize;
    final boolean delayError;

    public ObservableZip(ObservableSource<? extends T>[] sources,
            Iterable<? extends ObservableSource<? extends T>> sourcesIterable,
            Function<? super Object[], ? extends R> zipper,
            int bufferSize,
            boolean delayError) {
        // sources 和 sourcesIterable 是 source 的两种存储结构，使用时有一个为 null。只要 sources 非 null 就会使用 sources
        this.sources = sources;
        this.sourcesIterable = sourcesIterable;
        this.zipper = zipper;
        this.bufferSize = bufferSize;
        this.delayError = delayError;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void subscribeActual(Observer<? super R> observer) {
        ObservableSource<? extends T>[] sources = this.sources;
        int count = 0;
        if (sources == null) {
            sources = new ObservableSource[8];// 初始大小为 8
            // 将 sourcesIterable 转移到数组结构
            for (ObservableSource<? extends T> p : sourcesIterable) {
                if (count == sources.length) {
                    // 扩容
                    ObservableSource<? extends T>[] b = new ObservableSource[count + (count >> 2)];
                    System.arraycopy(sources, 0, b, 0, count);
                    sources = b;
                }
                sources[count++] = p;
            }
        } else {
            count = sources.length;
        }

        if (count == 0) {
            EmptyDisposable.complete(observer);
            return;
        }

        ZipCoordinator<T, R> zc = new ZipCoordinator<T, R>(observer, zipper, count, delayError);
        zc.subscribe(sources, bufferSize);
    }

    static final class ZipCoordinator<T, R> extends AtomicInteger implements Disposable {

        private static final long serialVersionUID = 2983708048395377667L;
        final Observer<? super R> downstream;
        final Function<? super Object[], ? extends R> zipper;
        final ZipObserver<T, R>[] observers;
        final T[] row;// 用于存放所有 source 发送的 item，当所有元素都不为 null 时，调用 zipper 向下游 observer 发送
        final boolean delayError;

        volatile boolean cancelled;

        @SuppressWarnings("unchecked")
        ZipCoordinator(Observer<? super R> actual,
                Function<? super Object[], ? extends R> zipper,
                int count, boolean delayError) {
            // actual 下游的 observer
            this.downstream = actual;
            this.zipper = zipper;
            this.observers = new ZipObserver[count]; //根据 sources 数量创建对应数量的 observer 数组
            this.row = (T[])new Object[count];
            this.delayError = delayError;
        }

        public void subscribe(ObservableSource<? extends T>[] sources, int bufferSize) {
            // subscribeActual 实际调用了这个方法
            ZipObserver<T, R>[] s = observers;
            int len = s.length;
            for (int i = 0; i < len; i++) {
                s[i] = new ZipObserver<T, R>(this, bufferSize);
            }
            // this makes sure the contents of the observers array is visible
            this.lazySet(0);
            downstream.onSubscribe(this);
            for (int i = 0; i < len; i++) {
                if (cancelled) {
                    return;
                }
                // 订阅每一个 source
                sources[i].subscribe(s[i]);
            }
        }

        @Override
        public void dispose() {
            if (!cancelled) {
                cancelled = true;
                cancelSources();
                if (getAndIncrement() == 0) {
                    clear();
                }
            }
        }

        @Override
        public boolean isDisposed() {
            return cancelled;
        }

        void cancel() {
            clear();
            cancelSources();
        }

        void cancelSources() {
            for (ZipObserver<?, ?> zs : observers) {
                zs.dispose();
            }
        }

        void clear() {
            for (ZipObserver<?, ?> zs : observers) {
                zs.queue.clear();
            }
        }

        public void drain() {
            // 每一个 source 发送 event 时都会调用
            // 注意几种情况：1. 有的 source 发送了 item，有的发送了通知 2. 有的 source 发送了几个 item，有的一个也没发送
            if (getAndIncrement() != 0) {
                return;
            }

            int missing = 1;// 没想明白这个是干嘛的。。。

            final ZipObserver<T, R>[] zs = observers;
            final Observer<? super R> a = downstream;
            final T[] os = row;
            final boolean delayError = this.delayError;

            // 为什么这么写？为什么这么写？为什么这么写？
            for (;;) {

                for (;;) {
                    int i = 0;
                    int emptyCount = 0;
                    for (ZipObserver<T, R> z : zs) {
                        // 遍历所有的 observer
                        if (os[i] == null) {
                            // 1. 为 null 表示这个 observer 在还没有 item
                            boolean d = z.done;
                            T v = z.queue.poll();// 取出元素
                            boolean empty = v == null;

                            // 2. 判断是否已被停止
                            if (checkTerminated(d, empty, a, delayError, z)) {
                                return;
                            }
                            if (!empty) {
                                // 3. empty 为 false 表示这个 source 发送了 item，取出并放入 os[i]
                                os[i] = v;
                            } else {
                                // 4. 并不是由这个 source 触发的，说明这个 source 还没有发送 item 或通知
                                emptyCount++;// 标识没有发送 item 的 source 数量
                            }
                        } else {
                            // 这个 source 之前发送的 item 还未被下游消耗，只判断这个 source 是否发送了通知
                            if (z.done && !delayError) {
                                Throwable ex = z.error;
                                if (ex != null) {
                                    cancelled = true;
                                    cancel();
                                    a.onError(ex);
                                    return;
                                }
                            }
                        }
                        i++;
                    }

                    if (emptyCount != 0) {
                        // 有 source 还没有发送，退出等待下一个事件
                        break;
                    }

                    R v;
                    try {
                        v = ObjectHelper.requireNonNull(zipper.apply(os.clone()), "The zipper returned a null value");
                    } catch (Throwable ex) {
                        Exceptions.throwIfFatal(ex);
                        cancel();
                        a.onError(ex);
                        return;
                    }

                    // 所有 source 都发送了 item，调用 zipper 转换之后发送给下游 observer
                    a.onNext(v);

                    Arrays.fill(os, null);// 将 os 的所有元素重置为 null
                }

                missing = addAndGet(-missing);
                if (missing == 0) {
                    return;
                }
            }
        }

        boolean checkTerminated(boolean d, boolean empty, Observer<? super R> a, boolean delayError, ZipObserver<?, ?> source) {
            // 检查事件流是否已停止
            // 判断：
            // 1. 被取消
            // 2. 有一个 source 发送了 error 或 complete
            if (cancelled) {
                cancel();
                return true;
            }

            if (d) {
                // onError 和 onComplete 时 d 为 true
                if (delayError) {
                    // d 为 true，empty 为 false 为 false 意味着该 source 的 item 还未来得及被消耗的时候，又发送了通知
                    // 如果是这种情况的话，该通知不会被处理，即不会中断整个事件流
                    // 当某个没有未发送数据的 source 触发通知时，中断事件流
                    if (empty) {
                        Throwable e = source.error;
                        cancelled = true;
                        cancel();
                        if (e != null) {
                            a.onError(e);
                        } else {
                            a.onComplete();
                        }
                        return true;
                    }
                } else {
                    // Observable#zip 的 delayError 为 false，所以可以看源码先略过 true 的情况
                    Throwable e = source.error;
                    if (e != null) {
                        // e 非 null 说明发生了 error
                        cancelled = true;
                        cancel();
                        a.onError(e);
                        return true;
                    } else
                    if (empty) {
                        // empty 和 d 同时为 true 时，说明 source 发送了 error 或 complete，而上面 e 为 null，说明发送的是 complete
                        cancelled = true;
                        cancel();
                        a.onComplete();// a 是下游的 observer
                        return true;
                    }
                }
            }

            return false;
        }
    }

    static final class ZipObserver<T, R> implements Observer<T> {

        final ZipCoordinator<T, R> parent;
        final SpscLinkedArrayQueue<T> queue;// 存储 onNext 的 item

        volatile boolean done;
        Throwable error;

        final AtomicReference<Disposable> upstream = new AtomicReference<Disposable>();

        ZipObserver(ZipCoordinator<T, R> parent, int bufferSize) {
            this.parent = parent;
            this.queue = new SpscLinkedArrayQueue<T>(bufferSize);
        }

        @Override
        public void onSubscribe(Disposable d) {
            DisposableHelper.setOnce(this.upstream, d);
        }

        @Override
        public void onNext(T t) {
            queue.offer(t);
            parent.drain();
        }

        @Override
        public void onError(Throwable t) {
            error = t;
            done = true;
            parent.drain();
        }

        @Override
        public void onComplete() {
            done = true;
            parent.drain();
        }

        public void dispose() {
            DisposableHelper.dispose(upstream);
        }
    }
}

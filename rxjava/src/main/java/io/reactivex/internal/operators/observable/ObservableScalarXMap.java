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

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

import io.reactivex.*;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/**
 * 用于 scalar-sourced 的 XMap 操作符，其中X == { flat, concat, switch }，这三个操作符的 mapper 类型结构都是一样的
 * 标量源？只发送一个值的 source，也就是 onNext 只会触发一次，比如 ObservableJust。
 *
 * 总结：如果上游 source 是一个 scalar 的 source，那么直接通过 Callable#call() 得到它的值，
 * 这样就减少了一层 Observer（因为不这样做的话，需要对上游 source 订阅来得到它的值）。结果通过这个值，经过 mapper 得到
 * 一个 source2，如果这个 source2 也是一个 scalar source 的话，直接触发下游 observer 的 onNext 和 onComplete，如果不是
 * scalar source，那么需要对 source2 进行订阅来得到它的发送。
 *
 * 如果上游是一个 scalar source，flat, concat, switch 三者似乎没有区别。
 *
 * Utility classes to work with scalar-sourced XMap operators (where X == { flat, concat, switch }).
 */
public final class ObservableScalarXMap {

    /** Utility class. */
    private ObservableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    /**
     * Tries to subscribe to a possibly Callable source's mapped ObservableSource.
     * @param <T> the input value type
     * @param <R> the output value type
     * @param source the source ObservableSource
     * @param observer the subscriber
     * @param mapper the function mapping a scalar value into an ObservableSource
     * @return true if successful, false if the caller should continue with the regular path.
     */
    @SuppressWarnings("unchecked")
    public static <T, R> boolean tryScalarXMapSubscribe(ObservableSource<T> source,
            Observer<? super R> observer,
            Function<? super T, ? extends ObservableSource<? extends R>> mapper) {
        // observer 是下游的订阅者
        if (source instanceof Callable) {
            // 如果上游 source 是 Callable 对象
            T t;

            try {
                // 执行 Callable#call() 得到返回值
                // II 对于 scalar 的 source，call() 返回的值就是唯一 emission 的值。
                t = ((Callable<T>)source).call();
            } catch (Throwable ex) {
                // call() 方法执行异常，发送 error
                Exceptions.throwIfFatal(ex);
                EmptyDisposable.error(ex, observer);
                return true;
            }

            if (t == null) {
                // 返回的 t 为 null，发送 complete
                EmptyDisposable.complete(observer);
                return true;
            }

            ObservableSource<? extends R> r;

            try {
                // 执行 mapper 的 apply(..) 方法，将 t 转换成一个 source，并确保返回的 source 非 null。
                // t 是前面通过 Callable#call() 得到的，Callable 也就是上游的 source。
                r = ObjectHelper.requireNonNull(mapper.apply(t), "The mapper returned a null ObservableSource");
            } catch (Throwable ex) {
                // 发送 error
                Exceptions.throwIfFatal(ex);
                EmptyDisposable.error(ex, observer);
                return true;
            }

            if (r instanceof Callable) {
                // mapper#apply(..) 得到的也是一个 Callable
                // II 也就是经过 mapper 后得到的 source 也是一个 scalar source，那么可以进一步优化
                R u;

                try {
                    // 调用这个 Callable 的 call() 方法
                    // II 得到 scalar source 要发送的值
                    u = ((Callable<R>)r).call();
                } catch (Throwable ex) {
                    // 发送 error
                    Exceptions.throwIfFatal(ex);
                    EmptyDisposable.error(ex, observer);
                    return true;
                }

                if (u == null) {
                    // 发送 complete
                    EmptyDisposable.complete(observer);
                    return true;
                }
                // 构建一个 ScalarDisposable 对象
                ScalarDisposable<R> sd = new ScalarDisposable<R>(observer, u);
                // 订阅开始
                observer.onSubscribe(sd);
                // 执行任务
                // II 会触发 onNext，并紧跟 onNext
                sd.run();
            } else {
                // r 是 mapper#apply(..) 得到的
                // II XMap 之后得到的不是 scalar source，对其进行订阅
                r.subscribe(observer);
                // 第一遍看完还是很懵，看似每一句都大概清楚，但是不知道为什么这样用
                // 接着看了 ScalarDisposable 的 doc，大概明白 scalar 表示的是只有一个值的意思，比如一个 scalar source 只会触发一次 onNext，接着触发 onComplete。
            }

            return true;
        }
        return false;
    }

    /**
     * Maps a scalar value into an Observable and emits its values.
     *
     * @param <T> the scalar value type
     * @param <U> the output value type
     * @param value the scalar value to map
     * @param mapper the function that gets the scalar value and should return
     * an ObservableSource that gets streamed
     * @return the new Observable instance
     */
    public static <T, U> Observable<U> scalarXMap(T value,
            Function<? super T, ? extends ObservableSource<? extends U>> mapper) {
        return RxJavaPlugins.onAssembly(new ScalarXMapObservable<T, U>(value, mapper));
    }

    /**
     * Maps a scalar value to an ObservableSource and subscribes to it.
     *
     * @param <T> the scalar value type
     * @param <R> the mapped ObservableSource's element type.
     */
    static final class ScalarXMapObservable<T, R> extends Observable<R> {

        final T value;

        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

        ScalarXMapObservable(T value,
                Function<? super T, ? extends ObservableSource<? extends R>> mapper) {
            this.value = value;
            this.mapper = mapper;
        }

        @SuppressWarnings("unchecked")
        @Override
        public void subscribeActual(Observer<? super R> observer) {
            ObservableSource<? extends R> other;
            try {
                other = ObjectHelper.requireNonNull(mapper.apply(value), "The mapper returned a null ObservableSource");
            } catch (Throwable e) {
                EmptyDisposable.error(e, observer);
                return;
            }
            if (other instanceof Callable) {
                R u;

                try {
                    u = ((Callable<R>)other).call();
                } catch (Throwable ex) {
                    Exceptions.throwIfFatal(ex);
                    EmptyDisposable.error(ex, observer);
                    return;
                }

                if (u == null) {
                    EmptyDisposable.complete(observer);
                    return;
                }
                ScalarDisposable<R> sd = new ScalarDisposable<R>(observer, u);
                observer.onSubscribe(sd);
                sd.run();
            } else {
                other.subscribe(observer);
            }
        }
    }

    /**
     * 表示一个触发一个 onNext 之后紧跟一个 onComplete 的 Disposable。也就是只发送一个 onNext，不就是 Single?
     * Represents a Disposable that signals one onNext followed by an onComplete.
     *
     * @param <T> the value type
     */
    public static final class ScalarDisposable<T>
    extends AtomicInteger
    implements QueueDisposable<T>, Runnable {

        private static final long serialVersionUID = 3880992722410194083L;

        final Observer<? super T> observer;

        final T value;

        static final int START = 0;
        static final int FUSED = 1;
        static final int ON_NEXT = 2;
        static final int ON_COMPLETE = 3;

        public ScalarDisposable(Observer<? super T> observer, T value) {
            this.observer = observer;
            this.value = value;
        }

        @Override
        public boolean offer(T value) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override
        public boolean offer(T v1, T v2) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Nullable
        @Override
        public T poll() throws Exception {
            if (get() == FUSED) {
                lazySet(ON_COMPLETE);
                return value;
            }
            return null;
        }

        @Override
        public boolean isEmpty() {
            return get() != FUSED;
        }

        @Override
        public void clear() {
            lazySet(ON_COMPLETE);
        }

        @Override
        public void dispose() {
            set(ON_COMPLETE);
        }

        @Override
        public boolean isDisposed() {
            return get() == ON_COMPLETE;
        }

        @Override
        public int requestFusion(int mode) {
            if ((mode & SYNC) != 0) {
                lazySet(FUSED);
                return SYNC;
            }
            return NONE;
        }

        @Override
        public void run() {
            if (get() == START && compareAndSet(START, ON_NEXT)) {
                observer.onNext(value);
                if (get() == ON_NEXT) {
                    lazySet(ON_COMPLETE);
                    observer.onComplete();
                }
            }
        }
    }
}

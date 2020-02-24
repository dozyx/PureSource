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

import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/**
 * 隐藏包装的 ObservableSource 的真实身份。
 * 比如 source 是 BehaviorSubject，那么使用了 subject.hide 之后，返回的是一个 Observable，将无法直接调用 subject.onNext 等方法
 * 这样就达到了隐藏该 source 为 BehaviorSubject 的目的，并防止其专有的 api 被调用。
 * Hides the identity of the wrapped ObservableSource and its Disposable.
 * @param <T> the value type
 *
 * @since 2.0
 */
public final class ObservableHide<T> extends AbstractObservableWithUpstream<T, T> {

    public ObservableHide(ObservableSource<T> source) {
        super(source);
    }

    @Override
    protected void subscribeActual(Observer<? super T> o) {
        source.subscribe(new HideDisposable<T>(o));
    }

    static final class HideDisposable<T> implements Observer<T>, Disposable {

        final Observer<? super T> downstream;

        Disposable upstream;

        HideDisposable(Observer<? super T> downstream) {
            this.downstream = downstream;
        }

        @Override
        public void dispose() {
            upstream.dispose();
        }

        @Override
        public boolean isDisposed() {
            return upstream.isDisposed();
        }

        @Override
        public void onSubscribe(Disposable d) {
            if (DisposableHelper.validate(this.upstream, d)) {
                this.upstream = d;
                downstream.onSubscribe(this);
            }
        }

        @Override
        public void onNext(T t) {
            downstream.onNext(t);
        }

        @Override
        public void onError(Throwable t) {
            downstream.onError(t);
        }

        @Override
        public void onComplete() {
            downstream.onComplete();
        }
    }
}

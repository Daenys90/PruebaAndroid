package cl.desafiolatam.pruebafinal.domain.interactor;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


abstract class UseCase<T, Params> {

    private final CompositeDisposable disposables;

    UseCase() {
        this.disposables = new CompositeDisposable();
    }

    abstract Observable<T> buildUseCaseObservable(Params params);

    /**
     * ejecuta el use case en curso.
     *
     * @param observer {@link DisposableObserver} parametro que queda escuchando el build del observer
     *                 by {@link #buildUseCaseObservable(Params)} ()} metódo de la clase.
     * @param params   Parameters (Optional) usados para ejecutar el caso de uso
     */
    public void execute(DisposableObserver<T> observer, Params params) {

        final Observable<T> observable = this.buildUseCaseObservable(params)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

        addDisposable(observable.subscribeWith(observer));
    }

    public void dispose() {
        if (!disposables.isDisposed()) {
            disposables.dispose();
        }
    }

    private void addDisposable(Disposable disposable) {
        disposables.add(disposable);
    }
}

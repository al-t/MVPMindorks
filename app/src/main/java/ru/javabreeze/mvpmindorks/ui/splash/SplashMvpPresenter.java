package ru.javabreeze.mvpmindorks.ui.splash;

import ru.javabreeze.mvpmindorks.ui.base.MvpPresenter;

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();

}

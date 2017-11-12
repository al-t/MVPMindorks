package ru.javabreeze.mvpmindorks.ui.login;

import ru.javabreeze.mvpmindorks.ui.base.MvpPresenter;
import ru.javabreeze.mvpmindorks.ui.base.MvpView;

public interface LoginMvpPresenter<V extends MvpView> extends MvpPresenter<V> {
    void startLogin(String emailId);
}

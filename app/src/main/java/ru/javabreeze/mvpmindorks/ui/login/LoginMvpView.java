package ru.javabreeze.mvpmindorks.ui.login;

import ru.javabreeze.mvpmindorks.ui.base.MvpView;

public interface LoginMvpView extends MvpView {

    void openMainActivity();

    void onLoginButtonClick();
}

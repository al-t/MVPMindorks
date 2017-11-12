package ru.javabreeze.mvpmindorks.ui.login;

import ru.javabreeze.mvpmindorks.data.DataManager;
import ru.javabreeze.mvpmindorks.ui.base.BasePresenter;
import ru.javabreeze.mvpmindorks.ui.base.MvpView;

public class LoginPresenter<V extends MvpView> extends BasePresenter<V> implements
        LoginMvpPresenter<V> {

    LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }
}

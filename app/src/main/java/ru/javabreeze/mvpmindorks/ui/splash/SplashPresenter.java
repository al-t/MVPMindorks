package ru.javabreeze.mvpmindorks.ui.splash;

import ru.javabreeze.mvpmindorks.data.DataManager;
import ru.javabreeze.mvpmindorks.ui.base.BasePresenter;

public class SplashPresenter extends BasePresenter implements SplashMvpPresenter {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()) {
            getMvpView().openMainActivity();
        } else {
            getMvpView().openLoginActivity();
        }
    }
}

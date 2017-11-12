package ru.javabreeze.mvpmindorks.ui.splash;

import ru.javabreeze.mvpmindorks.ui.base.MvpView;

/**
 * Interface for launcher activity of the app
 * Created by Алексей on 11.11.2017.
 */

public interface SplashMvpView extends MvpView {

    void openMainActivity();

    void openLoginActivity();

}

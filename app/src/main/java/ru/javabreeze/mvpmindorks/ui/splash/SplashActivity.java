package ru.javabreeze.mvpmindorks.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import ru.javabreeze.mvpmindorks.ui.main.MainActivity;
import ru.javabreeze.mvpmindorks.data.DataManager;
import ru.javabreeze.mvpmindorks.ui.base.BaseActivity;

/**
 * Launcher activity of the app
 * Created by Алексей on 11.11.2017.
 */

public class SplashActivity extends BaseActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SplashActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.support.v4.R.layout.activity_splash);
        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mSplashPresenter = new SplashPresenter(dataManager);
        mSplashPresenter.onAttach(this);
        mSplashPresenter.decideNextActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }
}

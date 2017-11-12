package ru.javabreeze.mvpmindorks.ui.main;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import ru.javabreeze.mvpmindorks.R;
import ru.javabreeze.mvpmindorks.data.DataManager;
import ru.javabreeze.mvpmindorks.ui.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainMvpView {

    private TextView mTextViewShow;
    private Button mButtonLogout;
    private MainPresenter mMainPresenter;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, MainActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout
                .activity_main);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mMainPresenter = new MainPresenter(dataManager);
        mMainPresenter.onAttach(this);

        mTextViewShow = binding.textViewShow;
        mButtonLogout = binding.buttonLogout;
        mTextViewShow.setText(mMainPresenter.getEmailId());

        mButtonLogout.setOnClickListener(view -> mMainPresenter.setUserLoggedOut());
    }

    @Override
    public void 
}

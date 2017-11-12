package ru.javabreeze.mvpmindorks.ui.login;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.javabreeze.mvpmindorks.ui.main.MainActivity;
import ru.javabreeze.mvpmindorks.R;
import ru.javabreeze.mvpmindorks.data.DataManager;
import ru.javabreeze.mvpmindorks.ui.base.BaseActivity;
import ru.javabreeze.mvpmindorks.utils.CommonUtils;

public class LoginActivity extends BaseActivity implements LoginMvpView {

    private LoginPresenter mLoginPresenter;

    private EditText mEditTextEmail, mEditTextPassword;

    private Button mButton;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout
                .activity_login);

        DataManager dataManager = ((MvpApp) getApplication()).getDataManager();
        mLoginPresenter = new LoginPresenter(dataManager);
        mLoginPresenter.onAttach(this);
        mEditTextEmail = binding.email;
        mEditTextPassword = binding.password;
        mButton = binding.button;
        mButton.setOnClickListener(view -> onLoginButtonClick());
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        finish();
    }

    @Override
    public void onLoginButtonClick() {
        String emailId = mEditTextEmail.getText().toString();
        String password = mEditTextPassword.getText().toString();

        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show();
            return;
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show();
            return;
        }

        mLoginPresenter.startLogin(emailId);
    }

}

package ru.javabreeze.mvpmindorks.utils;

import android.text.TextUtils;

public class CommonUtils {

    public static boolean isEmailValid(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}

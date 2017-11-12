package ru.javabreeze.mvpmindorks.data.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

/**.
 * Created by Алексей on 11.11.2017.
 */

public class SharedPrefsHelper {

    private static final String MY_PREFS = "MY_PREFS";

    private static final String EMAIL = "EMAIL";
    private static final String IS_LOGGED_IN = "IS_LOGGED_IN";

    private SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, Context.MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    @Nullable
    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean(IS_LOGGED_IN, false);
    }

    public void setLoggedInMode(boolean isLoggedIn) {
        mSharedPreferences.edit().putBoolean(IS_LOGGED_IN, isLoggedIn).apply();
    }
}

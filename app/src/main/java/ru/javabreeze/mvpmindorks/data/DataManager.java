package ru.javabreeze.mvpmindorks.data;

import ru.javabreeze.mvpmindorks.data.model.SharedPrefsHelper;

/**.
 * Created by Алексей on 11.11.2017.
 */

public class DataManager {

    private SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper sharedPrefsHelper) {
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.clear();
    }

    public void saveEmailId(String email) {
        mSharedPrefsHelper.putEmail(email);
    }

    public String getEmailId() {
        return mSharedPrefsHelper.getEmail();
    }

    public void setLoggedIn() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }

    public boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }
}

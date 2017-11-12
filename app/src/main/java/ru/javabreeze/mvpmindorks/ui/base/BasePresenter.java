package ru.javabreeze.mvpmindorks.ui.base;

import ru.javabreeze.mvpmindorks.data.DataManager;

/**
 * Base class for all presenter that implements MvpPresenter and it is extended by all other
 * presenters there in application
 * Created by Алексей on 11.11.2017.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;
    private DataManager mDataManager;

    public BasePresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }

    public V getMvpView() {
        return mMvpView;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }
}

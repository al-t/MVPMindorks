package ru.javabreeze.mvpmindorks.ui.base;

import ru.javabreeze.mvpmindorks.ui.base.MvpView;

/**
 * Interface that is implemented by BasePresenter, it acts as base presenter interface that is
 * extended by all other presenter interfaces.
 * Created by Алексей on 11.11.2017.
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);
}

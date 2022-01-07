package com.oct.ipcam.main;

import com.oct.ipcam.BasePresenter;
import com.oct.ipcam.BaseView;

public class MainContract {
    interface View extends BaseView<Presenter> {
        void showInfo(String url, int protocol_status);
    }

    interface Presenter extends BasePresenter {
    }
}

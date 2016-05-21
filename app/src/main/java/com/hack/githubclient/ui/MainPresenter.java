package com.hack.githubclient.ui;


import android.util.Log;

import com.hack.githubclient.Constants;
import com.hack.githubclient.LocalPersistent;
import com.hack.githubclient.di.scope.PerActivity;
import com.hack.githubclient.serivce.ApiService;
import com.hack.githubclient.ui.base.BasePresenter;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

@PerActivity
public class MainPresenter extends BasePresenter<MainActivity> {

    private ApiService apiService;
    private LocalPersistent localPersistent;

    @Inject
    public MainPresenter(ApiService apiService, LocalPersistent localPersistent) {
        this.apiService = apiService;
        this.localPersistent = localPersistent;
    }

    public void getUser() {
        mView.showUser(localPersistent.getUser());
    }

    public void userLogin(String username, String password) {
        apiService.getUserInfo(username, Constants.CLIENT_ID, Constants.CLIENT_SECRET)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(user -> {
                    localPersistent.setUser(user);
                    mView.showUser(user);
                }, throwable -> {
                    Log.e("xxx", "throw=" + throwable.getMessage());
                });
    }
}

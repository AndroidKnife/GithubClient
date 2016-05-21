package com.hack.githubclient.ui;

import android.app.Application;

import com.hack.githubclient.di.scope.PerActivity;
import com.hack.githubclient.ui.base.BasePresenter;
import com.hack.githubclient.ui.base.MVPView;

import javax.inject.Inject;

/**
 * Created by Asuka on 16/5/21.
 */
@PerActivity
public class LoginPresenter extends BasePresenter<LoginActivity> {


    @Inject
    public LoginPresenter() {
    }

    public void fetchTitle() {
        mView.showTitle("hoaiaiaiaiai");
    }
}

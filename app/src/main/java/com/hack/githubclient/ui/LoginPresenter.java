package com.hack.githubclient.ui;


import android.text.TextUtils;
import android.widget.Toast;

import com.hack.githubclient.di.scope.PerActivity;
import com.hack.githubclient.serivce.ApiService;
import com.hack.githubclient.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Asuka on 16/5/21.
 */
@PerActivity
public class LoginPresenter extends BasePresenter<LoginActivity> {

    private ApiService apiService;

    @Inject
    public LoginPresenter(ApiService apiService) {
        this.apiService = apiService;
    }

    public void userLogin(String username,String password){
        if(TextUtils.isEmpty(username)){
            mView.showError("请输入用户名");
            return;
        }
        if(TextUtils.isEmpty(password)){
            mView.showError("请输入密码");
            return;
        }
    }
}

package com.hack.githubclient.ui;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.hack.githubclient.R;
import com.hack.githubclient.ui.base.BaseActivityView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by Asuka on 16/5/21.
 */
public class LoginActivity extends BaseActivityView<LoginPresenter> {

    @BindView(R.id.edit_username)
    EditText mEditUsername;

    @BindView(R.id.edit_password)
    EditText mEditPassword;
    @BindView(R.id.tips)
    CoordinatorLayout coordinatorLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void injectComponent() {
        getActivityComponent().inject(this);
    }

    @OnClick(R.id.btn_login)
    public void login(){
        mPresenter.userLogin(mEditUsername.getText().toString(), mEditPassword.getText().toString());
    }

    public void showError(String messgae) {
//        Snackbar.make(coordinatorLayout,messgae,Snackbar.LENGTH_SHORT).show();
        Toast.makeText(this,messgae,Toast.LENGTH_SHORT).show();
    }

}

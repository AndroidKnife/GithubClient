package com.hack.githubclient.ui.base;

import android.os.Bundle;

import com.hack.githubclient.AppApplication;
import com.hack.githubclient.di.component.ActivityComponent;
import com.hack.githubclient.di.component.DaggerActivityComponent;
import com.hack.githubclient.di.modules.ActivityModule;

import javax.inject.Inject;

/**
 * Created by Asuka on 16/5/21.
 */

public abstract class BaseActivityView<P extends BasePresenter> extends BaseActivity implements MVPView<P>{

    private ActivityComponent mActivityComponer;
    @Inject
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectComponent();
        mPresenter.attachView(this);
    }

    protected ActivityComponent getActivityComponent(){
        if(mActivityComponer == null){
            mActivityComponer = DaggerActivityComponent.builder()
                    .applicationComponent(((AppApplication)getApplication()).getApplicationComponent())
                    .activityModule(new ActivityModule(this)).build();
        }
        return mActivityComponer;
    }

    protected abstract void injectComponent();

    @Override
    public void setPresenter(P presenter) {
        mPresenter = presenter;
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDestroy();
        super.onDestroy();
    }
}
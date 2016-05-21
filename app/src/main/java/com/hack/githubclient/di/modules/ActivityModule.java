package com.hack.githubclient.di.modules;

import android.app.Activity;

import com.hack.githubclient.di.scope.PerActivity;
import com.hack.githubclient.ui.base.BasePresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    public String provideStr() {
        return "aaaaa";
    }

    @Provides
    @PerActivity
    public Activity provideActivity(){
        return this.activity;
    }
}

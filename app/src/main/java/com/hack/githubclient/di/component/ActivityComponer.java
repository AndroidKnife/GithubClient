package com.hack.githubclient.di.component;

import android.app.Activity;

import com.hack.githubclient.di.modules.ActivityModule;
import com.hack.githubclient.ui.LoginActivity;

import dagger.Component;

/**
 * Created by Asuka on 16/5/21.
 */
@Component(modules = {ActivityModule.class})
public interface ActivityComponer {

    void inject(LoginActivity activity);

}

package com.hack.githubclient.di.component;

import android.app.Activity;

import com.hack.githubclient.di.modules.ActivityModule;
import com.hack.githubclient.di.scope.PerActivity;
import com.hack.githubclient.ui.LoginActivity;

import dagger.Component;

/**
 * Created by Asuka on 16/5/21.
 */
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class})
@PerActivity
public interface ActivityComponent {

    void inject(LoginActivity activity);

}

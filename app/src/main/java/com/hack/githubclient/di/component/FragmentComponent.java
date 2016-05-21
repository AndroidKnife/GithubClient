package com.hack.githubclient.di.component;

import com.hack.githubclient.di.modules.FragmentModule;
import com.hack.githubclient.di.scope.PerFragment;

import dagger.Component;

@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = {FragmentModule.class})
public class FragmentComponent {
}
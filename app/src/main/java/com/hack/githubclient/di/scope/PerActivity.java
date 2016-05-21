package com.hack.githubclient.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Asuka on 16/5/21.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {}

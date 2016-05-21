package com.hack.githubclient.ui.base;

/**
 * Created by Asuka on 16/5/21.
 */

public abstract class BasePresenter<V extends MVPView> {

   protected  V mView;

    public void attachView(V mView) {
        this.mView = mView;
    }

   public void onDestroy(){}

}

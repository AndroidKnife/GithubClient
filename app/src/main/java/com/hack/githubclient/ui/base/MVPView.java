package com.hack.githubclient.ui.base;

/**
 * Created by Asuka on 16/5/21.
 */
public interface MVPView<P extends BasePresenter> {

    public void setPresenter(P presenter);

}

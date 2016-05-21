package com.hack.githubclient.api.entity;

/**
 * Created by hwangjr on 5/21/16.
 */
public class OAuth {
    public String access_token;
    public String expires_in;
    public String refresh_token;
    public String sessionID;

    @Override
    public String toString() {
        return super.toString() + " access_token=" + access_token;
    }
}

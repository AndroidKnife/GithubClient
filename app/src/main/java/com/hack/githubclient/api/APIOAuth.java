package com.hack.githubclient.api;

import com.hack.githubclient.api.entity.OAuth;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

public interface APIOAuth {

    @POST("/oauth2/access_token?format=json")
    Observable<OAuth> fetchOAuth(
            @Query("app_key") String app_key,
            @Query("app_secret") String app_secret,
            @Query("grant_type") String grant_type,
            @Query("refresh_token") String refresh_token);

    @POST("/oauth2/access_token?format=json")
    Observable<OAuth> login(
            @Query("app_key") String app_key,
            @Query("app_secret") String app_secret,
            @Query("grant_type") String grant_type,
            @Query("username") String username,
            @Query("password") String password);
}
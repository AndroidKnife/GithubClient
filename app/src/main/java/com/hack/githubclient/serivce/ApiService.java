package com.hack.githubclient.serivce;

import com.hack.githubclient.entity.Repos;
import com.hack.githubclient.entity.User;

import java.util.ArrayList;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Asuka on 16/5/21.
 */

public interface ApiService {

    @POST("login")
    Observable login(@Query("user_name") String username, @Query("password") String password);

    @GET("/users/{username}")
    Observable<User> getUserInfo(@Path("username") String username, @Query("client_id") String clientId, @Query("client_secret") String clientSecret);

    @GET("/users/{username}/repos")
    Observable<ArrayList<Repos>> getUserRepos(@Path("username") String username, @Query("client_id") String clientId, @Query("client_secret") String clientSecret);
}
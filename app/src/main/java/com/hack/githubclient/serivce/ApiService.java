package com.hack.githubclient.serivce;

import java.util.Observable;

import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Asuka on 16/5/21.
 */

public interface ApiService {

    @POST("login")
    Observable login(@Query("user_name") String username, @Query("password") String password);
}

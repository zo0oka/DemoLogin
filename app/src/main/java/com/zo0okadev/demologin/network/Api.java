package com.zo0okadev.demologin.network;

import com.zo0okadev.demologin.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("mobileapplication/login.aspx")
    Call<LoginResponse> loginUser(@Query("user") String user, @Query("pass") String password);

}

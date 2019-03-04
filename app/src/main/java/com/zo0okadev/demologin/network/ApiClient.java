package com.zo0okadev.demologin.network;

import com.zo0okadev.demologin.model.LoginResponse;

import java.io.IOException;

import androidx.annotation.NonNull;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static final String BASE_URL = "http://zewailschool.com/";
    private static Api sInstance = null;

    public static Api getInstance() {

        if (sInstance == null) {

            // For logging
            HttpLoggingInterceptor loggingInterceptor =
                    new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);


            // Building OkHttp client
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .build();

            // Retrofit Builder
            Retrofit.Builder builder =
                    new Retrofit
                            .Builder()
                            .baseUrl(BASE_URL)
                            .client(client)
                            .addConverterFactory(GsonConverterFactory.create());

            sInstance = builder.build().create(Api.class);

        }

        return sInstance;
    }

    public static void getLoginResponse(Api service, String user, String password, final StatusCallback statusCallback) {
        service.loginUser(user, password).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(@NonNull Call<LoginResponse> call, @NonNull Response<LoginResponse> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        statusCallback.onSuccess(response.body());
                    } else {
                        statusCallback.onError("User not found.");
                    }
                } else {
                    try {
                        String errorBody = response.errorBody() != null ? response.errorBody().string() : null;
                        statusCallback.onError(errorBody != null ? errorBody : "Unknown error.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

            @Override
            public void onFailure(@NonNull Call<LoginResponse> call, @NonNull Throwable t) {
                statusCallback.onError(t.getMessage() != null ? t.getMessage() : "Unknown error");
            }
        });
    }

    public interface StatusCallback {
        void onSuccess(LoginResponse loginResponse);

        void onError(String error);
    }
}

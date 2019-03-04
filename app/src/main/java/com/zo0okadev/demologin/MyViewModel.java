package com.zo0okadev.demologin;


import com.zo0okadev.demologin.model.LoginResponse;
import com.zo0okadev.demologin.network.Api;
import com.zo0okadev.demologin.network.ApiClient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private final MutableLiveData<LoginResponse> loginResponseLiveData;
    private final MutableLiveData<String> errorMessage;
    private Api api;


    public MyViewModel() {
        errorMessage = new MutableLiveData<>();
        loginResponseLiveData = new MutableLiveData<>();
        api = ApiClient.getInstance();
    }

    public void loginUser(String user, String password) {

        ApiClient.getLoginResponse(api, user, password, new ApiClient.StatusCallback() {
            @Override
            public void onSuccess(LoginResponse loginResponse) {
                loginResponseLiveData.postValue(loginResponse);
            }

            @Override
            public void onError(String error) {
                errorMessage.postValue(error);
            }
        });

    }

    public LiveData<LoginResponse> getLoginResponse() {
        return loginResponseLiveData;
    }

    public LiveData<String> getError() {
        return errorMessage;
    }
}

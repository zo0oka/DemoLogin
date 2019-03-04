package com.zo0okadev.demologin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.zo0okadev.demologin.model.LoginResponse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


public class MainActivity extends AppCompatActivity {

    private MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewModel.loginUser("2", "AsdEwq");
            }
        });

        myViewModel.getLoginResponse().observe(this, new Observer<LoginResponse>() {
            @Override
            public void onChanged(LoginResponse loginResponse) {
                TextView textView = findViewById(R.id.my_text_view);
                Gson gson = new Gson();
                String string = "Student: " + gson.toJson(loginResponse.getStudent())
                        + "\n\n\n\n\n" + "User: " + gson.toJson(loginResponse.getUser());
                textView.setText(string);
            }
        });

        myViewModel.getError().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }
        });

    }
}

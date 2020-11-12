package com.arnaudlcelestino.Tbbt_Quizz.controller;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.arnaudlcelestino.The_Big_Bang_Theory_Quiz.R;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getApplicationContext(), com.arnaudlcelestino.Tbbt_Quizz.controller.MainActivity.class);
                startActivity(intent);
                finish();
            }
        };

        new Handler().postDelayed(runnable, 3000);
    }
}
package com.example.sistempakardaihatsuayla.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempakardaihatsuayla.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000); // Waktu Pnding 3 Detik
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }finally {
                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                    finish();
                }
            }
        });
        thread.start();
    }
}
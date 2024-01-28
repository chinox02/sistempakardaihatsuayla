package com.example.sistempakardaihatsuayla.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempakardaihatsuayla.R;

public class DataKerusakanActivity extends AppCompatActivity {

    View busi, injektor, premature, ac, rem, overheat, transmisi, accu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kerusakan);

        busi       = findViewById(R.id.busi);
        premature     = findViewById(R.id.premature);
        injektor    = findViewById(R.id.injektor);
        ac        = findViewById(R.id.ac);
        accu        = findViewById(R.id.accu);
        rem      = findViewById(R.id.rem);
        overheat        = findViewById(R.id.overheat);
        transmisi      = findViewById(R.id.transmisi);

        setEvent();
    }

    private void setEvent() {
        busi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan1.class));
            }
        });

        injektor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan2.class));
            }
        });

        premature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan3.class));
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan4.class));
            }
        });

        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan5.class));
            }
        });

        overheat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan6.class));
            }
        });

        transmisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), kerusakan7.class));
            }
        });

        accu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AccuActivity.class));
            }
        });

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(DataKerusakanActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
        }

}
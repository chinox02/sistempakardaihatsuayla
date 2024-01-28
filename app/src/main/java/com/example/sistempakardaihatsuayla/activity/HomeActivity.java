package com.example.sistempakardaihatsuayla.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.sistempakardaihatsuayla.R;
import com.example.sistempakardaihatsuayla.fragment.BantuanFragment;
import com.example.sistempakardaihatsuayla.fragment.BerandaFragment;
import com.example.sistempakardaihatsuayla.fragment.TentangFragment;

public class HomeActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;

    View beranda, bantuan, tentang;
    ImageView imgBeranda, imgBantuan, imgTentang;
    TextView textBeranda, textBantuan, textTentang;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        beranda            = findViewById(R.id.btn_beranda);
        bantuan            = findViewById(R.id.btn_bantuan);
        tentang            = findViewById(R.id.btn_tentang);
        imgBeranda         = findViewById(R.id.image_beranda);
        imgBantuan         = findViewById(R.id.image_bantuan);
        imgTentang         = findViewById(R.id.image_tentang);
        textBeranda        = findViewById(R.id.text_beranda);
        textBantuan        = findViewById(R.id.text_bantuan);
        textTentang        = findViewById(R.id.text_tentang);


        imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.homee));
        textBeranda.setTextColor(getResources().getColor(R.color.blue));
        setFragment(new BerandaFragment());
        setEventFragment();

    }

    private void setFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.transition, fragment);
        fragmentTransaction.commit();
    }

    private void setEventFragment() {
        beranda.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new BerandaFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.homee));
                imgBantuan.setImageDrawable(getResources().getDrawable(R.drawable.help));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.aboutt));

                textBeranda.setTextColor(getResources().getColor(R.color.blue));
                textBantuan.setTextColor(getResources().getColor(R.color.blue));
                textTentang.setTextColor(getResources().getColor(R.color.blue));
            }
        });

        bantuan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new BantuanFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.homee));
                imgBantuan.setImageDrawable(getResources().getDrawable(R.drawable.help));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.aboutt));


                textBeranda.setTextColor(getResources().getColor(R.color.blue));
                textBantuan.setTextColor(getResources().getColor(R.color.blue));
                textTentang.setTextColor(getResources().getColor(R.color.blue));
            }
        });


        tentang.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onClick(View v) {
                setFragment(new TentangFragment());
                imgBeranda.setImageDrawable(getResources().getDrawable(R.drawable.homee));
                imgBantuan.setImageDrawable(getResources().getDrawable(R.drawable.help));
                imgTentang.setImageDrawable(getResources().getDrawable(R.drawable.aboutt));


                textBeranda.setTextColor(getResources().getColor(R.color.blue));
                textBantuan.setTextColor(getResources().getColor(R.color.blue));
                textTentang.setTextColor(getResources().getColor(R.color.blue));
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
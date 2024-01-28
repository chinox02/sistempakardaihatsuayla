package com.example.sistempakardaihatsuayla;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempakardaihatsuayla.activity.HomeActivity;
import com.example.sistempakardaihatsuayla.fragment.BerandaFragment;

public class MainDiagnosaActivity extends AppCompatActivity {
    CheckBox ChckC1, ChckC2, ChckC3, ChckC4, ChckC5, ChckC6, ChckC7, ChckC8, ChckC9, ChckC10, ChckC11,
            ChckC12, ChckC13, ChckC14, ChckC15, ChckC16, ChckC17, ChckC18, ChckC19, ChckC20, ChckC21,
            ChckC22, ChckC23, ChckC24, ChckC25, ChckC26, ChckC27, ChckC28, ChckC29, ChckC30, ChckC31,

            ChckC32, ChckC33, ChckC34, ChckC35, ChckC36, ChckC37, ChckC38, ChckC39, ChckC40;

    ImageButton back;
    TextView hslDiagnosa, ketDiagnosa, kerusakanDiagnosa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diagnosa);
        ChckC1 = findViewById(R.id.checkBox1);
        ChckC2 = findViewById(R.id.checkBox2);
        ChckC3 = findViewById(R.id.checkBox3);
        ChckC4 = findViewById(R.id.checkBox4);
        ChckC5 = findViewById(R.id.checkBox5);
        ChckC6 = findViewById(R.id.checkBox6);
        ChckC7 = findViewById(R.id.checkBox7);
        ChckC8 = findViewById(R.id.checkBox8);
        ChckC9 = findViewById(R.id.checkBox9);
        ChckC10 = findViewById(R.id.checkBox10);
        ChckC11 = findViewById(R.id.checkBox11);
        ChckC12 = findViewById(R.id.checkBox12);
        ChckC13 = findViewById(R.id.checkBox13);
        ChckC14 = findViewById(R.id.checkBox14);
        ChckC15 = findViewById(R.id.checkBox15);
        ChckC16 = findViewById(R.id.checkBox16);
        ChckC17 = findViewById(R.id.checkBox17);
        ChckC18 = findViewById(R.id.checkBox18);
        ChckC19 = findViewById(R.id.checkBox19);
        ChckC20 = findViewById(R.id.checkBox20);
        ChckC21 = findViewById(R.id.checkBox21);
        ChckC22 = findViewById(R.id.checkBox22);
        ChckC23 = findViewById(R.id.checkBox23);
        ChckC24 = findViewById(R.id.checkBox24);
        ChckC25 = findViewById(R.id.checkBox25);
        ChckC26 = findViewById(R.id.checkBox26);
        ChckC27 = findViewById(R.id.checkBox27);
        ChckC28 = findViewById(R.id.checkBox28);
        ChckC29 = findViewById(R.id.checkBox29);
        ChckC30 = findViewById(R.id.checkBox30);
        ChckC31 = findViewById(R.id.checkBox31);
        ChckC32 = findViewById(R.id.checkBox32);
        ChckC33 = findViewById(R.id.checkBox33);
        ChckC34 = findViewById(R.id.checkBox34);
        ChckC35 = findViewById(R.id.checkBox35);
        ChckC36 = findViewById(R.id.checkBox36);
        ChckC37 = findViewById(R.id.checkBox37);
        ChckC38 = findViewById(R.id.checkBox38);
        ChckC39 = findViewById(R.id.checkBox39);
        ChckC40 = findViewById(R.id.checkBox40);

        hslDiagnosa = findViewById(R.id.hasilDiagnosa);
        ketDiagnosa = findViewById(R.id.ketDiagnosa);
        kerusakanDiagnosa = findViewById(R.id.kerusakanDiagnosa);

        kerusakanDiagnosa.setText("Kerusakan :");
        hslDiagnosa.setText("0%");
        ketDiagnosa.setText("Keterangan");

        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDiagnosaActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

    public void prosesDiagnosa(View view) {
        
        double G01 = 0.9;
        double G02 = 0.9;
        double G03 = 0.9;
        double G04 = 0.8;
        double G05 = 0.8;
        double G06 = 0.8;
        double G07 = 0.9;
        double G08 = 0.9;
        double G09 = 0.9;
        double G010 = 0.8;
        double G011 = 0.8;
        double G012 = 0.8;
        double G013 = 0.9;
        double G014 = 0.9;
        double G015 = 0.9;
        double G016 = 0.8;
        double G017 = 0.8;
        double G018 = 0.8;
        double G019 = 0.9;
        double G020 = 0.9;
        double G021 = 0.9;
        double G022 = 0.8;
        double G023 = 0.8;
        double G024 = 0.8;
        double G025 = 0.9;
        double G026 = 0.9;
        double G027 = 0.9;
        double G028 = 0.8;
        double G029 = 0.8;
        double G030 = 0.8;
        double G031 = 0.9;
        double G032 = 0.9;
        double G033 = 0.9;
        double G034 = 0.8;
        double G035 = 0.8;
        double G036 = 0.8;
        double G037 = 0.9;
        double G038 = 0.9;
        double G039 = 0.9;
        double G040 = 0.8;

        //Daftar Kerusakan
        String kerusakan1 = "Busi";
        String kerusakan2 = "Injector Bermasalah";
        String kerusakan3 = "Premature Ignition";
        String kerusakan4 = "Kerusakan AC / Freon Habis";
        String kerusakan5 = "Rem";
        String kerusakan6 = "Mesin Overheat";
        String kerusakan7 = "Transmisi";
        String kerusakan8 = "Accu & Engine Mounting";

        //Daftar Solusi Kerusakan
        String solker1= "Sebaiknya busi nya di ganti dengan yang baru sesuai dengan spesifikasi yang direkomendasikan oleh pabrikan mobil anda";

        String solker2 = "Lakukan pembersihan Injektor, dengan menggunakan cairan pembersih injektor";

        String solker3 = "Lakukan Penyesuaian Pengaturan Waktu Pengapian. Namun jika masalah tetap terjadi setelah penyesuaian waktu pengapian, maka perlu dilakukan pemeriksaan lebih lanjut oleh mekanik yang berpengalaman untuk menemukan akar peneyebab masalah tersebut";

        String solker4 = "Periksa kebocoran, isi ulang refrigen, atau perbaiki komponen AC yang rusak";

        String solker5 = "Periksa dan ganti kampas rem atau komponen rem yang rusak, lakukan pemeriksaan pada sistem rem untuk memastikan berfungsi dengan baik.";

        String solker6 = "Cek sistem pendingin pada mobil, cek tingkat cairan pendingin dan lakukan perbaikan pada radiator atau kipas pendingin.";

        String solker7 = "Periksa dan perbaiki transmisi, ganti cairan transmisi, atau lakukan penggantian komponen transmisi yang rusak jika diperlukan.";

        String solker8 = "Kerusakan Accu (Aki)  jika tegangan aki terlalu rendah maka aki perlu diganti sesusai dengan ukuran dan kapasitas yang di rekomendasikan oleh pabrikan mobil. Kerusakan Engine mounting (Baut Mesin) perlu di ganti dan membutuhkan alat khusus serta keahlian mekanik yang sesuai untuk melakukan penggantian engine mounting (Baut Mesin)";

        //RULE KERUSAKAN 1
        if (ChckC1.isChecked() && ChckC2.isChecked() && ChckC3.isChecked() && ChckC4.isChecked() && ChckC5.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G01 + G02 + G03 + G04 + G05;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG01 = G01 / totalProbabilities;
            double normalizedG02 = G02 / totalProbabilities;
            double normalizedG03 = G03 / totalProbabilities;
            double normalizedG04 = G04 / totalProbabilities;
            double normalizedG05 = G05 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG01 = normalizedG01;
            double conditionalProbabilityG02 = normalizedG02;
            double conditionalProbabilityG03 = normalizedG03;
            double conditionalProbabilityG04 = normalizedG04;
            double conditionalProbabilityG05 = normalizedG05;

            // Hitung nilai Bayes
            double bayesG01 = conditionalProbabilityG01 * G01;
            double bayesG02 = conditionalProbabilityG02 * G02;
            double bayesG03 = conditionalProbabilityG03 * G03;
            double bayesG04 = conditionalProbabilityG04 * G04;
            double bayesG05 = conditionalProbabilityG05 * G05;

            double bayess = bayesG01 + bayesG02 + bayesG03 + bayesG04 + bayesG05;

            // Mencari nilai P
            double PH1 = G01 * bayesG01 / bayess;
            double PH2 = G02 * bayesG02 / bayess;
            double PH3 = G03 * bayesG03 / bayess;
            double PH4 = G04 * bayesG04 / bayess;
            double PH5 = G05 * bayesG05 / bayess;

            // Jumlahkan nilai P
            double PH = PH1 + PH2 + PH3 + PH4 + PH5;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker1);
            kerusakanDiagnosa.setText(kerusakan1);
        }

        //kerusakan 2
        else if (ChckC6.isChecked() && ChckC6.isChecked() && ChckC8.isChecked() && ChckC9.isChecked() && ChckC10.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G06 + G07 + G08 + G09 + G010;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG06 = G06 / totalProbabilities;
            double normalizedG07 = G07 / totalProbabilities;
            double normalizedG08 = G08 / totalProbabilities;
            double normalizedG09 = G09 / totalProbabilities;
            double normalizedG010 = G010 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG06 = normalizedG06;
            double conditionalProbabilityG07 = normalizedG07;
            double conditionalProbabilityG08 = normalizedG08;
            double conditionalProbabilityG09 = normalizedG09;
            double conditionalProbabilityG010 = normalizedG010;

            // Hitung nilai Bayes
            double bayesG06 = conditionalProbabilityG06 * G06;
            double bayesG07 = conditionalProbabilityG07 * G07;
            double bayesG08 = conditionalProbabilityG08 * G08;
            double bayesG09 = conditionalProbabilityG09 * G09;
            double bayesG010 = conditionalProbabilityG010 * G010;

            double bayess = bayesG06 + bayesG07 + bayesG08 + bayesG09 + bayesG010;

            // Mencari nilai P
            double PH6 = G06 * bayesG06 / bayess;
            double PH7 = G07 * bayesG07 / bayess;
            double PH8 = G08 * bayesG08 / bayess;
            double PH9 = G09 * bayesG09 / bayess;
            double PH10 = G010 * bayesG010 / bayess;

            // Jumlahkan nilai P
            double PH = PH6 + PH7 + PH8 + PH9 + PH10;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker2);
            kerusakanDiagnosa.setText(kerusakan2);
        }

        //kerusakan 3
        else if (ChckC11.isChecked() && ChckC12.isChecked() && ChckC13.isChecked() && ChckC14.isChecked() && ChckC15.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G011 + G012 + G013 + G014 + G015;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG012 = G012 / totalProbabilities;
            double normalizedG013 = G013 / totalProbabilities;
            double normalizedG014 = G014 / totalProbabilities;
            double normalizedG015 = G015 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG012 = normalizedG012;
            double conditionalProbabilityG013 = normalizedG013;
            double conditionalProbabilityG014 = normalizedG014;
            double conditionalProbabilityG015 = normalizedG015;

            // Hitung nilai Bayes
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG012 = conditionalProbabilityG012 * G012;
            double bayesG013 = conditionalProbabilityG013 * G013;
            double bayesG014 = conditionalProbabilityG014 * G014;
            double bayesG015 = conditionalProbabilityG015 * G015;

            double bayess = bayesG011 + bayesG012 + bayesG013 + bayesG014 + bayesG015;

            // Mencari nilai P
            double PH11 = G011 * bayesG011 / bayess;
            double PH12 = G012 * bayesG012 / bayess;
            double PH13 = G013 * bayesG013 / bayess;
            double PH14 = G014 * bayesG014 / bayess;
            double PH15 = G015 * bayesG015 / bayess;

            // Jumlahkan nilai P
            double PH = PH11 + PH12 + PH13 + PH14 + PH15;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker3);
            kerusakanDiagnosa.setText(kerusakan3);
        }

        //kerusakan 4
        else if (ChckC16.isChecked() && ChckC17.isChecked() && ChckC18.isChecked() && ChckC19.isChecked() && ChckC20.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G016 + G017 + G018 + G019 + G020;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG016 = G016 / totalProbabilities;
            double normalizedG017 = G017 / totalProbabilities;
            double normalizedG018 = G018 / totalProbabilities;
            double normalizedG019 = G019 / totalProbabilities;
            double normalizedG020 = G020 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG016 = normalizedG016;
            double conditionalProbabilityG017 = normalizedG017;
            double conditionalProbabilityG018 = normalizedG018;
            double conditionalProbabilityG019 = normalizedG019;
            double conditionalProbabilityG020 = normalizedG020;

            // Hitung nilai Bayes
            double bayesG016 = conditionalProbabilityG016 * G016;
            double bayesG017 = conditionalProbabilityG017 * G017;
            double bayesG018 = conditionalProbabilityG018 * G018;
            double bayesG019 = conditionalProbabilityG019 * G019;
            double bayesG020 = conditionalProbabilityG020 * G020;

            double bayess = bayesG016 + bayesG017 + bayesG018 + bayesG019 + bayesG020;

            // Mencari nilai P
            double PH16 = G016 * bayesG016 / bayess;
            double PH17 = G017 * bayesG017 / bayess;
            double PH18 = G018 * bayesG018 / bayess;
            double PH19 = G019 * bayesG019 / bayess;
            double PH20 = G020 * bayesG020 / bayess;

            // Jumlahkan nilai P
            double PH = PH16 + PH17 + PH18 + PH19 + PH20;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker4);
            kerusakanDiagnosa.setText(kerusakan4);
        }

        //kerusakan 5
        else if (ChckC21.isChecked() && ChckC22.isChecked() && ChckC23.isChecked() && ChckC24.isChecked() && ChckC25.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G021 + G022 + G023 + G024 + G025;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG021 = G021 / totalProbabilities;
            double normalizedG022 = G022 / totalProbabilities;
            double normalizedG023 = G023 / totalProbabilities;
            double normalizedG024 = G024 / totalProbabilities;
            double normalizedG025 = G025 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG021 = normalizedG021;
            double conditionalProbabilityG022 = normalizedG022;
            double conditionalProbabilityG023 = normalizedG023;
            double conditionalProbabilityG024 = normalizedG024;
            double conditionalProbabilityG025 = normalizedG025;

            // Hitung nilai Bayes
            double bayesG021 = conditionalProbabilityG021 * G021;
            double bayesG022 = conditionalProbabilityG022 * G022;
            double bayesG023 = conditionalProbabilityG023 * G023;
            double bayesG024 = conditionalProbabilityG024 * G024;
            double bayesG025 = conditionalProbabilityG025 * G025;

            double bayess = bayesG021 + bayesG022 + bayesG023 + bayesG024 + bayesG025;

            // Mencari nilai P
            double PH21 = G021 * bayesG021 / bayess;
            double PH22 = G022 * bayesG022 / bayess;
            double PH23 = G023 * bayesG023 / bayess;
            double PH24 = G024 * bayesG024 / bayess;
            double PH25 = G025 * bayesG025 / bayess;

            // Jumlahkan nilai P
            double PH = PH21 + PH22 + PH23 + PH24 + PH25;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker5);
            kerusakanDiagnosa.setText(kerusakan5);
        }

        //kerusakan 6
        else if (ChckC26.isChecked() && ChckC27.isChecked() && ChckC28.isChecked() && ChckC29.isChecked() && ChckC30.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G026 + G027 + G028 + G029 + G030;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG026 = G026 / totalProbabilities;
            double normalizedG027 = G027 / totalProbabilities;
            double normalizedG028 = G028 / totalProbabilities;
            double normalizedG029 = G029 / totalProbabilities;
            double normalizedG030 = G030 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG026 = normalizedG026;
            double conditionalProbabilityG027 = normalizedG027;
            double conditionalProbabilityG028 = normalizedG028;
            double conditionalProbabilityG029 = normalizedG029;
            double conditionalProbabilityG030 = normalizedG030;

            // Hitung nilai Bayes
            double bayesG026 = conditionalProbabilityG026 * G026;
            double bayesG027 = conditionalProbabilityG027 * G027;
            double bayesG028 = conditionalProbabilityG028 * G028;
            double bayesG029 = conditionalProbabilityG029 * G029;
            double bayesG030 = conditionalProbabilityG030 * G030;

            double bayess = bayesG026 + bayesG027 + bayesG028 + bayesG029 + bayesG030;

            // Mencari nilai P
            double PH26 = G026 * bayesG026 / bayess;
            double PH27 = G027 * bayesG027 / bayess;
            double PH28 = G028 * bayesG028 / bayess;
            double PH29 = G029 * bayesG029 / bayess;
            double PH30 = G030 * bayesG030 / bayess;

            // Jumlahkan nilai P
            double PH = PH26 + PH27 + PH28 + PH29 + PH30;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker6);
            kerusakanDiagnosa.setText(kerusakan6);
        }

        //kerusakan 7
        else if (ChckC31.isChecked() && ChckC32.isChecked() && ChckC33.isChecked() && ChckC34.isChecked() && ChckC35.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G031 + G032 + G033 + G034 + G035;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG031 = G031 / totalProbabilities;
            double normalizedG032 = G032 / totalProbabilities;
            double normalizedG033 = G033 / totalProbabilities;
            double normalizedG034 = G034 / totalProbabilities;
            double normalizedG035 = G035 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG031 = normalizedG031;
            double conditionalProbabilityG032 = normalizedG032;
            double conditionalProbabilityG033 = normalizedG033;
            double conditionalProbabilityG034 = normalizedG034;
            double conditionalProbabilityG035 = normalizedG035;

            // Hitung nilai Bayes
            double bayesG031 = conditionalProbabilityG031 * G031;
            double bayesG032 = conditionalProbabilityG032 * G032;
            double bayesG033 = conditionalProbabilityG033 * G033;
            double bayesG034 = conditionalProbabilityG034 * G034;
            double bayesG035 = conditionalProbabilityG035 * G035;

            double bayess = bayesG031 + bayesG032 + bayesG033 + bayesG034 + bayesG035;

            // Mencari nilai P
            double PH31 = G031 * bayesG031 / bayess;
            double PH32 = G032 * bayesG032 / bayess;
            double PH33 = G033 * bayesG033 / bayess;
            double PH34 = G034 * bayesG034 / bayess;
            double PH35 = G035 * bayesG035 / bayess;

            // Jumlahkan nilai P
            double PH = PH31 + PH32 + PH33 + PH34 + PH35;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker7);
            kerusakanDiagnosa.setText(kerusakan7);
        }

        //kerusakan 8
        else if (ChckC36.isChecked() && ChckC37.isChecked() && ChckC38.isChecked() && ChckC39.isChecked() && ChckC40.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G036 + G037 + G038 + G039 + G040;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG036 = G036 / totalProbabilities;
            double normalizedG037 = G037 / totalProbabilities;
            double normalizedG038 = G038 / totalProbabilities;
            double normalizedG039 = G039 / totalProbabilities;
            double normalizedG040 = G040 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG036 = normalizedG036;
            double conditionalProbabilityG037 = normalizedG037;
            double conditionalProbabilityG038 = normalizedG038;
            double conditionalProbabilityG039 = normalizedG039;
            double conditionalProbabilityG040 = normalizedG040;

            // Hitung nilai Bayes
            double bayesG036 = conditionalProbabilityG036 * G036;
            double bayesG037 = conditionalProbabilityG037 * G037;
            double bayesG038 = conditionalProbabilityG038 * G038;
            double bayesG039 = conditionalProbabilityG039 * G039;
            double bayesG040 = conditionalProbabilityG040 * G040;

            double bayess = bayesG036 + bayesG037 + bayesG038 + bayesG039 + bayesG040;

            // Mencari nilai P
            double PH36 = G036 * bayesG036 / bayess;
            double PH37 = G037 * bayesG037 / bayess;
            double PH38 = G038 * bayesG038 / bayess;
            double PH39 = G039 * bayesG039 / bayess;
            double PH40 = G040 * bayesG040 / bayess;

            // Jumlahkan nilai P
            double PH = PH36 + PH37 + PH38 + PH39 + PH40;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Format angka dalam bentuk string dengan dua desimal dan tambahkan simbol persen
            String formattedBayes = String.format("%.2f%%", bayesPercentage);

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            hslDiagnosa.setText(formattedBayes);
            ketDiagnosa.setText(solker8);
            kerusakanDiagnosa.setText(kerusakan8);
        }

        else{
            Toast.makeText(this, "Silahkan Isi Sesuai Aturan Diatas", Toast.LENGTH_SHORT).show();
            hslDiagnosa.setText("0%");
            ketDiagnosa.setText("Keterangan");
            kerusakanDiagnosa.setText("Keterangan");
        }

    }
}

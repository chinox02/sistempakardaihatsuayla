package com.example.sistempakardaihatsuayla;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistempakardaihatsuayla.activity.DataKerusakanActivity;
import com.example.sistempakardaihatsuayla.activity.HomeActivity;


public class hasil_deteksi extends AppCompatActivity {

    protected Cursor cursor;
    Database dbHelper;
    TextView final_result;
    TextView nama_penyakit;
    TextView solusi;
    private Database datapenyakit;
    private SQLiteDatabase db2;

    public hasil_deteksi() {
        db2 = null;
        datapenyakit = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_deteksi);

        dbHelper = new Database(this);
        datapenyakit = new Database(this);
        db2 = datapenyakit.getWritableDatabase();
        datapenyakit.createTable2(db2);
        datapenyakit.generateData2(db2);

        final_result = findViewById(R.id.final_result);
        TextView persen = findViewById(R.id.persen);
        TextView judul_keterangan = findViewById(R.id.textView5);
        nama_penyakit = findViewById(R.id.namapenyakit);
        solusi = findViewById(R.id.solusi);
        TextView penyakitnol = findViewById(R.id.penyakitnol);

        Button carisolusi = findViewById(R.id.btn_cari);
        Button Mulailagi = findViewById(R.id.btn_ulang);
        ImageView btn_back = findViewById(R.id.btn_back);

        cursor = this.dbHelper.getReadableDatabase().rawQuery("SELECT * FROM penyakit WHERE kode_penyakit = '"
                + getIntent().getStringExtra("nama")+"' ", null);
        cursor.moveToFirst();

        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            judul_keterangan.setVisibility(View.VISIBLE);
            carisolusi.setVisibility(View.VISIBLE);
            nama_penyakit.setText(cursor.getString(1).toString());
            solusi.setText(cursor.getString(2).toString());
            final_result.setText(getIntent().getStringExtra("namagejala"));
            persen.setText(getIntent().getStringExtra("persen"));

        }else{
            final_result.setText(getIntent().getStringExtra("namagejala"));
            final_result.setText("Tidak ada gejala yang dipilih");
            judul_keterangan.setVisibility(View.INVISIBLE);
            carisolusi.setVisibility(View.INVISIBLE);
        }
        penyakitnol.setText(getIntent().getStringExtra("namanol"));


        Mulailagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent gotomulailagi = new Intent(hasil_deteksi.this, KonsultasiAct.class);
                startActivity(gotomulailagi);
            }
        });

        carisolusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(hasil_deteksi.this, DataKerusakanActivity.class);
                startActivity(intent);
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(hasil_deteksi.this, KonsultasiAct.class);
                startActivity(gotohome);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            Intent intent = new Intent(hasil_deteksi.this, KonsultasiAct.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void onBackPressed() {

    }
}

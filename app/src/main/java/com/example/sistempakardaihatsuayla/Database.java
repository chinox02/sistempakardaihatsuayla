package com.example.sistempakardaihatsuayla;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "sistempakardaihatsuayla";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 5);
    }



    public void createTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS gejala");
        db.execSQL("CREATE TABLE if not exists gejala (id TEXT PRIMARY KEY, nama TEXT, " +
                "ya VARCHAR(5), tidak VARCHAR(5), mulai VARCHAR(5), selesai VARCHAR(5));");
    }

    public void createTable2(SQLiteDatabase db2) {
        db2.execSQL("DROP TABLE IF EXISTS penyakit");
        db2.execSQL("CREATE TABLE if not exists penyakit (kode_penyakit TEXT PRIMARY KEY , " +
                "nama_penyakit TEXT, solusi TEXT);");
    }

    public void generateData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        db.execSQL("INSERT INTO gejala VALUES ('G001','Mati mendadak ?', 'G003', 'G006', 'Y', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G002','Terdapat sisa pelumas pada kepala busi ?', 'P001', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G003','Terdapat kerak pada kepala busi ?', 'G004', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G004','Busi berwarna coklat / kemerahan ?', 'G005', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G005','Elektroda meleleh ?', 'G002', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G006','Idle kasar dan tidak langsam pada saat rpm rendah ?', 'G007', 'G011', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G007','Mesin tersendat saat gas diinjak ?', 'G008', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G008','Tenaga melemah saat akselerasi ?', 'G009', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G009','Akselerasi buruk dan konsumsi bbm boros ?', 'G010', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G010','Lampu indikator cek engine berkedip ?', 'P002', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G011','Suara mesin menggelitik ?', 'G012', 'G016', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G012','Tenaga mesin loyo ?', 'G013', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G013','Suara mesin mendesis ?', 'G014', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G014','Terdengar bunyi gluduk saat lepas gas ?', 'G015', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G015','Tiba tiba lost power ?', 'P003', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G016','Tidak ada hembusan angin pada AC ?', 'G017', 'G021', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G017','Extra fan tidak berputar ?', 'G018', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G018','Kipas ac tidak berputar ?', 'G019', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G019','Ac tiba tiba panas ?', 'G020', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G020','Indikator temperatur naik ?', 'P004', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G021','Rem bunyi saat diinjak ?', 'G022', 'G026', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G022','Rem mobil keras ?', 'G023', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G023','Rem mobil dalam ?', 'G024', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G024','Rem mobil terasa bergetar ?', 'G025', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G025','Rem macet ?', 'P005', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G026','Mesin mogok ?', 'G027', 'G031', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G027','Oli bercampur air ?', 'G028', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G028','Bau terbakar di area transmisi ?', 'G029', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G029','Bau mesin bau menyegat ?', 'G030', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G030','Tenaga mesin mendadak berkurang ?', 'P006', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G031','Terdengar bunyi dug dug saat melepas kopling ?', 'G032', 'G036', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G032','Gigi seperti mengunci ke atas ?', 'G033', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G033','Tombol overdrive aktif ?', 'G034', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G034','Telah masuk gigi mobil tidak mundur ?', 'G035', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G035','Sulit over gigi ?', 'P007', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G036','Starter tidak berfungsi ?', 'G037', 'B', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G037','Air aki keruh ?', 'G038', 'P008', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G038','Cranking kurang dari 10 volt ?', 'G039', 'P008', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G039','Terdengar bunyi kasar saat mesin distarter ?', 'G040', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G040','Bergetar saat kecepatan tinggi ?', 'P008', 'P008', 'T', 'T');");

        db.execSQL("INSERT INTO gejala VALUES ('P001','Kerusakan pada busi', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P002','Injektor bermasalah', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P003','Premature Ignition', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P004','Kerusakan AC / Freon Ac habis', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P005','Kerusakan rem', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P006','Mesin overloat', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P007','Kerusakan transmisi', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P008','Kerusakan Accu & engine mounting', '0', '0', 'T', 'Y');");



    }

    public void generateData2(SQLiteDatabase db2) {
        db2.execSQL("INSERT INTO penyakit VALUES ('P001','Kerusakan pada busi','Sebaiknya busi nya di ganti dengan yang baru sesuai dengan spesifikasi yang direkomendasikan oleh pabrikan mobil anda');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P002','Injektor bermasalah','Lakukan pembersihan Injektor, dengan menggunakan cairan pembersih injektor');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P003','Premature Ignition','Lakukan Penyesuaian Pengaturan Waktu Pengapian. Namun jika masalah tetap terjadi setelah penyesuaian waktu pengapian, maka perlu dilakukan pemeriksaan lebih lanjut oleh mekanik yang berpengalaman untuk menemukan akar peneyebab masalah tersebut');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P004','Kerusakan AC / Freon Ac habis','Periksa kebocoran, isi ulang refrigen, atau perbaiki komponen AC yang rusak');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P005','Kerusakan rem','Periksa dan ganti kampas rem atau komponen rem yang rusak, lakukan pemeriksaan pada sistem rem untuk memastikan berfungsi dengan baik.');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P006','Mesin overloat','cek sistem pendingin pada mobil, cek tingkat cairan pendingin dan lakukan perbaikan pada radiator atau kipas pendingin.');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P007','Kerusakan transmisi','Periksa dan perbaiki transmisi, ganti cairan transmisi, atau lakukan penggantian komponen transmisi yang rusak jika diperlukan.');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P008','Kerusakan Accu & engine mounting','kerusakan Accu (Aki)  jika tegangan aki terlalu rendah maka aki perlu diganti sesusai dengan ukuran dan kapasitas yang di rekomendasikan oleh pabrikan mobil.');");


    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void onCreate(SQLiteDatabase db) {

    }
}

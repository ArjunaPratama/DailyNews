package com.arjuna.dailynews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView judulnya, penulisnya, beritanya, tanggalnya;
    String judul, penulis, berita, tanggal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        judulnya = (TextView) findViewById(R.id.judulberita);
        penulisnya = (TextView) findViewById(R.id.penulisberita);
        beritanya = (TextView) findViewById(R.id.isiberita);
        tanggalnya = (TextView) findViewById(R.id.tanggalberita);
        Intent aa = getIntent();
        judul = aa.getStringExtra("name");
        penulis = aa.getStringExtra("writer");
        berita = aa.getStringExtra("news");
        tanggal = aa.getStringExtra("date");
        judulnya.setText(judul);
        penulisnya.setText(penulis);
        beritanya.setText(berita);
        tanggalnya.setText(tanggal);
    }
}

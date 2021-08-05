package com.risda.intenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Penjualan extends AppCompatActivity {

    TextView tvPenjualan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penjualan);

        load();
        ambilData();
    }

    public void load(){
        tvPenjualan = findViewById(R.id.tvPenjualan);
    }

    public void ambilData(){
        String ambil = getIntent().getStringExtra("ISI");
        tvPenjualan.setText(ambil);
    }
}
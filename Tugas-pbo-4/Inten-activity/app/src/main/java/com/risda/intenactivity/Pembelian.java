package com.risda.intenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pembelian extends AppCompatActivity {

    TextView tvPembelian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);

        load();
        ambilData();
    }

    public void load(){
        tvPembelian = findViewById(R.id.tvPembelian);
    }

    public void ambilData(){
        String ambil = getIntent().getStringExtra("ISI");
        tvPembelian.setText(ambil);
    }
}
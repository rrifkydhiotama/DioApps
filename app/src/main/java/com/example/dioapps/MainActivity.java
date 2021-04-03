package com.example.dioapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void clickRS(View view) {
        // Gambar RS di click
        Intent i = new Intent(this, RS.class);
        startActivity(i);
    }
    public void clickPolisi(View view) {
        Intent i = new Intent(this, PLSI.class);
        startActivity(i);
    }
    public void clicksm(View view) {
        Intent i = new Intent(this, SM.class);
        startActivity(i);
    }

    public void clickSekolah(View view) {
            Intent i = new Intent(this, SKLH.class);
            startActivity(i);
    }
}
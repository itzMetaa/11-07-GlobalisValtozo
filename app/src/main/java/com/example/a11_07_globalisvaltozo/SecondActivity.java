package com.example.a11_07_globalisvaltozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{

    TextView txtViewSecond;
    Button btnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void init(){
        btnGoBack = findViewById(R.id.btnGoBack);
        txtViewSecond = findViewById(R.id.txtViewSecond);

        SharedPreferences sharedPreferences = getSharedPreferences("Adatok", Context.MODE_PRIVATE);
        String seged = "";
        seged = sharedPreferences.getString("nev","nincs adat");
        txtViewSecond.setText(seged);

    }
}

package com.example.a11_07_globalisvaltozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnGoBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
        btnGoBack.setOnClickListener(this);
    }
    private void init(){
        btnGoBack = findViewById(R.id.btnGoBack);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGoBack:
                finish();
        }
    }
}

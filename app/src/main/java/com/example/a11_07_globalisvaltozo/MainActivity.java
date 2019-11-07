package com.example.a11_07_globalisvaltozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLaunch2ndActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnLaunch2ndActivity.setOnClickListener(this);
    }

    public void init(){
        btnLaunch2ndActivity = findViewById(R.id.btnLaunch2ndActivity);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLaunch2ndActivity:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
        }
    }
}

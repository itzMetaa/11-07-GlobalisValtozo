package com.example.a11_07_globalisvaltozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLaunch2ndActivity;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btnLaunch2ndActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("Adatok", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("nev",editText.getText().toString());

                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    public void init(){
        btnLaunch2ndActivity = findViewById(R.id.btnLaunch2ndActivity);
        editText = findViewById(R.id.editText);
    }
}

package com.example.fashionquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private Intent intent;
    private String userName;
    private int scor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        intent = getIntent();
        userName= intent.getStringExtra("UserName");
        scor = intent.getIntExtra("CorrectAnwers",0);
        TextView tv = findViewById(R.id.sandu_cristina_tv_score);
        String stringFinal = "Felicitari,"+userName + "! Ai obtinut " + scor + " puncte!";
        tv.setText(stringFinal);
    }
}
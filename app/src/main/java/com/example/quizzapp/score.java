package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Button trya=findViewById(R.id.tryA);

        trya.setOnClickListener(view->{
            startActivity(new Intent(score.this,quiz1.class));
        });
    }
}
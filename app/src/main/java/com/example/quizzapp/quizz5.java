package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class quizz5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz5);
        Button btn = findViewById(R.id.buttonNext5);

        btn.setOnClickListener(view->{
//            Bundle bdl= getIntent().getExtras();
//            Object value = bdl.get("nb");
//
//            Toast.makeText(getApplicationContext(),value.toString(),Toast.LENGTH_SHORT);
            startActivity(new Intent(quizz5.this,score.class));

        });
    }
}
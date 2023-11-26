package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class quizz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz3);

        Button btn = findViewById(R.id.buttonNext3);

        btn.setOnClickListener(view->{
//            Bundle bdl= getIntent().getExtras();
//            Object value = bdl.get("nb");

//            Toast.makeText(getApplicationContext(),value.toString(),Toast.LENGTH_SHORT);
            startActivity(new Intent(quizz3.this,quizz4.class));

        });
    }
}
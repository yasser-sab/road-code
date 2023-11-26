package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class quiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz1);

        RadioGroup rg;
        Button btn;
        btn=findViewById(R.id.buttonNext1);
        rg=findViewById(R.id.rg);

        btn.setOnClickListener(view->{
            switch(rg.getCheckedRadioButtonId()){
                case R.id.radioButton1:
                    Toast.makeText(getApplicationContext(),"good",Toast.LENGTH_LONG).show();
                    Intent t=new Intent(quiz1.this,quizz2.class);
//                    t.putExtra("nb","5");
                    startActivity(t);
                    break;
                case R.id.radioButton2:
                    break;
            }
        });



    }
}
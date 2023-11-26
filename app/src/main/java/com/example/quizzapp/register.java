package com.example.quizzapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        auth=FirebaseAuth.getInstance();

        EditText name,email,password,cpassword;
        Button register;

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password= findViewById(R.id.password);
        cpassword= findViewById(R.id.cpassword);
        register = findViewById(R.id.register);

        register.setOnClickListener(view->{
                if(password.getText().toString().equals(cpassword.getText().toString())) {
                    auth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        Toast.makeText(getApplicationContext(), "register success", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(register.this, MainActivity.class));
                                    } else {
                                        Toast.makeText(getApplicationContext(), "register fail", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }else{
                    Toast.makeText(getApplicationContext(), "please check you password", Toast.LENGTH_SHORT).show();
                }

        });
    }
}
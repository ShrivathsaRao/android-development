package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText emailEditText,passwordEditText;
Button loginBtn;
int count=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        emailEditText=findViewById(R.id.editTextTextEmailAddress2);
        passwordEditText=findViewById(R.id.editTextTextPassword2);
        loginBtn=findViewById(R.id.button2);

        String registeredEmail=getIntent().getStringExtra("email");
        String registeredPassword=getIntent().getStringExtra("password");
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=emailEditText.getText().toString();
                String password= passwordEditText.getText().toString();
                if(registeredEmail.equals(email) && registeredPassword.equals(password))
                {
                    Intent i= new Intent(LoginActivity.this,LoginSuccess.class);
                    startActivity(i);
                }
                else
                {

                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            count--;
                if (count==0)
                {
                    Toast.makeText(LoginActivity.this, "Failed to login", Toast.LENGTH_SHORT).show();
                    loginBtn.setEnabled(false);
                }
            }
        });


    }
}
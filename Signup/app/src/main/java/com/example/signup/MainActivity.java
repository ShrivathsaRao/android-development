package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button signUpBtn;
    EditText emailEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailEditText= findViewById(R.id.editTextTextEmailAddress);
        passwordEditText= findViewById(R.id.PasswordEditText);
        signUpBtn=findViewById(R.id.button);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=emailEditText.getText().toString();
                String password=passwordEditText.getText().toString();
                if(isValidPassword(password))
                {
                    Toast.makeText(MainActivity.this, "Password does not match", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i= new Intent(MainActivity.this,LoginActivity.class);

                i.putExtra("email",email);
                i.putExtra("password",password);
                startActivity(i);
            }
        });}
    boolean isValidPassword(String password){
        Pattern lowercase=Pattern.compile(".*[a-z].*$");
        Pattern uppercase= Pattern.compile(".*[a-z].*$");
        Pattern number= Pattern.compile(".*[0-9].*$");
        Pattern specialCharacter=Pattern.compile("^.*[^a-z0-9A].*$");
        if(password.length()<8)
            return false;
        if(!lowercase.matcher(password).matches()) return false;
        if(!uppercase.matcher(password).matches()) return false;
        if(!number.matcher(password).matches()) return false;
        if(!specialCharacter.matcher(password).matches()) return false;
        return true;
    }


}
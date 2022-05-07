package com.example.dialnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView backspace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backspace = findViewById(R.id.contactnumber);

    }

    private void pressOnDelete{
        String substr = null;
        if (contactnumber.getText().toString().length() > 0){
            substr = contactnumber.getText().toString().substring(0, (contactnumber))
                    contactnumber.setText(substr);
        }
    }
    private void addDigit(View view){
        TextView tv = (TextView) view;
        String number = contactnumber.getText().toString() + tv.getText().toString();
        contactnumber.setText(number);
    }
    private void executeSave(){

    }

}
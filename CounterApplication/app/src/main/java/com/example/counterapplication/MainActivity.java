package com.example.counterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button startbtn,stopbtn;
TextView tv1;
int i = 1;
Handler customHandler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    startbtn=findViewById(R.id.button);
    stopbtn=findViewById(R.id.button2);
    tv1=findViewById(R.id.textView2);
    stopbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            customHandler.postDelayed(updateTimerThread,0);
        }
    });
    stopbtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            customHandler.removeCallbacks(updateTimerThread);
        }
    });
    }
    private final Runnable updateTimerThread=new Runnable() {
        @Override
        public void run() {
            tv1.setText(""+i);
            customHandler.postDelayed(this,1000);
            i++;
        }
    };
}
package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        ans=findViewById(R.id.ans);

    }
    public void add(View add){
        int a1=Integer.parseInt(num1.getText().toString());
        int a2=Integer.parseInt(num2.getText().toString());
        int res=a1+a2;
        ans.setText(""+res);
    }
    public void sub(View add){
        int a1=Integer.parseInt(num1.getText().toString());
        int a2=Integer.parseInt(num2.getText().toString());
        int res=a1-a2;
        ans.setText(""+res);
    }
    public void mul(View add){
        int a1=Integer.parseInt(num1.getText().toString());
        int a2=Integer.parseInt(num2.getText().toString());
        int res=a1*a2;
        ans.setText(""+res);
    }
    public void div(View add){
        float a1=Integer.parseInt(num1.getText().toString());
        float a2=Integer.parseInt(num2.getText().toString());
        float res=a1/a2;
        ans.setText(""+res);
    }
}
package com.example.coursemanagement;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Semester_4 extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_4);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();

        if (i == R.id.btn1){
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
        } else if (i == R.id.btn2){
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
        } else if (i == R.id.btn3){
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
        } else if (i == R.id.btn4){
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
        } else if (i == R.id.btn5){
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show();
        }

    }
}

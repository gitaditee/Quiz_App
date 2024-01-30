package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Selectsub extends AppCompatActivity {
 private Button c;
 private Button cplus;
 private Button javabtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectsub);
        c=findViewById(R.id.c);
        cplus=findViewById(R.id.cplus);
        javabtn=findViewById(R.id.javabut);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Selectsub.this, cquiz.class);
                startActivity(intent);
            }
        });
       cplus.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Selectsub.this, cppquiz.class);
               startActivity(intent);
           }
       });
       javabtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Selectsub.this,MainActivity.class);
               startActivity(intent);
           }
       });
    }
}
package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cppquiz extends AppCompatActivity {
    private String[] ques={"C++ is Object Oreinted ?","C++ is a person?","C++ is introducted in 1923 ?","C++ supports inhertinace ?"};
    private boolean[] ans={true,false,false,true};
    private int score=0;
    Button yescpp;
    Button nocpp;
    TextView questextcpp;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cppquiz);
        yescpp=findViewById(R.id.yescpp);
        nocpp=findViewById(R.id.nocpp);
        questextcpp=findViewById(R.id.questextcpp);
        questextcpp.setText(ques[index]);
        yescpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=ques.length-1){
                    if(ans[index]==true){
                        score++;
                    }
                    index++;
                    if(index<=ques.length-1){
                        questextcpp.setText(ques[index]);
                    }
                    else {
                        Toast.makeText(cppquiz.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(cppquiz.this, "Restart your app to play quiz", Toast.LENGTH_SHORT).show();
                }
            }
        });
        nocpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=ques.length-1){
                    if(ans[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=ques.length-1){
                        questextcpp.setText(ques[index]);
                    }
                    else {
                        Toast.makeText(cppquiz.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(cppquiz.this, "Restart your app to play quiz", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    }

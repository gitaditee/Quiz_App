package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cquiz extends AppCompatActivity {
    private String[] ques={"C is Object Oreinted ?","C is a person?","C is introducted in 1923 ?","C supports inhertinace ?"};
    private boolean[] ans={false,false,false,false};
    private int score=0;
    Button yesc;
    Button noc;
    TextView questext;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cquiz);
        yesc=findViewById(R.id.yesc);
        noc=findViewById(R.id.noc);
        questext=findViewById(R.id.questext);
        questext.setText(ques[index]);
        yesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=ques.length-1){
                    if(ans[index]==true){
                        score++;
                    }
                    index++;
                    if(index<=ques.length-1){
                        questext.setText(ques[index]);
                    }
                    else {
                        Toast.makeText(cquiz.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(cquiz.this, "Restart your app to play quiz", Toast.LENGTH_SHORT).show();
                }
            }
        });
        noc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=ques.length-1){
                    if(ans[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=ques.length-1){
                        questext.setText(ques[index]);
                    }
                    else {
                        Toast.makeText(cquiz.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(cquiz.this, "Restart your app to play quiz", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    }

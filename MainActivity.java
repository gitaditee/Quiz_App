package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private String[] ques={"Java is Object Oreinted ?","java is a person?","java is introducted in 1923 ?","java supports inhertinace ?"};
      private boolean[] ans={true,false,false,true};
      private int score=0;
      Button yes;
      Button no;
      TextView q;
     private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yesc);
        no=findViewById(R.id.no);
        q=findViewById(R.id.q);
        q.setText(ques[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(index<=ques.length-1){
                if(ans[index]==true){
                    score++;
                }
                index++;
                if(index<=ques.length-1){
                    q.setText(ques[index]);
                }
                else {
                    Toast.makeText(MainActivity.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart your app to play quiz", Toast.LENGTH_SHORT).show();
            }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=ques.length-1){
                    if(ans[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=ques.length-1){
                        q.setText(ques[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart your app to play quiz", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
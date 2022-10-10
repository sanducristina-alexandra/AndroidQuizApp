package com.example.fashionquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class QuestionActivity extends AppCompatActivity {

    //private Button buttonFinish;
    Intent intent;
    private String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        intent=getIntent();
        userName=intent.getStringExtra("UserName");
        implementsButtonQ();
    }
    private void implementsButtonQ(){
        Button buttonFinish = findViewById(R.id.sandu_cristina_btn_main_finish);

        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int scor=calculateScore();
                intent = new Intent(getApplicationContext(),ScoreActivity.class);
                intent.putExtra("UserName",userName);
                intent.putExtra("CorrectAnwers",scor);

                startActivity(intent);
            }
        });
    }
    private int calculateScore(){
        int counter = 0;
        RadioGroup radioGroup1= findViewById(R.id.sandu_cristina_rg_q1);
        RadioGroup radioGroup2= findViewById(R.id.sandu_cristina_rg_q2);
        RadioGroup radioGroup3= findViewById(R.id.sandu_cristina_rg_q3);
        RadioGroup radioGroup4= findViewById(R.id.sandu_cristina_rg_q4);
        RadioGroup radioGroup5= findViewById(R.id.sandu_cristina_rg_q5);
        if(radioGroup1.getCheckedRadioButtonId()== R.id.sandu_cristina_rb_q1a1){
            counter++;
        }
        if(radioGroup2.getCheckedRadioButtonId()== R.id.sandu_cristina_rb_q2a2){
            counter++;
        }
        if(radioGroup3.getCheckedRadioButtonId()== R.id.sandu_cristina_rb_q3a4){
            counter++;
        }
        if(radioGroup4.getCheckedRadioButtonId()== R.id.sandu_cristina_rb_q4a1){
            counter++;
        }
        if(radioGroup5.getCheckedRadioButtonId()== R.id.sandu_cristina_rb_q5a3){
            counter++;
        }
     return counter;
    }
}
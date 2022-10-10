package com.example.fashionquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

   // private Button buttonStart;
    private ConstraintLayout constraintLayout;

    //private TextInputEditText tietName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implementsBackgroundAnimation();
        implementsButton();

    }

    private void implementsBackgroundAnimation() {
        constraintLayout = findViewById(R.id.sandu_cristina_main_constraint_layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

    private void implementsButton() {

    Button buttonStart = findViewById(R.id.sandu_cristina_btn_main_start);
    TextInputEditText tietName=findViewById(R.id.sandu_cristina_tiet_name);
    buttonStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){
            if(tietName.getText()==null || tietName.getText().toString().trim().length()<3){
                Toast.makeText(getApplicationContext(), R.string.inv_name ,Toast.LENGTH_LONG).show();
            }else {
                Intent intent = new Intent(getApplicationContext(), QuestionActivity.class);
                intent.putExtra("UserName",tietName.getText().toString());
                startActivity(intent);
            }
    }
    });
}

}
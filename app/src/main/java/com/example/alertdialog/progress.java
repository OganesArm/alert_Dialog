package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class progress extends AppCompatActivity {
    ImageView imageView, imageView2;
    int victory, cot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Music",1);
        editor.apply();
        victory = save.getInt("Victory", 0);
        cot = save.getInt("Cot", 0);

        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);


        if  (victory==1) {
            imageView.setVisibility(View.VISIBLE);
        } else  {
            imageView.setVisibility(View.GONE);
        } if (cot==1) {
            imageView2.setVisibility(View.VISIBLE);
        } else   {
            imageView2.setVisibility(View.GONE);
        }

    }


    public void onBackPressed(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}


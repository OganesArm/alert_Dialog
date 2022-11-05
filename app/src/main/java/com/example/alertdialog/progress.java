package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

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

        imageView=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);


        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        victory = save.getInt("Victory", 0);
        cot = save.getInt("Cot", 0);

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
}


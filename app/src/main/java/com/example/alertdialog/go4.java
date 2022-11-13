package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alertdialog.R;

public class go4 extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go4);
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 4);
        editor.putInt("Cot", 1);
        editor.apply();
        textView = findViewById(R.id.textView);
        size = save.getInt("size", 0);

//        ImageView i = new ImageView(getApplicationContext());
//        i.setImageResource(R.drawable.cot);
//
//        Toast toast= new Toast(getApplicationContext());
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setView(i);
//        toast.setGravity(Gravity.TOP, 0, 300);
//        toast.show();

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);


        if (size==10) {
            textView.setTextSize(10);
        } if (size==12)   {
            textView.setTextSize(12);
        } if (size==14)   {
            textView.setTextSize(14);
        } if (size==16)   {
            textView.setTextSize(16);
        } if (size==18)   {
            textView.setTextSize(18);
        } if (size==20) {
            textView.setTextSize(20);
        } if (size==22)   {
            textView.setTextSize(22);
        } if (size==24)   {
            textView.setTextSize(24);
        } if (size==26)   {
            textView.setTextSize(26);
        } if (size==28)   {
            textView.setTextSize(28);
        } if (size==30)   {
            textView.setTextSize(30);
        }
    }
    int size;
        // назначаем куда клавиша телефона назада отправит пользователя!
    public void onBackPressed(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void go5 (View view) {
        Intent intent = new Intent(this, go5.class);
        startActivity(intent);
    }
}
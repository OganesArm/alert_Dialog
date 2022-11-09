package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class go2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go2);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 2);
        editor.apply();

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }
    // назначаем куда клавиша телефона назада отправит пользователя!
    public void onBackPressed(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void go3(View view) {
        Intent intent = new Intent(this, go3.class);
        startActivity(intent);
    }
    public void goMak(View view) {
        Intent intent = new Intent(this, mak1.class);
        startActivity(intent);
    } }
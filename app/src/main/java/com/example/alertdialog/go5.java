package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class go5 extends AppCompatActivity {
Button butMak2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go5);
        butMak2 = findViewById(R.id.butMak2);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 5);
        mak = save.getInt("Mak", 0); buttonClickMakHome();
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
    public void go6 (View view) {
        Intent intent = new Intent(this, go6.class);
        startActivity(intent);
    }

    int mak;
    public void buttonClickMakHome() {
        butMak2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mak == 1) {
                            Intent intent = new Intent(go5.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        } else {
                            finish();
                        }
                    }
                });
        if (mak == 1) {
            butMak2.setVisibility(View.VISIBLE);
        } else {
            butMak2.setVisibility(View.GONE);
        }

    }
}

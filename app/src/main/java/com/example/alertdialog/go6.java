package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class go6 extends AppCompatActivity {
Button butMak2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go6);
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 6);
        editor.putInt("Victory", 1);
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

// Всплывающее достижение с изображением!
        ImageView i = new ImageView(getApplicationContext());
        i.setImageResource(R.drawable.victory);

        Toast toast= new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(i);
        toast.setGravity(Gravity.TOP, 0, 300);
        toast.show();
    }

    // назначаем куда клавиша телефона назада отправит пользователя!
    public void onBackPressed(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void go7 (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    int mak;
    public void buttonClickMakHome() {
        butMak2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mak==1) {
                            Intent intent = new Intent(go6.this, MainActivity.class);
                            startActivity(intent);
                            finish();

                        } else { finish(); }
                    }
                });
        if  (mak==1) {
            butMak2.setVisibility(View.VISIBLE);
        } else {
            butMak2.setVisibility(View.GONE);
        }
    }
}
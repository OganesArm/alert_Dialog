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

        ImageView i = new ImageView(getApplicationContext());
        i.setImageResource(R.drawable.cot);

        Toast toast= new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(i);
        toast.setGravity(Gravity.TOP, 0, 300);
        toast.show();

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);


        if (size==1) {
            textView.setTextSize(10);
        } if (size==2)   {
            textView.setTextSize(50);
        } if (size==3)   {
            textView.setTextSize(30);
        } if (size==4)   {
            textView.setTextSize(40);
        } if (size==5)   {
            textView.setTextSize(50);
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
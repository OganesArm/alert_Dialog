package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alertdialog.R;

public class go3 extends AppCompatActivity {
    Button butMakHome;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go3);
        butMakHome = findViewById(R.id.butMakHome);
        textView = findViewById(R.id.textView);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 3);
        editor.apply();
        mak = save.getInt("Mak", 0); buttonClickMakHome();
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
        int size;
        size = save.getInt("size", 0);
        textView.setTextSize(size); //устанавливаем размер текста в зависимости какой size
        textView.setText(String.valueOf("      - Арам, надо уходить как можно скорее! Вспомни что было с греками, надо уходить дальше отсюда. Я говорила уже, давай бросим всё и поедем нас всё равно ничего не держит здесь. Наш дом вот-вот рухнет, я чувствую, что надо уходить отсюда. – сказала Седа. \n" +
                "      - А дом? А земля? Кому мы всё это оставим? Да и куда мы поедем? – ответил Арам.\n" +
                "      - Хоть куда, главное вместе и в безопасности. Я устала каждый день бояться завтрашнего дня. Уедем и там вместе соберем и на дом, и на землю. Поедем в Америку, Францию или Российскую Армению. – Сказал она. \n" +
                "      - Да, мы поедем. Но когда? Сейчас? В зиму? Чтобы умереть от холода вместе с детьми? Дети ещё очень маленькие для такой дороги, Тиграну только *** лет, а Нане хоть и постарше на два года, но всё равно маленькая ещё. \n" +
                "      - Скажи им! Скажи, что мы всей деревней должны уйти. Они придут к нам, не сегодня так завтра. \n"));



    }
    // назначаем куда клавиша телефона назада отправит пользователя!
    public void onBackPressed(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void go4(View view) {
        Intent intent = new Intent(this, go4.class);
        startActivity(intent);
    }
    int mak;
    public void buttonClickMakHome() {
        butMakHome.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mak==1) {
                            Intent intent = new Intent(go3.this, go4.class);
                            startActivity(intent);
                            finish();
                        } else { finish(); }
                        }
                });
        if  (mak==1) {
            butMakHome.setVisibility(View.VISIBLE);
        } else {
            butMakHome.setVisibility(View.GONE);
        }


} }























//    public void buttonClickMakHome() {
//        butMakHome.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        switch (mak) {
//                            case 1:
//                                try {
//                                    Intent intent = new Intent(go3.this, MainActivity.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) {//
//                                }
//                                break;
//                            default:
//                                break;
//                        }
//                    }
//                });
////        скрытие кнопок
//        if  (mak==1) {
//            butMakHome.setVisibility(View.VISIBLE);
//            butStart.setVisibility(View.GONE);
//
//        } else {
//            butMakHome.setVisibility(View.GONE);
//            butStart.setVisibility(View.VISIBLE);
//        }
//    }

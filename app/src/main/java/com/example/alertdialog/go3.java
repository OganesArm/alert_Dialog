package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.alertdialog.R;

public class go3 extends AppCompatActivity {
    Button butMakHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go3);
        butMakHome = findViewById(R.id.butMakHome);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 2);
        editor.apply();
        mak = save.getInt("Mak", 0); buttonClickMakHome();


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

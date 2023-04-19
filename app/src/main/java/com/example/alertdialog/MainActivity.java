package com.example.alertdialog;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;


import com.example.alertdialog.location1.a1;
import com.example.alertdialog.location1.go13;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import kotlin.Unit;

public class MainActivity extends AppCompatActivity {
    Button butSave, butStart, butStart2;
    TextView textView2;
    private MediaPlayer musicSound;
    int music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butStart = findViewById(R.id.butStart);
        butSave = findViewById(R.id.butSave);
        butStart2 = findViewById(R.id.butStart2);
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        v();
        editor.apply();

        level = save.getInt("Level", 0);
        level_A = save.getInt("Level_A", 0);
        music = save.getInt("Music", 0);
        String user = save.getString("User", toString()); //создаем переменную с именем пользователя
        editor.apply();

        textView2 = findViewById(R.id.textView2);
        String text2 = "Добро пожаловать, " +level_A; // +user;
        textView2.setText(text2);

        buttonClick1();
        butStart2.setOnClickListener(v -> vopros());      //вызывает функцию при нажатие кнопки

// скрываем кнопки навигации и верхнее меню!
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


    public void goSetting(View view) {
        Intent intent = new Intent(this, setting.class);
        startActivity(intent);
    }

    public void goTelegram(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/studio_apricot"));
        startActivity(browserIntent);
    }

    public void goProgress(View view) {
        Intent intent = new Intent(this, progress.class);
        startActivity(intent);
    }
    public void go1(View view) {
        Intent intent = new Intent(this, go1.class);
        startActivity(intent);
    }

    //    всплывающее окно
    private void vopros() {
//      другой формат всплывающего уведомления  AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        MaterialAlertDialogBuilder dialog = new MaterialAlertDialogBuilder(this, R.style.AlertDialogTheme);
        dialog.setTitle("Вы уверены что хотите начать новую игру?"); //заголовок для всполывающего окна

        dialog.setMessage("Все сохраненные данные сотрутся"); // подпись под заголовком
//      dialog.setCancelable(false); //всплывающее окно невозможно сбросить/закрыть.

        LayoutInflater inflater = LayoutInflater.from(this); //создали объект
        View vopros_window = inflater.inflate(R.layout.activity_vopros, null); // получаем нужный шаблон
        dialog.setView(vopros_window); // шаблон для всплывающего окна


        //     кнопка отмены вызова всплывающего окна
        dialog.setNeutralButton("Отменить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
            }
        });

        dialog.setPositiveButton("Начать игру заново", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.dismiss();
                Intent intent = new Intent(MainActivity.this, go1.class);
                startActivity(intent);
                finish();
            }
        });
        // показ окна
        if (level > 0) {
            dialog.show();
        } else {
        }
    }
    public void v(){
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        editor.putInt("Level", 3);
        editor.apply();
    }

    // сохранение и загрузка сохранения
    int level;
    int level_A;
/*
        Разобрались как работать с папками
        порядок будет такой
        mainActivity
        menu
        scenario1
        scenario2
        scenario3

        в каждом оставляем в запасные места, если например всего 60 активити то следующую нумерацию
        начинаем с 100, если всего 140 то можем сразу с 200 и т.д., на скорость работы приоложения не влияет
        но за то оставляет запасные варианты.
 */
    public static void main(String[] args) {
        Map<Integer, Class<?>> activities = new HashMap<>();
        activities.put(0, go1.class);
        activities.put(2, go2.class);
        activities.put(3, go3.class);
        activities.put(4, go4.class);
        activities.put(5, go5.class);
        activities.put(6, go6.class);
        activities.put(8, go8.class);
        activities.put(9, go9.class);
        activities.put(1, a1.class);
        activities.put(13, com.example.alertdialog.location1.go13.class);

    }

    public void buttonClick1() {
        butSave.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            if (level<10) {
                                Class<?> clazz = Class.forName(getPackageName() + ".go" + level);
                                Intent intent = new Intent(MainActivity.this, clazz);
                                startActivity(intent);
                                finish();
                            } if (level>10) {
                                Class<?> clazz = Class.forName("com.example.alertdialog.location1.go" + level);
                                Intent intent = new Intent(MainActivity.this, clazz);
                                startActivity(intent);
                                finish();
                            }


                        } catch (Exception e) { //
                            e.printStackTrace();
                        }
                    }
                });
// скрываем и показываем нужные кнопки
        if (level == 0) {
            butStart2.setVisibility(View.GONE);
            butSave.setVisibility(View.GONE);

        } else {
            butStart.setVisibility(View.VISIBLE);
            butSave.setVisibility(View.VISIBLE);
        }
    }

}







//    @Override
//    public void onStart() {
//        super.onStart();
//        startService(new Intent(this, MyService.class));
//    }

//    @Override
//    public void onPause() {
//        super.onPause();
//        stopService(new Intent(this, MyService.class));
// }
//
//    @Override
//    protected void onStop(){
//        super.onStop();
//        stopService(new Intent(this, MyService.class));
//
//    }

//
//@Override
//protected void onPause(){
//        super.onPause();
//    stopService(new Intent(this, MyService.class).putExtra("pause", true)) ;
//
//    }

//    @Override
//    protected void onStop(){
//        super.onStop();
//        musicSound.stop();
//    }
//    @Override
//    protected void onStart(){
//        super.onStart();
//        musicSound.start();
//    }


//    public void soundPlay2(MediaPlayer sound) {
//        if (sound.isPlaying()) {
//            sound.pause();
//            sound.release();
//        } else {
//
//        }
//    }
//
//    public void soundPlay(MediaPlayer sound) {
//        if (sound.isPlaying()) {
//            sound.pause();
//
//        } else
//            sound.start();
//            sound.setLooping(true);  }
//int length;
//    @Override
//    protected void onStop() {
//        super.onStop();
//        musicSound.pause();
//        length = musicSound.getCurrentPosition();
//    }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        musicSound.seekTo(length);
//        musicSound.start();
//    }
//
//    public void soundPlay(MediaPlayer sound) {
//
//        sound.isPlaying();
//        sound.start();
////        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
////        SharedPreferences.Editor editor = save.edit();
////        editor.putInt("Music", 3);
////        editor.apply();
//    }
//    public void stopPlay(MediaPlayer sound) {
//
//        sound.isPlaying();
//        sound.pause();
////        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
////        SharedPreferences.Editor editor = save.edit();
////        editor.putInt("Music", 0);
////        editor.apply();
//    }





























//     кнопка продолжить игру , старое сохранение!
//   int level;
//    public void buttonClick1() {
//        butSave.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        switch (level) {
//                            case 0:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, go1.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) {//
//                                }
//                                break;
//
//                            case 1:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, go2.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) {  //
//                                }
//                                break;
//                            case 2:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, go3.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) { //
//                                }
//                                break;
//                            case 3:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, go4.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) { //
//                                }
//                                break;
//                            case 4:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, mak1.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) { //
//                                }
//                                break;
//                            case 5:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, Mak2.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) { //
//                                }
//                                break;
//                            case 6:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, go5.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) { //
//                                }
//                                break;
//                            case 7:
//                                try {
//                                    Intent intent = new Intent(MainActivity.this, go6.class);
//                                    startActivity(intent);
//                                    finish();
//                                } catch (Exception e) { //
//                                }
//                                break;
//                            default:
//                                break;
//                        }
//                    }
//                });
// скрытие кнопок

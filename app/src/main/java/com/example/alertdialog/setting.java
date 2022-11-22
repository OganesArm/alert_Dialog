package com.example.alertdialog;

import static android.provider.Contacts.SettingsColumns.KEY;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ResourceBundle;

public class setting extends AppCompatActivity {
int size;
EditText editSave;
TextView textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);

        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        SharedPreferences.Editor editor = save.edit();
        size = save.getInt("size", 0);
        editSave = findViewById(R.id.editSave);
        textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        editor.apply();
        textView4.setText(String.valueOf("Если это приложение работает, \nТо его написал Оганисян Оганес. \nЕсли нет, то я не знаю, кто его написал..."));

        //     musicSound = MediaPlayer.create(this, R.raw.music);
        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.seekBarValue);
        seekBar.setProgress(size); // в зависимости какой size сохранен, такая позиция в школе и устанавливается.
        textView.setText(String.valueOf("Текущий размер:  " + size));// сама надпись
        textView.setTextSize(size);
        textView3.setTextSize(size);
        textView4.setTextSize(size);


        editor.apply();
        String user = save.getString("User", toString()); //создаем переменную с именем пользователя
        String text3 = "Хотите изменить свое имя, "+user+"?";
        textView3.setText(text3);


// прогресс передает нужный size и устанавливает размер надписей, в том числе и для тестовой надписи.
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if (progress == 10) {
                    editor.putInt("size", 10);
                    textView.setTextSize(10);
                    textView4.setTextSize(10);
                    textView3.setTextSize(10);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 12) {
                    editor.putInt("size", 12);
                    textView.setTextSize(12);
                    textView4.setTextSize(12);
                    textView3.setTextSize(12);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 14) {
                    editor.putInt("size", 14);
                    textView.setTextSize(14);
                    textView4.setTextSize(14);
                    textView3.setTextSize(14);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 16) {
                    editor.putInt("size", 16);
                    textView.setTextSize(16);
                    textView4.setTextSize(16);
                    textView3.setTextSize(16);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 18) {
                    editor.putInt("size", 18);
                    textView.setTextSize(18);
                    textView4.setTextSize(18);
                    textView3.setTextSize(18);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 20) {
                    editor.putInt("size", 20);
                    textView.setTextSize(20);
                    textView4.setTextSize(20);
                    textView3.setTextSize(20);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 22) {
                    editor.putInt("size", 22);
                    textView.setTextSize(22);
                    textView4.setTextSize(22);
                    textView3.setTextSize(22);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 24) {
                    editor.putInt("size", 24);
                    textView.setTextSize(24);
                    textView4.setTextSize(24);
                    textView3.setTextSize(24);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 26) {
                    editor.putInt("size", 26);
                    textView.setTextSize(26);
                    textView4.setTextSize(26);
                    textView3.setTextSize(26);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 28) {
                    editor.putInt("size", 28);
                    textView.setTextSize(28);
                    textView4.setTextSize(28);
                    textView3.setTextSize(28);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                } if (progress == 30) {
                    editor.putInt("size", 30);
                    textView.setTextSize(30);
                    textView4.setTextSize(30);
                    textView3.setTextSize(30);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });
    }


//    public void onClickSave(View view){
//        SharedPreferences.Editor edit = pref.edit();
//        edit.putString(save_key,editSave.getText().toString());
//        edit.apply();
//    }
//    public void onClickGet(View view){
//        editSave.setText(pref.getString(save_key,"Pusto"));
//    }
//    private void init(){
//        pref = getSharedPreferences("Test", MODE_PRIVATE);
//        editSave=findViewById(R.id.editSave);
//        textView3.setText(pref.getString(save_key, "Pusto"));
//    }


    public void saveData (View view) {
        String user_name = editSave.getText().toString();
            if (user_name.isEmpty()) {   //Проверка строчки если равно НОЛЬ
                Toast.makeText(setting.this, "Пожалуйста, введите имя!", Toast.LENGTH_SHORT).show();
                editSave.setText(""); //очистка поля
            } else {
                SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
                SharedPreferences.Editor editor = save.edit();
                editor.putString("User", user_name);
                editor.apply();
                String text3="Здравствуйте, "+ user_name +"!";
                textView3.setText(text3);
                Toast.makeText(setting.this, "Ваше имя изменено", Toast.LENGTH_SHORT).show();
                editSave.setText(""); //очистка поля

    } }


//
//    @Override
//    protected void onStop(){
//        super.onStop();
//        soundPlay2(musicSound);
//    }
//    @Override
//    protected void onResume(){
//        super.onResume();
//        soundPlay(musicSound);
//    }
//    public void soundPlay2(MediaPlayer sound) {
//        if (sound.isPlaying()) {
//            sound.start();
//            sound.setLooping(true);
//        } else
//            sound.pause();
//        sound.release();
//    }
//
//    public void soundPlay(MediaPlayer sound) {
//        if (sound.isPlaying()) {
//            sound.pause();sound.release();
//        } else
//            sound.start();
//        sound.setLooping(true);  }
//
    public void onBackPressed(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
                }






















//    Старая реализация сохранения через через ТХТ файл
//    public void saveData (View view) {
//        String user_name = editSave.getText().toString();
//        try {
//            FileOutputStream fileOutput = openFileOutput("user_name.txt", MODE_PRIVATE);
//            fileOutput.write((user_name).getBytes());
//            StringBuilder strBuffer = new StringBuilder();
//            fileOutput.close();
//
//            strBuffer.append("Здравствуйте, ").append(user_name).append("!");
//            textView3.setText(strBuffer.toString());
//
//            SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
//            SharedPreferences.Editor editor = save.edit();
//            editor.putString("User", user_name);
//            editor.apply();
//            Toast.makeText(setting.this, "Ваше имя изменено", Toast.LENGTH_SHORT).show();
//            editSave.setText(""); //очистка поля
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

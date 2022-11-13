package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class setting extends AppCompatActivity {
int size;
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
        editor.apply();


        SeekBar seekBar = findViewById(R.id.seekBar);
        TextView textView = findViewById(R.id.seekBarValue);
// в зависимости какой size сохранен, такая позиция в школе и устанавливается.
        if (size == 10) {
            seekBar.setProgress(10);
            editor.apply();
        }
        if (size == 12) {
            seekBar.setProgress(12);
            editor.apply();
        }
        if (size == 14) {
            seekBar.setProgress(14);
            editor.apply();
        }
        if (size == 16) {
            seekBar.setProgress(16);
            editor.apply();
        }
        if (size == 18) {
            seekBar.setProgress(18);
            editor.apply();
        }
        if (size == 20) {
            seekBar.setProgress(20);
            editor.apply();
        }
        if (size == 22) {
            seekBar.setProgress(22);
            editor.apply();
        }
        if (size == 24) {
            seekBar.setProgress(24);
            editor.apply();
        }
        if (size == 26) {
            seekBar.setProgress(26);
            editor.apply();
        }
        if (size == 28) {
            seekBar.setProgress(28);
            editor.apply();
        }
        if (size == 30) {
            seekBar.setProgress(30);
            editor.apply();
        }
// сама надпись
        textView.setText(String.valueOf("Текущий размер:  " + size));
// устанавливаем размер текста для самой надписи "текущий размер"
        if (size == 10) {
            textView.setTextSize(10);
        }
        if (size == 12) {
            textView.setTextSize(12);
        }
        if (size == 14) {
            textView.setTextSize(14);
        }
        if (size == 16) {
            textView.setTextSize(16);
        }
        if (size == 18) {
            textView.setTextSize(18);
        }
        if (size == 20) {
            textView.setTextSize(20);
        }
        if (size == 22) {
            textView.setTextSize(22);
        }
        if (size == 24) {
            textView.setTextSize(24);
        }
        if (size == 26) {
            textView.setTextSize(26);
        }
        if (size == 28) {
            textView.setTextSize(28);
        }
        if (size == 30) {
            textView.setTextSize(30);
        }
// в зависимости от прогресса передает нужный size.
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                if (progress == 10) {
                    editor.putInt("size", 10);
                    textView.setTextSize(10);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 12) {
                    editor.putInt("size", 12);
                    textView.setTextSize(12);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 14) {
                    editor.putInt("size", 14);
                    textView.setTextSize(14);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 16) {
                    editor.putInt("size", 16);
                    textView.setTextSize(16);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 18) {
                    editor.putInt("size", 18);
                    textView.setTextSize(18);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 20) {
                    editor.putInt("size", 20);
                    textView.setTextSize(20);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 22) {
                    editor.putInt("size", 22);
                    textView.setTextSize(22);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 24) {
                    editor.putInt("size", 24);
                    textView.setTextSize(24);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 26) {
                    editor.putInt("size", 26);
                    textView.setTextSize(26);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 28) {
                    editor.putInt("size", 28);
                    textView.setTextSize(28);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
                if (progress == 30) {
                    editor.putInt("size", 30);
                    textView.setTextSize(30);
                    editor.apply();
                    textView.setText(String.valueOf("Текущий размер:  " + progress));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });
    }
}













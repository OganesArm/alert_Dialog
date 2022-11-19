package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alertdialog.R;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class go4 extends AppCompatActivity {
TextView textView;
    private MediaPlayer musicSound;
    TextView textView2;

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
        int size;
        size = save.getInt("size", 0);
        textView.setTextSize(size); //устанавливаем размер текста в зависимости какой size

        textView.setText(String.valueOf("      Стас повернул дверную ручку и вошел в захламленный кабинет. Раньше здесь, вероятно, обитали работники коммунальных служб, так как на полу по обе стороны от входа лежали какие-то пластиковые трубы, скрученные провода и ящики с сантехникой. Теперь поверх всего этого барахла навалили горы обуви, части оружий и одежду, кое-где даже перепачканную в крови. Пол покрывал истоптанный протертый ковер. Два шкафа с документами, три письменных стола, поставленные буквой «Т» - все это также было завалено различным барахлом и пустыми бутылками из-под пива и водки. Воняло куревом. Сам Корнилов не курил, поэтому запах ударил в нос и заставил поморщиться. \n" +
                "      Кузнецов стоял спиной у окна и изучал какие-то документы. А вид ему было сорок пять. Котко подстриженные светлые волосы, вытянутое лицо и худощавое телосложение. На нем была черная спортивная одежда, и, вообще, сам по себе он выглядел человеком спортивным. \n" +
                "      - Здравствуйте, - поздоровался Стас, прикрывая за собой дверь. – Меня Стас Корнилов зовут, я хочу вступить в поисковый отряд. Оружие есть, желание тоже. \n" +
                "      Кузнецов повернулся и оторопевшим взглядом посмотрел на Стаса: \n" +
                "      Ты что, охренел так вламываться? Стучать не учили? \n" +
                "      Извиняюсь, исправлюсь, - ответил Стас. – Трудно было к вам попасть. \n" +
                "      Ишь ты, бойкий какой. Ты бы у мужиков узнал сначала, - не поднимая взгляда от бумаг, сказал тот. – Я не набираю сейчас новых, в ближайшее время точно. \n" +
                "      Я слышал, но хочу, чтобы для меня вы сделали исключение. \n" +
                "      Кузнецов поднял удивленный взгляд в окно, а потом перевел его на Стаса. Внимательнее изучив собеседника, он убедился, что видит его впервые. \n" +
                "      А ты что, особенный? – подойдя к столу, он положил бумаги и посмотрел на собеседника скорее с сочувствием. \n" +
                "      В этот момент в кабинет без стука вошел мужчина с жутко изуродованным шрамом лицом. Его фигура напоминала треугольник с неестественно широкими плечами по соотношению к бедрам. Потертые джинсы, плотная вязанная толстовка с капюшоном, поверх которой висела расстегнутая разгрузка. Он уверенно прошел к Кузнецову и пожал сначала руку ему, а потом Стасу. \n" +
                "      - Здорово, Леха, сильно занят? – спросил он Кузнецова и кивнул в сторону его посетителя. \n" +
                "      - Да не очень, а что хотел? – ответил Кузнецов. \n" +
                "      - Базар есть с глазу на глаз, - ответил вошедший и посмотрел на Корнилова. – Минут пять займет. \n" +
                "      - Я подожду снаружи, - поняв намек, сказал Стас и вышел в коридор, прикрыв за собой дверь. \n" +
                "      Он уселся на подоконник и стал ждать. Из кабинета доносился разговор, но слова разобрать было трудно, а подслушивать под дверью он точно не собирался. Прошло минут пять, прежде чем из кабинета выглянул Кузнецов: \n" +
                "      - Ты тут, Корнилов? Зайди. \n" +
                "      Стас снова зашел в кабинет. Гость сидел на подоконнике и оценивающе смотрел на Стаса. Сам Кузнецов прошел и уселся за стол. \n" +
                "      - Вот только его могу предложить в помощь, - сказал он, глядя на гостя, а потом посмотрел на Стаса. – Повезло тебе, Корнилов, твой шанс вступить в поисковый отряд. \n" +
                "      - Мне хотя бы троих, Леха, подумай, может ещё кого выдернуть сможешь? \n" +
                "      - Да я бы дал, Гавр, но говорю же, все при делах сейчас, людей не хватает, а новых брать твой же батя запретил. Только его и дам, и то под твое слово, что перед Игорь Игоревичем меня прикроешь. \n" +
                "      Гавар ещё раз смерил взглядом Стаса и СКС у него за спиной, потом, кивнув, спрыгнул с подоконника. \n" +
                "      - Ладно, есть у меня ещё пара ребят, не хотел их брать, но похоже придется. Поехали, Стас, по дороге всё расскажу. \n" +
                "      - А куда… что вообще… - растерянно спросил Корнилов, глядя на Кузнецова. \n" +
                "      - По возращению запишу тебя задним числом, сейчас времени нет, езжай с ним. – ответил тот и вернулся к своим бумагам. \n "));

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

    }



    //Загрузка имени
    public void getData(View view) {
        try {
            FileInputStream fileInput = openFileInput("user_data.txt");
            InputStreamReader reader = new InputStreamReader(fileInput);
            BufferedReader buffer = new BufferedReader(reader);
            StringBuffer strBuffer = new StringBuffer();
            String lines;
            while ((lines = buffer.readLine()) != null) {
                strBuffer.append("Добро пожаловать, " +lines);
            }
            textView2.setText(strBuffer.toString());
        } catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        } }
//    int music;
//    @Override
//    protected void onStop(){
//        super.onStop();
//        stopService(new Intent(this, MyService.class));
//
//    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//        soundPlay2(musicSound);
//    }
//    @Override
//    protected void onStart(){
//        super.onStart();
//        soundPlay(musicSound);
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
//
//        } else
//
//            sound.start();
//        sound.setLooping(true);  }

//
//    int length;
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
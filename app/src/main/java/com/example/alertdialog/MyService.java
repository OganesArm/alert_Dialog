package com.example.alertdialog;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    } int music;
    private MediaPlayer musicSound;
//@Override
//    public void onCreate() {
//        super.onCreate();
//    musicSound = MediaPlayer.create(this, R.raw.music);
//    musicSound.start();
//    musicSound.setLooping(true);
//
//    }
//
//    protected void onStop(){
//        super.onStop();
//        soundPlay2(musicSound);
//    }
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
//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        musicSound = MediaPlayer.create(this, R.raw.music);
//        musicSound.start();
//        musicSound.setLooping(true);
//        return START_STICKY;
//    }
//    @Override
//    public void onDestroy() {
//        musicSound.stop();
//        musicSound.release();
//    }

    //    public void soundPlay(MediaPlayer sound) {
//        if (sound.isPlaying()) {
//            sound.pause();
//
//        } else
//            sound.start();
//            sound.setLooping(true);  }


//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        //твой код
//        return Service.START_NOT_STICKY;
//    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }
    @Override
    public void onCreate() {
        super.onCreate();
        musicSound = MediaPlayer.create(this, R.raw.music);
        musicSound.setLooping(true);

    }
    //intent.getBooleanExtra("pause", false) == true тогда player.pause()
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        musicSound.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        musicSound.stop();
    }




//    @Override
//    public void setTheme(int resid) {
//        super.setTheme(resid);
//        musicSound.stop();
//        musicSound.release();
//    }
//
//    @Override
//    public void onDestroy() {
//        //
//        return Service.START_STICKY;
//    }

//    public void onStop() {
//        musicSound.stop();
//        musicSound.release();
//    }
}


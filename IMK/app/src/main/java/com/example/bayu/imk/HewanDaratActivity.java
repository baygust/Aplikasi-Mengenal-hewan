package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HewanDaratActivity extends AppCompatActivity {
    MediaPlayer songpilihhewan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan_darat);

        songpilihhewan = MediaPlayer.create(this, R.raw.pilihhewandarat);
        songpilihhewan.setLooping(true);
        songpilihhewan.setVolume(1,1);
        songpilihhewan.start();
    }

    public void kembalikemain1 (View view) {
        Intent kembali1 = new Intent(this, MainActivity.class);
        startActivity(kembali1);
        songpilihhewan.stop();

    }
    public void sapi (View view) {
        Intent kesapi = new Intent(this, SapiActivity.class);
        startActivity(kesapi);
        songpilihhewan.stop();
    }
    public void kambing (View view) {
        Intent kekambing = new Intent(this, KambingActivity.class);
        startActivity(kekambing);
        songpilihhewan.stop();
    }
    public void harimau (View view) {
        Intent keharimau = new Intent(this, HarimauActivity.class);
        startActivity(keharimau);
        songpilihhewan.stop();
    }
    public void kucing (View view) {
        Intent kekucing = new Intent(this, KucingActivity.class);
        startActivity(kekucing);
        songpilihhewan.stop();
    }
    public void gajah (View view) {
        Intent kegajah = new Intent(this, GajahActivity.class);
        startActivity(kegajah);
        songpilihhewan.stop();
    }
    public void orangutan (View view) {
        Intent keorangutan = new Intent(this, OrangutanActivity.class);
        startActivity(keorangutan);
        songpilihhewan.stop();
    }
    }




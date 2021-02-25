package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pausActivity extends AppCompatActivity {
    MediaPlayer soundpaus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paus);

        soundpaus= MediaPlayer.create(this,R.raw.suarapaus);
    }
    public void suarapaus (View view){
        soundpaus.start();
    }

    public void pauskembalikelaut(View view) {
        Intent pauskembali = new Intent(this, HewanLautActivity.class);
        startActivity(pauskembali);
        soundpaus.stop();
    }
}

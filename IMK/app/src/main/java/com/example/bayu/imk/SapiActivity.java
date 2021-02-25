package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SapiActivity extends AppCompatActivity {
    MediaPlayer soundsapi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapi);

        soundsapi = MediaPlayer.create(this,R.raw.suarasapi);
    }
    public void suarasapi (View view){
        soundsapi.start();
    }

    public void sapikembalikesuara (View view) {
        Intent sapikembali = new Intent(this, HewanDaratActivity.class);
        startActivity(sapikembali);
        soundsapi.stop();
    }
}

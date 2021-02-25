package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KucingActivity extends AppCompatActivity {
    MediaPlayer soundkucing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kucing);
        soundkucing = MediaPlayer.create(this,R.raw.suarakucing);
    }
    public void suarakucing (View view){
        soundkucing.start();
    }

    public void kucingkembalikesuara(View view) {
        Intent kucingkembali = new Intent(this, HewanDaratActivity.class);
        startActivity(kucingkembali);
        soundkucing.stop();
    }
}

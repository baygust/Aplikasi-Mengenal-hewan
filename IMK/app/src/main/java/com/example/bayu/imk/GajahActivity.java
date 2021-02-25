package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GajahActivity extends AppCompatActivity {
    MediaPlayer soundgajah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gajah);

        soundgajah = MediaPlayer.create(this,R.raw.suaragajah);
    }
    public void suaragajah (View view){

        soundgajah.start();
    }
    public void gajahkembalikesuara(View view) {
        Intent gajahkembali = new Intent(this, HewanDaratActivity.class);
        startActivity(gajahkembali);
        soundgajah.stop();

    }
}

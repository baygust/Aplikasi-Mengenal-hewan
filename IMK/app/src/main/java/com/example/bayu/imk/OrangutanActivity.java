package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrangutanActivity extends AppCompatActivity {
    MediaPlayer soundorangutan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orangutan);

        soundorangutan = MediaPlayer.create(this,R.raw.suaraorangutan);
    }

    public void suaraorangutan (View view){

        soundorangutan.start();
    }
    public void orangutankembalikesuara(View view) {
        Intent orangutankembali = new Intent(this, HewanDaratActivity.class);
        startActivity(orangutankembali);
        soundorangutan.stop();

    }

}

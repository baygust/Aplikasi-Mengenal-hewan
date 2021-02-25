package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KambingActivity extends AppCompatActivity {

    MediaPlayer soundkambing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kambing);

        soundkambing = MediaPlayer.create(this,R.raw.suarakambing);
    }
    public void suarakambing (View view){

        soundkambing.start();
    }
    public void kambingkembalikesuara(View view) {
        Intent kambingkembali = new Intent(this, HewanDaratActivity.class);
        startActivity(kambingkembali);
        soundkambing.stop();

    }
}

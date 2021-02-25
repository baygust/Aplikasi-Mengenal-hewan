package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HarimauActivity extends AppCompatActivity {
    MediaPlayer soundharimau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harimau);

        soundharimau = MediaPlayer.create(this,R.raw.suaraharimau);
    }
    public void suaraharimau (View view){

        soundharimau.start();
    }
    public void harimaukembalikesuara(View view) {
        Intent harimaukembali = new Intent(this, HewanDaratActivity.class);
        startActivity(harimaukembali);
        soundharimau.stop();

    }
}

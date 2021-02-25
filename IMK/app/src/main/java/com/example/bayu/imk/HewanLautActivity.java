package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HewanLautActivity extends AppCompatActivity {
    MediaPlayer songpilihhewan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan_laut);

        songpilihhewan2 = MediaPlayer.create(this, R.raw.pilihhewanlaut);
        songpilihhewan2.setLooping(true);
        songpilihhewan2.setVolume(1,1);
        songpilihhewan2.start();
    }

    public void kembalikemain2 (View view) {
        Intent kembali2 = new Intent(this, MainActivity.class);
        startActivity(kembali2);
        songpilihhewan2.stop();

    }

    public void lumba (View view) {
        Intent kelumba = new Intent(this, LumbaActivity.class);
        startActivity(kelumba);
        songpilihhewan2.stop();
    }
    public void paus (View view) {
        Intent kepaus = new Intent(this, pausActivity.class);
        startActivity(kepaus);
        songpilihhewan2.stop();
    }
    public void anjinglaut (View view) {
        Intent keanjinglaut = new Intent(this, AnjinglautActivity.class);
        startActivity(keanjinglaut);
        songpilihhewan2.stop();
    }


}

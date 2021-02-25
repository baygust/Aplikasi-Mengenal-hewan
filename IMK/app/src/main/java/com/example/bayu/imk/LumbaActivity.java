package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LumbaActivity extends AppCompatActivity {
    MediaPlayer soundlumba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumba);

        soundlumba= MediaPlayer.create(this,R.raw.suaralumba);
    }
    public void suaralumba (View view){
        soundlumba.start();
    }

    public void lumbakembalikelaut(View view) {
        Intent lumbakembali = new Intent(this, HewanLautActivity.class);
        startActivity(lumbakembali);
        soundlumba.stop();
    }
}

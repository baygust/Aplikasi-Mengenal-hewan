package com.example.bayu.imk;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnjinglautActivity extends AppCompatActivity {
    MediaPlayer soundanjinglaut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anjinglaut);

        soundanjinglaut= MediaPlayer.create(this,R.raw.suaraanjinglaut);
    }
    public void suaraanjinglaut (View view){
        soundanjinglaut.start();
    }

    public void anjinglautkembalikelaut(View view) {
        Intent anjinglautkembali = new Intent(this, HewanLautActivity.class);
        startActivity(anjinglautkembali);
        soundanjinglaut.stop();
    }
}

package com.example.bayu.imk;

import android.app.AlertDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer song1;
    private AlertDialog.Builder alertDialogBuilder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song1 = MediaPlayer.create(this, R.raw.mainsong);
        song1.setLooping(true);
        song1.setVolume(1,1);
        song1.start();
    }

    public void hewandarat (View view){
        Intent kehewandarat = new Intent(this,HewanDaratActivity.class);
        startActivity(kehewandarat);
        song1.stop();
    }

    public void hewanlaut (View view){
        Intent kehewanlaut = new Intent(this,HewanLautActivity.class);
        startActivity(kehewanlaut);
        song1.stop();
    }

    public void exit (View view){

        moveTaskToBack(true);
        song1.stop();
    }

}

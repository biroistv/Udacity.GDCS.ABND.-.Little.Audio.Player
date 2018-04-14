package com.example.biro.udacitygdcsabnd_littleaudioplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.bensound_betterdays);
    }

    public void playAudio(View view)
    {
        this.mp.start();
    }

    public void pauseAudio(View view)
    {
        this.mp.pause();
    }

}

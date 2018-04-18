package com.example.biro.udacitygdcsabnd_littleaudioplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // MediaPlayer class
        mp = MediaPlayer.create(this, R.raw.bensound_betterdays);

        playAudio(mp);
        pauseAudio(mp);

        // Displaying a toast message when the current audio is finished.
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast toast = Toast.makeText(MainActivity.this, "Finished", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    private void playAudio(final MediaPlayer mp)
    {
        (findViewById(R.id.play_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

    }

    private void pauseAudio(final MediaPlayer mp)
    {
        (findViewById(R.id.pause_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
    }
}

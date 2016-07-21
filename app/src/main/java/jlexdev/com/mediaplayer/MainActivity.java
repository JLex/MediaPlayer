package jlexdev.com.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnPlay, btnPause,btnStop;
    private MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = (ImageButton)findViewById(R.id.btn_play);
        btnPause = (ImageButton)findViewById(R.id.btn_pause);
        btnStop = (ImageButton)findViewById(R.id.btn_stop);

        media = MediaPlayer.create(MainActivity.this, R.raw.music_new);

        btnPlay.setOnClickListener(this);
        btnPause.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_play:
                media.start();
                break;

            case R.id.btn_pause:
                media.pause();
                break;

            case R.id.btn_stop:
                media.stop();
                MainActivity.this.finish(); // Cierra la App al dar Stop
                break;
        }
    }
}

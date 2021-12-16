package com.example.a1nt18is166_lab5_music_player;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button play,forward,rewind,pause,stop,reset;
    MediaPlayer mediaplayer;
    int starttime=0;
    int stoptime=0;
    int forwardtime=5000;
    int backwardtime=5000;

    ImageView iv;
    boolean flag;
    int image []={R.drawable.music1,R.drawable.music8,R.drawable.music2,R.drawable.music7};
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView) findViewById(R.id.img);
        play= findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        forward=findViewById(R.id.forward);
        rewind=findViewById(R.id.rewind);
        stop=findViewById(R.id.stop);
        reset=findViewById(R.id.restart);

                mediaplayer= MediaPlayer.create(this,R.raw.music1);

        flag=true;
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Play media now",Toast.LENGTH_SHORT).show();
                mediaplayer.start();
                iv.setImageResource(image[i]);
                i++;
                if(i==4)
                    i=0;
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Pausing media now",Toast.LENGTH_SHORT).show();
                mediaplayer.stop();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Stopping media now",Toast.LENGTH_SHORT).show();
                mediaplayer.start();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Re starting media now",Toast.LENGTH_SHORT).show();
              mediaplayer.seekTo(starttime);
                mediaplayer.start();
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentpos=mediaplayer.getCurrentPosition();
                if((currentpos+forwardtime)<=(stoptime=mediaplayer.getDuration()))
                {
                    mediaplayer.seekTo(currentpos+forwardtime);
                }
            }
        });
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentpos=mediaplayer.getCurrentPosition();
                if((currentpos+forwardtime)<=(stoptime=mediaplayer.getDuration()))
                {
                    mediaplayer.seekTo(currentpos+backwardtime);
                }
            }
        });
    }
}
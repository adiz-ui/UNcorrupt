package com.example.uncorrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class Networking extends AppCompatActivity {
    public TextView content3;
    public ImageButton texttoaudio;
    public TextToSpeech contentAudio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking);
        content3 = findViewById(R.id.content3);
        texttoaudio = findViewById(R.id.speak3);
        contentAudio = new TextToSpeech(Networking.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR)
                {
                    contentAudio.setLanguage(Locale.ENGLISH);
                }

            }
        });

        texttoaudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contxt3 = content3.getText().toString();
                contentAudio.speak(contxt3, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }

    @Override
    protected void onPause() {
        if(contentAudio!=null)
        {
            contentAudio.stop();
            contentAudio.shutdown();
        }
        super.onPause();
    }
}
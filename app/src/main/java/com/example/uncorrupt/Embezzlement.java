package com.example.uncorrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class Embezzlement extends AppCompatActivity {
    public ImageButton speak1;
    public TextToSpeech textToSpeech1;
    public TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embezzlement);
        text1 = findViewById(R.id.content1);
        speak1 = findViewById(R.id.speak1);
        textToSpeech1 = new TextToSpeech(Embezzlement.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status!=TextToSpeech.ERROR);
                textToSpeech1.setLanguage(Locale.ENGLISH);
            }
        });

        speak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Contxt = text1.getText().toString();
                textToSpeech1.speak(Contxt, TextToSpeech.QUEUE_FLUSH, null); 
            }
        });



    }

    @Override
    protected void onPause() {
        if(textToSpeech1!=null) {
            textToSpeech1.stop();
            textToSpeech1.shutdown();
        }
        super.onPause();
    }
}
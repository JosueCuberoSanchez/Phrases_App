package com.josuecubero.phrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View button, button2, button3, button4, button5, button6, button7, button8;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button = findViewById(R.id.button);
        this.button2 = findViewById(R.id.button2);
        this.button3 = findViewById(R.id.button3);
        this.button4 = findViewById(R.id.button4);
        this.button5 = findViewById(R.id.button5);
        this.button6 = findViewById(R.id.button6);
        this.button7 = findViewById(R.id.button7);
        this.button8 = findViewById(R.id.button8);
    }

    public void traducePhrase(View view){
        //The next commented lines could be used as well, I did ifs because Toaster Text...
        /*int id = view.getId();
        String myId = view.getResources().getResourceEntryName(view.getId());
        int resource = getResources().getIdentifier(myId, "raw", "com.josuecubero.phrasesapp");
        this.mediaPlayer = MediaPlayer.create(this, resource);
        this.mediaPlayer.start();*/
        String phrase = "";
        int resource = 0;
        if(view == this.button){
            phrase = "Je parle anglais";
            resource = R.raw.doyouspeakenglish;
        } else if(view == this.button2){
            phrase = "Bonjour";
            resource = R.raw.hello;
        } else if(view == this.button3){
            phrase = "Je vis dans";
            resource = R.raw.ilivein;
        } else if(view == this.button4){
            phrase = "S'il vous plaît";
            resource = R.raw.please;
        } else if(view == this.button5){
            phrase = "Bonsoir";
            resource = R.raw.goodevening;
        } else if(view == this.button6){
            phrase = "Ca va?";
            resource = R.raw.howareyou;
        } else if(view == this.button7){
            phrase = "Je m'appelle";
            resource = R.raw.mynameis;
        } else if(view == this.button8){
            phrase = "Bienvenue";
            resource = R.raw.welcome;
        }

        this.mediaPlayer = MediaPlayer.create(this, resource);
        this.mediaPlayer.start();

        Toast.makeText(this, phrase, Toast.LENGTH_LONG).show();
    }
}

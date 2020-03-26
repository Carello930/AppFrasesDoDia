package com.leaoartes.appfrasesdodia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityPhrasesGod(View view){

        Intent intent = new Intent(this, phrasesGod.class);
        startActivity(intent);
    }

    public void activityPhrasesGoodMorning(View view){

        Intent intent = new Intent(this, phrasesGoodMorning.class);
        startActivity(intent);
    }

    public void activityPhrasesPeace(View view){

        Intent intent = new Intent(this, phrasesPeace.class);
        startActivity(intent);
    }


}





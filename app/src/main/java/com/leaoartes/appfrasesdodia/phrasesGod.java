package com.leaoartes.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class phrasesGod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_god);
    }

    public void generateNewPhrase(View view) {
        String[] Phrase = {
                "Enquanto Deus for meu chão, não há quem me derrube,",
                "Talvez Deus não mude sua situação, mas ele está usando essa situação para mudar você.",
                "Nenhum obstaculo é grande demais quando fazemos nossa parte e confiamos em Deus.",
                "Procure Deus da mesma forma que você procurou o carregador quando estava com 3% de bateria.",
                "Nunca se esqueca que nos dias mais dificeis da sua vida, Deus está cuidando de você."
        };
        int numRandom = new Random().nextInt(5);

        TextView text = findViewById(R.id.resultText);
        text.setText(Phrase[numRandom]);
    }
}

package com.leaoartes.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class phrasesGoodMorning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_good_morning);
    }

      public void generateNewPhrase(View view) {
        String[] Phrase = {
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "A sua irritação não solucionará problema algum, o seu mau humor não modifica a vida. Não estrague o seu dia.",
                "Não importa a cor do céu, quem faz o dia bonito é você.",
                "Comece o dia com energia positiva e não permita que nada roube sua alegria.",
                "A vida sempre nos oferece uma segunda chance e ela se chama amanhecer. Bom dia!"
        };
        int numRandom = new Random().nextInt(5);

        TextView text = findViewById(R.id.resultText);
        text.setText(Phrase[numRandom]);
    }

}

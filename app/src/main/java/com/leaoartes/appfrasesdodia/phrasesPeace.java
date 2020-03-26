package com.leaoartes.appfrasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class phrasesPeace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases_peace);
    }

    public void generateNewPhrase(View view) {
        String[] Phrase = {
                "Seja seletivo em suas batalhas, as vezes a paz vale mais do que estar certo.",
                "Torne sua casa um lugar de paz, e terá clareza para solucionar seus problemas.",
                "É na paz que a maior tempestade perde força.",
                "Não existe um caminho para a paz, a paz é o caminho.",
                "Se o seu coração sentiu paz, a escolha foi certa."
        };
        int numRandom = new Random().nextInt(5);

        TextView text = findViewById(R.id.resultText);
        text.setText(Phrase[numRandom]);
    }
}

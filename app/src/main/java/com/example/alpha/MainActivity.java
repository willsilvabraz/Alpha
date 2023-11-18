package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tela;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializar();
        Transacao transacao = new Transacao();
        transacao.novaTransacao("Receita", "receita de frelancer", "pagamento do projeto Alpha", 2500.50);

        tela.setText(String.valueOf(transacao.getTudo()));
    }

    public void inicializar(){
        tela = findViewById(R.id.tela);
    }
}
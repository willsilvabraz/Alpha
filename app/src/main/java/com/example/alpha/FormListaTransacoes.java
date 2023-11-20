package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FormListaTransacoes extends AppCompatActivity {
    private ListView test;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_lista_transacoes);
        test = findViewById(R.id.layoutLista);

        String[] nome = {"Willian", "Braz"};
        FormInserirTransacao transacoes = new FormInserirTransacao();
        transacoes.fluxoDeCaixa.registrarTransacao("asdasd","sadasdasd","asdasdasd",200);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, transacoes.getFluxoDeCaixa().getListaTransacoes());
        test.setAdapter(adapter);

    }

}
package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormInserirTransacao extends AppCompatActivity {

    private EditText tipo, categoria, descricao, valor;
    private Button bt_registrar, bt_lista, bt_voltar;
    FluxoDeCaixa fluxoDeCaixa = new FluxoDeCaixa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_inserir_transacao);
        InicializarComponentes();

        bt_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrar("teste",categoria.getText().toString(), descricao.getText().toString(),200);

            }
        });

        bt_lista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FormInserirTransacao.this, FormListaTransacoes.class);
                startActivity(intent);
            }
        });



    }

    public void Registrar (String tipo, String categoria, String descricao, double valor){
        fluxoDeCaixa.registrarTransacao(tipo, categoria, descricao, valor);
    }
    public void InicializarComponentes(){
        tipo = findViewById(R.id.inputTipo);
        categoria = findViewById(R.id.inputCategoria);
        descricao = findViewById(R.id.inputdescricao);
        valor = findViewById(R.id.inputValor);
        bt_registrar = (Button) findViewById(R.id.bt_cadatrar);
        bt_lista = (Button) findViewById(R.id.bt_lista);
        bt_voltar = (Button) findViewById(R.id.bt_voltar);
    }

    public FluxoDeCaixa getFluxoDeCaixa(){
        return this.fluxoDeCaixa;
    }

}
package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FluxoDeCaixa{
    private double saldo;
    private List<Transacao> transacoes;

    public FluxoDeCaixa(){
        this.saldo = 0;
        this.transacoes = new ArrayList<>();
    }

    public void registrarTransacao(String tipo, String categoria, String descricao, double valor){

        Transacao transacao = new Transacao(tipo, categoria, descricao, valor);
        transacoes.add(transacao);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public  int getSizeTransacoes(){
        return transacoes.size();
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public List<String> getListaTransacoes(){
        List<String> transacoes1 = new ArrayList<>();
        for( Transacao i : transacoes){
            transacoes1.add(i.getTudo());
        }
        return transacoes1;
    }
}
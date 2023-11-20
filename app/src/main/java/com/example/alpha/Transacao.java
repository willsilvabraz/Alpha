package com.example.alpha;

public class Transacao {
    private String tipo, categoria, descricao;
    private double valor;

    public Transacao(String tipo, String categoria, String descricao, double valor){
        this.categoria = categoria;
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public String getTipo(){
        return this.tipo;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String getTudo(){
        return "\nTipo " + tipo + " \nCategoria: " + categoria + ". \nDescrição: " + descricao + ". \nValor " + String.valueOf(valor);
    }


}
package com.company;

public class Periferico {
    private String nome;
    private String especificacao;

    public Periferico(String nome, String especificacao) {
        this.nome = nome;
        this.especificacao = especificacao;
    }

    @Override
    public String toString() {
        return "Periferico: " +
                "\n\tNome: " + nome +
                "\n\tEspecificacao: " + especificacao;
    }

    public Periferico() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}

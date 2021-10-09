package com.company;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String email;
    private float fone;
    private String observacao;
    private ArrayList<OrdenServico>ordenServicos=new ArrayList<>();

    public void setEquipamentos(OrdenServico ordenServicos){
        this.ordenServicos.add(new OrdenServico());
    }

    public Cliente(String nome, String email, float fone, String observacao) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "\nCliente: " +
                "\nNome: " + nome +
                "\nEmail: " + email +
                "\nTelefone: " + fone +
                ", observacao: " + observacao +
                ", equipamentos: " + ordenServicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getFone() {
        return fone;
    }

    public void setFone(float fone) {
        this.fone = fone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
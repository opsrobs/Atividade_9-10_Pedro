package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private String nome;
    private String email;
    private String fone;
    private String observacao;
    private ArrayList<OrdenServico>ordenServicos=new ArrayList<>();


    public void setOrdenServicos(OrdenServico ordenServico, int tamLista){
        if (ordenServicos.size() <= tamLista){
            this.ordenServicos.add(ordenServico);
        }
    }

    public Cliente(String nome, String email, String fone, String observacao) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.observacao = observacao;
    }

    public Cliente(String nome, String email, String fone, String observacao, ArrayList<OrdenServico> ordenServicos) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.observacao = observacao;
        this.ordenServicos = ordenServicos;
    }

    public Cliente() {

    }


        @Override
    public String toString() {
        return "\nCliente: " +
                "\n\tNome: " + nome +
                "\n\tEmail: " + email +
                "\n\tTelefone: " + fone +
                "\n\tObservacao: " + observacao+"\n\n"
                 + ordenServicos;
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

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ArrayList<OrdenServico> getOrdenServicos() {
        return ordenServicos;
    }

    public void setOrdenServicos(ArrayList<OrdenServico> ordenServicos) {
        this.ordenServicos = ordenServicos;
    }
}

package com.company;

import java.util.ArrayList;

public class Equipamento {
    private String nome;
    private String tipo;
    private String modelo;
    private String Defeito;
    private ArrayList<Periferico>perifericos= new ArrayList<>();

    public void setPerifericos(Periferico periferico){
        this.perifericos.add(new Periferico());
    }

    public Equipamento(String nome, String tipo, String modelo, String defeito) {
        this.nome = nome;
        this.tipo = tipo;
        this.modelo = modelo;
        Defeito = defeito;
    }

    public Equipamento() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDefeito() {
        return Defeito;
    }

    public void setDefeito(String defeito) {
        Defeito = defeito;
    }
}

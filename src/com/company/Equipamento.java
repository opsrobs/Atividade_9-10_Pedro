package com.company;

import java.util.ArrayList;

public class Equipamento {
    private String nome;
    private String tipo;
    private String modelo;
    private String Defeito;
    private final ArrayList<Periferico>perifericos= new ArrayList<>();

    public void setPerifericos(Periferico periferico){
        this.perifericos.add(periferico);
    }

    public String limiteLista(int tamUser){
        ArraysRandons randons = new ArraysRandons();
        Servicos srv = new Servicos();
        if (this.perifericos.size()==tamUser ){
            return "fim";
        }else
            return srv.random(randons.nomePeriferico());
    }

    @Override
    public String toString() {
        return "\n\nEquipamento:" +
                "\n\tNome: " + nome +
                "\n\tTipo: " + tipo +
                "\n\tModelo: " + modelo +
                "\n\tDefeito: " + Defeito +
                "\n\n" + perifericos;
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

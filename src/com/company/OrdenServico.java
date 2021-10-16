package com.company;

import java.util.Date;

public class OrdenServico {
    private int numeroOS;
    private Date data;
    private String observacao;
    private String status;
    private double valor;
    private Equipamento equipamento;

    public OrdenServico(int numeroOS, Date data, String observacao, String status, double valor, Equipamento equipamento) {
        this.numeroOS = numeroOS;
        this.data = data;
        this.observacao = observacao;
        this.status = status;
        this.valor = valor;
        this.equipamento = equipamento;
    }
    public OrdenServico() {

    }

    @Override
    public String toString() {
        return "Ordens de Serviço: " +
                "\n\tNº Orden de Servico: " + numeroOS +
                "\n\tData: " + data +
                "\n\tObservacao: "+ observacao +
                "\n\tStatus: " + status +
                "\n\tValor: " + valor
                + equipamento;
    }

    public int getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
}

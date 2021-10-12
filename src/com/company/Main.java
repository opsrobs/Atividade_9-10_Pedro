package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Servicos srv=new Servicos();
        ArraysRandons ar=new ArraysRandons();

        Cliente cliente = new Cliente();
        Equipamento equipamento;
        Periferico periferico;
        OrdenServico ordenServico;

        String nome,email,fone,observacao;                 //dados do cliente

        String nomeEq, tipoEq, modeloEq, defeitoEq;

        String nomePeriferico, especificacao;               //dados perifericos

        int numeroOs=0;                                     //dados da os
        Date data = new Date();                             //dados da os
        String obs, status;                                 //dados da os
        double valor;                                       //dados da os

        final String validador = "fim";

        nome=srv.random(ar.nomes());
        while (!nome.equalsIgnoreCase(validador)){
            email=srv.random(ar.email());
            fone=srv.random(ar.telefone());
            observacao=srv.random(ar.observacaoDoCliente());

            numeroOs=srv.randomN(ar.numeroOrdenServico());
            while (numeroOs !=0){
                data=srv.converterData(srv.random(ar.datasDeAtendimentoOS()));
                obs=srv.random(ar.observacaoDoCliente());
                status=srv.random(ar.status());
                valor=srv.randomD(ar.valor());

                nomeEq=srv.random(ar.nomeEquipamento());
                tipoEq=srv.random(ar.tipoEquipamento());
                modeloEq=srv.random(ar.modeloEquipamento());
                defeitoEq=srv.random(ar.defeitoEquipamento());

                equipamento = new Equipamento(nomeEq,tipoEq,modeloEq,defeitoEq);
                nomePeriferico=srv.random(ar.nomePeriferico());
                while (!nomePeriferico.equalsIgnoreCase(validador)){
                    especificacao=srv.random(ar.especificacaoPeriferico());
                    periferico=new Periferico();
                    equipamento.setPerifericos(periferico);
                    nomePeriferico=srv.random(ar.nomePeriferico());

                }

                ordenServico = new OrdenServico(numeroOs,data,obs,status,valor,equipamento);
                cliente.setOrdenServicos(ordenServico);
                numeroOs=srv.randomN(ar.numeroOrdenServico());
            }
            cliente = new Cliente(nome,email,fone,observacao);
            srv.setClientes(cliente);
            nome=srv.random(ar.nomes());

        }

        System.out.println(cliente.toString());




    }
}

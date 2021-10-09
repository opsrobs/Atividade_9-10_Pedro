package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Cliente cliente;
        ArraysRandons aleatorio= new ArraysRandons();
        Servicos srv=new Servicos();

        String nome,email,fone,obs;
        String nomePeriferico,especificacao;
        int numOs;
        double valor;
        Date d = new Date();
        String data,status;


        nome=srv.random(aleatorio.nomes());
        while (!nome.equalsIgnoreCase("fim")){
            email=srv.random(aleatorio.email());
            fone=srv.random(aleatorio.telefone());
            obs=srv.random(aleatorio.observacaoDoCliente());
            cliente=new Cliente(nome,email,fone,obs);
            numOs=srv.randomN(aleatorio.numeroOrdenServico());

            nomePeriferico=srv.random(aleatorio.nomePeriferico());
            while (!nomePeriferico.equalsIgnoreCase("fim")) {
                especificacao=srv.random(aleatorio.especificacaoPeriferico());
                while (numOs != 0) {
                    data = srv.random(aleatorio.datasDeAtendimentoOS());
                    d = srv.converterData(data);
                    obs = srv.random(aleatorio.descricaoOS());
                    status = srv.random(aleatorio.status());
                    valor = srv.randomD(aleatorio.valor());
                }
            }
        }

    }
}

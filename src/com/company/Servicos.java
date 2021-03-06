package com.company;

import java.rmi.StubNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Servicos {
    ArraysRandons randons = new ArraysRandons();
    public ArrayList<Cliente>clientes=new ArrayList<>();

    public void setClientes(String nome, String email, String fone, String observacao, ArrayList<OrdenServico> ordenServicos){
        this.clientes.add(new Cliente(nome,email,fone,observacao,ordenServicos));
    }
    public String random(String[] randomize){
        Random random = new Random();
        int index = random.nextInt(randomize.length);
        return randomize[index];
    }
    public int randomN(int[] randomize){
        Random random = new Random();
        int index = random.nextInt(randomize.length);
        return randomize[index];
    }
    public double randomD(double[] randomize){
        Random random = new Random();
        int index = random.nextInt(randomize.length);
        return randomize[index];
    }

    public String limiteLista(int tamUser){
        if (this.clientes.size()==tamUser ){
            return "fim";
        }else
            return this.random(randons.nomes());
    }

    public String OrdensDeServicoComSeusRespectivosDados(){
        StringBuilder dados= new StringBuilder();
        for (Cliente cliente : clientes){
            dados.append(cliente.getOrdenServicos().toString());
        }
        return dados.toString();
    }
    public Date converterData(String d){
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        boolean dataValida;
        do{
            try {
                data= dataFormatada.parse(d);
                dataValida=true;
            }
            catch (Exception e)
            {
                dataValida=false;
            }
        }
        while (!dataValida);
        return data;
    }
}

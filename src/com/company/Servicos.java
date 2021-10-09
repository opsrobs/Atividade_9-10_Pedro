package com.company;

import java.rmi.StubNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Servicos {
    public ArrayList<Cliente>clientes=new ArrayList<>();

    public void setClientes(Cliente clientes){
        this.clientes.add(new Cliente());
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

    public String OrdensDeServicoComSeusRespectivosDados(){
        String dados="";
        for (Cliente cliente : clientes){
            dados+= cliente.getOrdenServicos().toString();
        }
        return dados;
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

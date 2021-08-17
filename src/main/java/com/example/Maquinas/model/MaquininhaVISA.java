package com.example.Maquinas.model;


import com.example.Maquinas.service.ProcessaPago;

public class MaquininhaVISA extends Compra implements ProcessaPago {


    @Override
    public boolean ProcessaPagamento(Compra compra) {
        if(compra.getValorDaCompra() >= 0) {
            System.out.println("Compra processada com sucesso!(VISA)");
            System.out.println("Valor da compra: " + compra.getValorDaCompra());
            System.out.println("ID da transação: " + compra.getIdCompra());
            System.out.println("Taxa: " + compra.getTaxa());
            return true;
        }
        else {
            return false;
        }
    }
}

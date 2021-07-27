package com.example.Maquinas;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class MaquininhaELO extends Compra implements ProcessaPago {

    @Override
    public boolean ProcessaPagamento(Compra compra, double ValordaCompra) {
//        System.out.print("Digite o valor para a máquina ELO: ");
        ValordaCompra = ValordaCompra;
        if (compra.getValorDaCompra() >= 0 && compra.getIDcompra() == compra.getIDcompra()) {
            System.out.println("Compra processada com sucesso!(ELO)");
            System.out.println("Valor da compra: " + String.format("%.2f", ValordaCompra));
            System.out.println("ID da transação: " + String.format("%.0f", getIDcompra()));
            System.out.println("Taxa: " + getTaxa());
            return true;
        } else {
            return false;
        }
    }
}

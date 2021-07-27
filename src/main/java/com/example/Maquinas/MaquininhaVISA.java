package com.example.Maquinas;


import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Component
public class MaquininhaVISA extends Compra implements ProcessaPago {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

    @Override
    public boolean ProcessaPagamento(Compra compra, double ValordaCompra) {
        ValordaCompra = ValordaCompra;
        if(compra.getValorDaCompra() >= 0 && compra.getIDcompra() == this.getIDcompra()) {
            System.out.println("Compra processada com sucesso!(VISA)");
            System.out.println("Valor da compra: " + String.format("%.2f", ValordaCompra));
            System.out.println("ID da transação: " + String.format("%.0f", getIDcompra()));
            System.out.println("Taxa: " + getTaxa());
            return true;
        }
        else {
            return false;
        }
    }
}

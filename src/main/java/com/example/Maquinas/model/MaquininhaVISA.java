package com.example.Maquinas.model;


import com.example.Maquinas.service.ProcessaPago;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class MaquininhaVISA extends Compra implements ProcessaPago {


    @Override
    public boolean ProcessaPagamento(Compra compra) {
        if(compra.getValorDaCompra() >= 0) {
            System.out.println("Compra processada com sucesso!(VISA)");
            System.out.println("Valor da compra: " + compra.getValorDaCompra());
            System.out.println("ID da transação: " + compra.getIDcompra());
            System.out.println("Taxa: " + compra.getTaxa());
            return true;
        }
        else {
            return false;
        }
    }
}

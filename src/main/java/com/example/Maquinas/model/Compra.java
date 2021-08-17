package com.example.Maquinas.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private Double valorDaCompra;
    private Integer idCompra;
    private Double taxa;

    public Compra(Double valorDaCompra, Integer idCompra, Double taxa) {
        this.valorDaCompra = valorDaCompra;
        this.idCompra = idCompra;
        this.taxa = taxa;
    }
}

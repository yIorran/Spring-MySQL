package com.example.Maquinas.controller;

import com.example.Maquinas.model.Compra;
import com.example.Maquinas.model.MaquininhaELO;
import com.example.Maquinas.model.MaquininhaVISA;
import com.example.Maquinas.repository.RepositoryGen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class Controller {

    @Autowired
    RepositoryGen repositoryGen;

    @PostMapping
    public void salvarCompra(@RequestBody Compra compra){
        repositoryGen.save(compra);
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<Object> buscarCompra(){

        return new ResponseEntity<Object>(repositoryGen.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/elo")
    public void salvaCompraElo(@RequestBody Compra compra){
        MaquininhaELO maquininhaELO = new MaquininhaELO();

        maquininhaELO.ProcessaPagamento(compra);
        repositoryGen.save(compra);
    }

    @PostMapping(value = "/visa")
    public void salvaCompraVisa(@RequestBody Compra compra){
        MaquininhaVISA maquininhaVISA = new MaquininhaVISA();

        maquininhaVISA.ProcessaPagamento(compra);
        repositoryGen.save(compra);
    }

}

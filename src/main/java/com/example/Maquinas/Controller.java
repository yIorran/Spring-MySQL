package com.example.Maquinas;

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
}

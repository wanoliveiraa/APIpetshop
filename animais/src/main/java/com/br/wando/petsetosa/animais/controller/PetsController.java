package com.br.wando.petsetosa.animais.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.wando.petsetosa.animais.model.Pets;
import com.br.wando.petsetosa.animais.services.IPets;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PetsController {
    @Autowired
    private IPets service;

    @PostMapping("/pets")
    public ResponseEntity<Pets> inserir(@RequestBody Pets novo){
        Pets pets =service.inserirNovo(novo);
        if(pets!=null){
            return ResponseEntity.ok(pets);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/pets")
    public ArrayList<Pets> getAll(){
       ArrayList<Pets> lista = service.listarAll();
        
        return lista;
    }

    @PutMapping("/pets")
    public ResponseEntity<Pets> atualizarDados(@RequestBody Pets novo){
        Pets pets =service.atualizar(novo);
        if(pets!=null){
            return ResponseEntity.ok(pets);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/pets/{id}")
    public ResponseEntity<Pets> getId(@PathVariable Integer id) {
        Pets pets=service.recuperarPeloid(id);
        if(pets!=null){
            return ResponseEntity.ok(pets);
        }
        return ResponseEntity.badRequest().build();
    }
    
    
}

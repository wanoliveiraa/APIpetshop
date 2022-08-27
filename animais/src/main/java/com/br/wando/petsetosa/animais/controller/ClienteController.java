package com.br.wando.petsetosa.animais.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.wando.petsetosa.animais.model.Cliente;

import com.br.wando.petsetosa.animais.services.ICliente;

@RestController
public class ClienteController {
    
    @Autowired
    private ICliente service;

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente novo){
        Cliente cliente =service.cadastarNovo(novo);
        if(cliente!=null){
            return ResponseEntity.ok(cliente);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/clientes")
    public ArrayList<Cliente> getAll(){
       ArrayList<Cliente> lista = service.recuperarTodos();
        
        return lista;
    }

    @PutMapping("/clientes")
    public ResponseEntity<Cliente> atualizarDados(@RequestBody Cliente novo){
        Cliente cliente =service.atualizarDados(novo);
        if(cliente!=null){
            return ResponseEntity.ok(cliente);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/clientes/{id}")
    public ResponseEntity<Cliente> deletar(@PathVariable Integer id){
        service.excluirCliente(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<Cliente> buscarId(@PathVariable Integer id){
       Cliente cliente= service.buscarPeloId(id);
        if(cliente!=null){
            return ResponseEntity.ok(cliente);
        }
        return ResponseEntity.badRequest().build();
    }
}

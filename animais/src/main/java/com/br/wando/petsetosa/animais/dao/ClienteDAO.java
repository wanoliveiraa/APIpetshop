package com.br.wando.petsetosa.animais.dao;

import org.springframework.data.repository.CrudRepository;

import com.br.wando.petsetosa.animais.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente,Integer>{
    
}

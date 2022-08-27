package com.br.wando.petsetosa.animais.dao;

import org.springframework.data.repository.CrudRepository;

import com.br.wando.petsetosa.animais.model.Pets;

public interface PetsDAO extends CrudRepository<Pets,Integer> {
    
}

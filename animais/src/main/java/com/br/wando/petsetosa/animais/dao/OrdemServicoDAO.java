package com.br.wando.petsetosa.animais.dao;

import org.springframework.data.repository.CrudRepository;

import com.br.wando.petsetosa.animais.model.OrdemServico;


public interface OrdemServicoDAO extends CrudRepository<OrdemServico,Integer> {
    
}

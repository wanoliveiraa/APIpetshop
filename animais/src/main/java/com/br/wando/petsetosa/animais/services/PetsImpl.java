package com.br.wando.petsetosa.animais.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.wando.petsetosa.animais.dao.PetsDAO;
import com.br.wando.petsetosa.animais.model.Pets;

@Service
public class PetsImpl implements IPets {

    @Autowired
    private PetsDAO dao;

    @Override
    public ArrayList<Pets> listarAll() {
        ArrayList<Pets> pets=(ArrayList<Pets>)dao.findAll();
        return pets;
    }

    @Override
    public Pets inserirNovo(Pets novo) {
        Pets pets=dao.save(novo);
        return pets;
    }

    @Override
    public Pets recuperarPeloid(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public Pets atualizar(Pets novo) {
        if(novo.getId()!=null && novo.getCliente().getId()!=null){
            return dao.save(novo);
        }
        return null;
    }
    
}

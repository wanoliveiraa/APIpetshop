package com.br.wando.petsetosa.animais.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.br.wando.petsetosa.animais.dao.ClienteDAO;
import com.br.wando.petsetosa.animais.model.Cliente;

@Service
public class ClienteImpl implements ICliente {
    
    @Autowired
    private ClienteDAO dao;

    @Override
    public Cliente cadastarNovo( Cliente novo) {
        Cliente resultado=dao.save(novo);
        return resultado;
    }

    @Override
    public ArrayList<Cliente> recuperarTodos() {
        ArrayList<Cliente> result=(ArrayList<Cliente>)dao.findAll();
        return result;
    }

    @Override
    public Cliente buscarPeloId(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirCliente(Integer id) {
        dao.deleteById(id);
    }

    @Override
    public Cliente atualizarDados(Cliente novo) {
        if(novo.getId()!=null){
            return dao.save(novo);
        }
        
        return null;
    }


}

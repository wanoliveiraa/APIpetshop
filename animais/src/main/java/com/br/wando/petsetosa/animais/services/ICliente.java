package com.br.wando.petsetosa.animais.services;

import java.util.ArrayList;

import com.br.wando.petsetosa.animais.model.Cliente;

public interface ICliente {
    public Cliente cadastarNovo(Cliente novo);
    public ArrayList<Cliente> recuperarTodos();
    public Cliente buscarPeloId(Integer id);
    public void excluirCliente(Integer id);
    public Cliente atualizarDados(Cliente novo);
}

package com.br.wando.petsetosa.animais.services;

import java.util.ArrayList;

import com.br.wando.petsetosa.animais.model.Pets;

public interface IPets {
   public ArrayList<Pets> listarAll();
   public Pets inserirNovo(Pets novo);
   public Pets recuperarPeloid(Integer id);
   public Pets atualizar(Pets novo); 
   
    
}

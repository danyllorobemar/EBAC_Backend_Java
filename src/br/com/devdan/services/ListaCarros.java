package br.com.devdan.services;

import br.com.devdan.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class ListaCarros<T extends Carro> {

    private List<T> carros = new ArrayList<>();

    public void adicionarCarros(T carro){
        carros.add(carro);
    }

    public void listarCarros(){
        for(T carro : carros){
            carro.exibirDetalhes();
        }
    }

}

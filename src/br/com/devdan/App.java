package br.com.devdan;

import br.com.devdan.domain.Carro;
import br.com.devdan.domain.Honda;
import br.com.devdan.domain.Toyota;
import br.com.devdan.services.ListaCarros;

public class App {
    public static void main(String[] args) {

        ListaCarros<Carro> listaCarros = new ListaCarros<>();

        listaCarros.adicionarCarros(new Honda("Fit"));
        listaCarros.adicionarCarros(new Honda("Civic"));
        listaCarros.adicionarCarros(new Toyota("Corolla"));
        listaCarros.adicionarCarros(new Toyota("Hilux"));

        listaCarros.listarCarros();
    }
}

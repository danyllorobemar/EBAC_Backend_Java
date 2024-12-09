package br.com.devdan.domain;

public class Toyota extends Carro{

    public Toyota(String modelo) {
        super("Toyota", modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Toyota - Modelo: " + getModelo());
    }
}

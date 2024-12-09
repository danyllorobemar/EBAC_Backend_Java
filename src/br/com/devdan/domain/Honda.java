package br.com.devdan.domain;

public class Honda extends Carro{

    public Honda(String modelo) {
        super("Honda", modelo);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Honda - Modelo: " + getModelo());
    }
}

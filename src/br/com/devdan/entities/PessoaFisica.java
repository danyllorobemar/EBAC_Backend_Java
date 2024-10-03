package br.com.devdan.entities;

public class PessoaFisica extends Pessoa implements IDados{
    private int cpf;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public void exibirDados() {
        System.out.println("### Pessoa Fisica ###");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}

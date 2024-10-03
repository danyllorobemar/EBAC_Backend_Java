package br.com.devdan.entities;

public class PessoaJuridica extends Pessoa implements IDados{
    private int cnpj;

    public PessoaJuridica(String nome, int cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public void exibirDados() {
        System.out.println("### Pessoa Jurídica ###");
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
    }
}

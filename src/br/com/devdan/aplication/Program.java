package br.com.devdan.aplication;

import br.com.devdan.entities.PessoaFisica;
import br.com.devdan.entities.PessoaJuridica;

public class Program {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Dan", 111);
        PessoaJuridica pj = new PessoaJuridica("Empresa X", 222);

        pf.exibirDados();
        System.out.println();
        pj.exibirDados();
    }
}

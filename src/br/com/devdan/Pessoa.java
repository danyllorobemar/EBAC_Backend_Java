package br.com.devdan;

public class Pessoa {
    private String name;
    private int idade;
    private int cpf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String name, int idade, int cpf) {
        this.name = name;
        this.idade = idade;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                ", cpf=" + cpf +
                '}';
    }
}

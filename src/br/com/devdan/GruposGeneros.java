package br.com.devdan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GruposGeneros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira nomes no formato (nome-M ou nome-F) e separados por vírgula: ");
        String[] nomes = sc.nextLine().split(",");

        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

        for(String nome : nomes){
            if(nome.contains("-M")){
                listaMasculina.add(nome);
            } else {
                listaFeminina.add(nome);
            }
        }

        System.out.println("### Grupo Masculino ###");
        for (String nome : listaMasculina)
            System.out.println(nome);

        System.out.println();

        System.out.println("### Grupo Feminino ###");
        for (String nome : listaFeminina)
            System.out.println(nome);

        sc.close();
    }
}

package br.com.devdan;

import br.com.devdan.domain.Pessoa;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static br.com.devdan.utils.ArrayToListUtil.formatarArrayToList;
import static br.com.devdan.utils.StringUtil.formatarStringToArray;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os elementos da lista no formato: [nome]-[Masculino/Feminino]...");
        String listaString = sc.nextLine();

        String[] listaArray = formatarStringToArray(listaString);

        List<Pessoa> lista = formatarArrayToList(listaArray);

        List<Pessoa> listaFeminina = lista.stream()
               .filter(x -> x.getSexo().contains("Feminino"))
               .collect(Collectors.toList());

        listaFeminina.forEach(System.out::println);

        sc.close();
    }
}

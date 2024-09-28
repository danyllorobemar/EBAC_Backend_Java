package br.com.devdan;

import java.util.*;

public class ListaNomesOrdenados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma lista de nomes separados por vírgula: ");
        String[] nomes = sc.nextLine().split(",");

        List<String> list = new ArrayList<>(Arrays.asList(nomes));
        Collections.sort(list);

        for(String name : list){
            System.out.println(name);
        }

        sc.close();
    }
}

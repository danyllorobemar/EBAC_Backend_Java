package br.com.devdan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de nomes a serem inseridos na lista: ");
        Integer qtd = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();

        for (int i=1; i<=qtd; i++){
            System.out.println("Insira o " + i + "º nome da lista: ");
            list.add(sc.nextLine());
        }

        System.out.println("### Lista não ordenada ###");
        System.out.println(list);
        System.out.println();

        System.out.println("### Lista ordenada ###");
        Collections.sort(list);
        System.out.println(list);




        sc.close();
    }
}

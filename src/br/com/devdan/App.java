package br.com.devdan;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota 01: ");
        double n1 = sc.nextDouble();
        System.out.println("Insira a nota 02: ");
        double n2 = sc.nextDouble();
        System.out.println("Insira a nota 03: ");
        double n3 = sc.nextDouble();
        System.out.println("Insira a nota 04: ");
        double n4 = sc.nextDouble();

        double media = calcularMedia(n1, n2, n3, n4);
        System.out.println("Média igual a " + media);

        if(media >= 7)
            System.out.println("O aluno está aprovado!");
         else if (media >= 5 && media < 7)
            System.out.println("O aluno está em recuperação.");
         else
            System.out.println("O aluno está reprovado.");

        sc.close();
    }

    public static double calcularMedia(double n1, double n2, double n3, double n4){
        double media = (n1 + n2 + n3 + n4) / 4;
        return media;
    }
}



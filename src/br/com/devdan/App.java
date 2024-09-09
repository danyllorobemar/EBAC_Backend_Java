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

        calcularMedia(n1, n2, n3, n4);

        sc.close();
    }

    public static void calcularMedia(double n1, double n2, double n3, double n4){
        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média é " + media);
    }
}



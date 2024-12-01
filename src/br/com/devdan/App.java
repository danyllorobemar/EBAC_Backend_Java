package br.com.devdan;

import br.com.devdan.factory.ICarFactory;
import br.com.devdan.factory.SedanFactory;
import br.com.devdan.factory.SuvFactory;
import br.com.devdan.model.ICar;

public class App {
    public static void main(String[] args) {
        // Criando a fábrica de Sedans
        ICarFactory sedanFactory = new SedanFactory();
        ICar sedan = sedanFactory.createCar();
        sedan.assemble();
        sedan.paint();

        System.out.println();

        // Criando a fábrica de SUVs
        ICarFactory suvFactory = new SuvFactory();
        ICar suv = suvFactory.createCar();
        suv.assemble();
        suv.paint();
    }
}

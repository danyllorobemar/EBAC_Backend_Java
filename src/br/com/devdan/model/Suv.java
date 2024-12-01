package br.com.devdan.model;

public class Suv implements ICar{

    @Override
    public void assemble() {
        System.out.println("Assembling a Suv...");
    }

    @Override
    public void paint() {
        System.out.println("Painting a Suv...");
    }
}

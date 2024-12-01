package br.com.devdan.model;

public class Sedan implements ICar {
    @Override
    public void assemble() {
        System.out.println("Assembling a Sedan...");
    }

    @Override
    public void paint() {
        System.out.println("Painting a Sedan...");
    }
}

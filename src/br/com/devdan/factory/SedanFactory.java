package br.com.devdan.factory;

import br.com.devdan.model.ICar;
import br.com.devdan.model.Sedan;

public class SedanFactory implements ICarFactory{

    @Override
    public ICar createCar() {
        return new Sedan();
    }
}

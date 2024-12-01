package br.com.devdan.factory;

import br.com.devdan.model.ICar;
import br.com.devdan.model.Suv;

public class SuvFactory implements ICarFactory{

    @Override
    public ICar createCar() {
        return new Suv();
    }
}

package FactoryDesignPattern.FactoryEXE3.Library.Classes;

import FactoryDesignPattern.FactoryEXE3.Library.Classes.Interface.Pizza;

public class CheesePizza implements Pizza {
    @Override
    public void prepare(){
        System.out.println("Preparing CheezePizza");
    }
}

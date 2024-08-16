package FactoryDesignPattern.FactoryEXE3.Library.Classes.ObjectFactory;

import FactoryDesignPattern.FactoryEXE3.Library.Classes.CheesePizza;
import FactoryDesignPattern.FactoryEXE3.Library.Classes.Interface.Pizza;
import FactoryDesignPattern.FactoryEXE3.Library.Classes.PepperoriPizza;

public class PizzaFactory {
    public static Pizza getInstance(String PizzaType){
        return switch (PizzaType){
                case "cheese" -> new CheesePizza();
                case "pepperoni" -> new PepperoriPizza();
                default -> throw new IllegalArgumentException("Unknown pizza type");
        };
    }
}

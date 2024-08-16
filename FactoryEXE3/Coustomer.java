package FactoryDesignPattern.FactoryEXE3;
import FactoryDesignPattern.FactoryEXE3.Library.Classes.Interface.Pizza;
import FactoryDesignPattern.FactoryEXE3.Library.Classes.ObjectFactory.PizzaFactory;

import java.util.Scanner;
public class Coustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item = sc.nextLine();
        Pizza pizza = PizzaFactory.getInstance(item);
        pizza.prepare();
    }
}

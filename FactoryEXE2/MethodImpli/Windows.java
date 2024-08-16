package FactoryDesignPattern.FactoryEXE2.MethodImpli;

import FactoryDesignPattern.FactoryEXE2.Library.OperatingSystem;

public class Windows implements OperatingSystem {
    @Override
    public void specs(){
        System.out.println("Windows stands for development");
    }
}

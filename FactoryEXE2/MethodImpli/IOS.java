package FactoryDesignPattern.FactoryEXE2.MethodImpli;

import FactoryDesignPattern.FactoryEXE2.Library.OperatingSystem;

public class IOS implements OperatingSystem {
    @Override
    public void specs(){
        System.out.println("IOS stands dor Security and Camera");
    }
}

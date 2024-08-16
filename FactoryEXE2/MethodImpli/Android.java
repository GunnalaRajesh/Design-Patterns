package FactoryDesignPattern.FactoryEXE2.MethodImpli;
import FactoryDesignPattern.FactoryEXE2.Library.OperatingSystem;

public class Android implements OperatingSystem{
    @Override
    public void specs(){
        System.out.println("Android specs are awesome");
    }
}

package FactoryDesignPattern.FactoryEXE2;
import FactoryDesignPattern.FactoryEXE2.Library.OperatingSystem;
import FactoryDesignPattern.FactoryEXE2.MethodImpli.Android;
import FactoryDesignPattern.FactoryEXE2.MethodImpli.IOS;
import FactoryDesignPattern.FactoryEXE2.MethodImpli.Windows;


public class SelectionFactory {
    public static OperatingSystem getInstance(String Case){
        return switch (Case) {
            case "open" -> new Android();
            case "security" -> new IOS();
            default -> new Windows();
        };
    }
}

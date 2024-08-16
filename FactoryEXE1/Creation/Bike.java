package FactoryDesignPattern.FactoryEXE1.Creation;

import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void start(){
        System.out.println("Bike is started");
    }
    @Override
    public void stop(){
        System.out.println("Bike is Stoped");
    }

    @Override
    public Vehicle createVehicle() {
        return null;
    }

}

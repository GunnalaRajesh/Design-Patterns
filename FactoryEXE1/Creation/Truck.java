package FactoryDesignPattern.FactoryEXE1.Creation;

import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void start(){
        System.out.println("Truck Started");
    }
    @Override
    public void stop(){
        System.out.println("Truck Stoped");
    }

    @Override
    public Vehicle createVehicle() {
        return null;
    }
}

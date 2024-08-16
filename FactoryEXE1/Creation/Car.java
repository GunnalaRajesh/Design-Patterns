package FactoryDesignPattern.FactoryEXE1.Creation;
import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is started");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    @Override
    public Vehicle createVehicle() {
        return null;
    }
}

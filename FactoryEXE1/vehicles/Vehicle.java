package FactoryDesignPattern.FactoryEXE1.vehicles;

public interface Vehicle {
    void start();
    void stop();

    Vehicle createVehicle();
}

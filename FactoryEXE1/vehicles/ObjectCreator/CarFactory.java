package FactoryDesignPattern.FactoryEXE1.vehicles.ObjectCreator;

import FactoryDesignPattern.FactoryEXE1.Creation.Car;
import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;
import FactoryDesignPattern.FactoryEXE1.vehicles.VehicleFactory;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Car();
    }

}

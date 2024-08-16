package FactoryDesignPattern.FactoryEXE1.vehicles.ObjectCreator;

import FactoryDesignPattern.FactoryEXE1.Creation.Bike;
import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;
import FactoryDesignPattern.FactoryEXE1.vehicles.VehicleFactory;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Bike();
    }
}

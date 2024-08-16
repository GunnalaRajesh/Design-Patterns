package FactoryDesignPattern.FactoryEXE1.vehicles.ObjectCreator;
import FactoryDesignPattern.FactoryEXE1.Creation.Truck;
import FactoryDesignPattern.FactoryEXE1.vehicles.VehicleFactory;
import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(){
        return new Truck();
    }
}

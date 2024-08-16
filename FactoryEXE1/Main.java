package FactoryDesignPattern.FactoryEXE1;
import FactoryDesignPattern.FactoryEXE1.vehicles.ObjectCreator.BikeFactory;
import FactoryDesignPattern.FactoryEXE1.vehicles.ObjectCreator.CarFactory;
import FactoryDesignPattern.FactoryEXE1.vehicles.ObjectCreator.TruckFactory;
import FactoryDesignPattern.FactoryEXE1.vehicles.Vehicle;
import FactoryDesignPattern.FactoryEXE1.vehicles.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.start();
        bike.stop();
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.start();
        truck.stop();
    }
}

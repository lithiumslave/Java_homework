package lesson14HomeWork;

import lesson5HomeWorkCombined.PrintOperations;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private static final int parkingMaxLimit = 10;
    private static int parkingPlacesNum;

    private List<Vehicle> vehicles;

    public List<Vehicle> getAuthorisedVehicles(){
        vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Audi", "Red", 4211));
        vehicles.add(new Vehicle("Ford", "White", 4212));
        vehicles.add(new Vehicle("Bentley", "Yellow", 4213));
        vehicles.add(new Vehicle("Mercedes", "Yellow", 4214));
        vehicles.add(new Vehicle("Suzuki", "Black", 4215));
        vehicles.add(new Vehicle("Yamaha", "Pink", 4216));
        vehicles.add(new Vehicle("Kawasaki", "Red", 4217));
        return vehicles;
    }

    public void parkingVehicle(Vehicle vehicle) {
        try {
            if (!authoriseCarOrTruck(vehicle)) {
                throw new NoEntryForVehicleException("This vehicle is a Truck and can't be parked in this parking lot!");
            } else if (!compareWithListOfAuthorisedVehicles(vehicle)) {
                throw new NoEntryForVehicleException("This vehicle is not approved by the list of vehicles!");
            } else if (!limitInParkingCheck()) {
                throw new ExceededLimitException("There are no available parking places in this parking lot!");
            } else {
                System.out.println("Welcome to this parking lot!");
            }
        } catch (NoEntryForVehicleException | ExceededLimitException e) {
            System.out.println("FAILED! " + e.getMessage());
        }

        System.out.println("Available parking places: " + availableParkingPlaces());
        PrintOperations.printSeparator();
    }

    public void leaveParking (Vehicle vehicle) {
        parkingPlacesNum--;
        System.out.println(vehicle.getBrand() + " just left parking zone!");
        System.out.println("Available parking places number: " + availableParkingPlaces());
        PrintOperations.printSeparator();
    }

    public boolean authoriseCarOrTruck(Vehicle veh) {
        if (veh instanceof Car) {
            return ((Car) veh).getCarType().equals("Car");
        } else return veh instanceof Motorcycle;
    }

    public boolean compareWithListOfAuthorisedVehicles(Vehicle veh) {
        List<Vehicle> vehicles = getAuthorisedVehicles();
        return vehicles.contains(veh);
    }

    public boolean limitInParkingCheck() {
        if (parkingPlacesNum < parkingMaxLimit) {
            parkingPlacesNum++;
            return true;
        } else {
            return false;
        }
    }

    public static int availableParkingPlaces() {
        int availablePlaces = parkingMaxLimit - getParkingPlacesNum();
        return availablePlaces;
    }

    public static int getParkingPlacesNum() {
        return parkingPlacesNum;
    }
}

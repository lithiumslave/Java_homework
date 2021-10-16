package lesson14HomeWork;

import java.util.List;

public class ParkingMain {
    public static void main(String[] args) {
        // 2 valid
        Vehicle car1 = new Car("Mercedes", "White", 4212, 3, "Car");
        Vehicle car2 = new Car("BMW", "Yellow", 4213, 4, "Car");
        Vehicle moto1 = new Motorcycle("Harley Davidson", "Black", 4215);
        Vehicle moto2 = new Motorcycle("Honda", "Pink", 4216);

        // Invalid carType
        Vehicle car3 = new Car("BMW", "Red", 4210, 4, "Truck");

        // Invalid color
        Vehicle car4 = new Car("Ford", "Bombicheskiy", 4217, 4, "Car");

        // Invalid plate number
        Vehicle moto3 = new Motorcycle("Kawasaki", "Red", 4220);

        Parking parkVeh = new Parking();
        parkVeh.parkingVehicle(car1);
        parkVeh.parkingVehicle(car2);
        parkVeh.parkingVehicle(moto2);

        parkVeh.parkingVehicle(car3);

        parkVeh.parkingVehicle(car4);
        parkVeh.parkingVehicle(moto3);

        parkVeh.parkingVehicle(moto1);
        parkVeh.parkingVehicle(car1);
        parkVeh.parkingVehicle(car2);
        parkVeh.parkingVehicle(car1);
        parkVeh.parkingVehicle(car2);
        parkVeh.parkingVehicle(car1);
        parkVeh.parkingVehicle(car2);
        parkVeh.parkingVehicle(car1);
        parkVeh.leaveParking(car1);
        parkVeh.parkingVehicle(car2);
    }
}

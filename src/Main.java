import carparkingsystem.Car;
import carparkingsystem.Motorcycle;
import carparkingsystem.ParkingLot;
import carparkingsystem.Slot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car("ABBYZ");
        Motorcycle motorcycle = new Motorcycle("UP32AB1296");

        System.out.println("Car license number ->"+ car.getLicensePlate());
        System.out.println("MotorCycle license number->" + motorcycle.getLicensePlate());

        Slot slot = new Slot(9);
        System.out.println(slot.getSlotNumber());
        System.out.println(slot.isAvailable());
//        System.out.println(slot.park(car));
        ParkingLot parkingLot = new ParkingLot(10);
        System.out.println(parkingLot.getAvailableSlots().size());
//        System.out.println(parkingLot.getTotalavailableslots());
        parkingLot.parkVehicle(car);
        System.out.println(parkingLot.getAvailableSlots().size());
//        System.out.println(parkingLot.getTotalavailableslots());
        Car car1 = new Car("AP12LP1234");
        parkingLot.parkVehicle(car1);
        Motorcycle motorcycle1 = new Motorcycle("UP15SP1090");
        parkingLot.parkVehicle(motorcycle);
        System.out.println(parkingLot.getAvailableSlots().size());
//        System.out.println(parkingLot.getTotalavailableslots());


    } // main
}



// Singleton
//import java.util.ArrayList;
//import java.util.List;
//
//class ParkingLot {
//    private static ParkingLot instance;
//    private List<Slot> slots;
//    private int maxSlots;
//
//    private ParkingLot(int maxSlots) {
//        this.maxSlots = maxSlots;
//        this.slots = new ArrayList<>(maxSlots);
//        for (int i = 1; i <= maxSlots; i++) {
//            slots.add(new Slot(i));
//        }
//    }
//
//    public static ParkingLot getInstance(int maxSlots) {
//        if (instance == null) {
//            instance = new ParkingLot(maxSlots);
//        }
//        return instance;
//    }
//
//    public boolean parkVehicle(Vehicle vehicle) {
//        for (Slot slot : slots) {
//            if (slot.isAvailable()) {
//                slot.park(vehicle);
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean leaveVehicle(int slotNumber) {
//        if (slotNumber > 0 && slotNumber <= maxSlots) {
//            Slot slot = slots.get(slotNumber - 1);
//            if (!slot.isAvailable()) {
//                slot.vacate();
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public List<Slot> getAvailableSlots() {
//        List<Slot> availableSlots = new ArrayList<>();
//        for (Slot slot : slots) {
//            if (slot.isAvailable()) {
//                availableSlots.add(slot);
//            }
//        }
//        return availableSlots;
//    }
//}
//
//class Slot {
//    private int slotNumber;
//    private boolean isOccupied;
//    private Vehicle vehicle;
//
//    public Slot(int slotNumber) {
//        this.slotNumber = slotNumber;
//        this.isOccupied = false;
//    }
//
//    public void park(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        this.isOccupied = true;
//    }
//
//    public void vacate() {
//        this.vehicle = null;
//        this.isOccupied = false;
//    }
//
//    public boolean isAvailable() {
//        return !isOccupied;
//    }
//
//    public int getSlotNumber() {
//        return slotNumber;
//    }
//}
//
//abstract class Vehicle {
//    private String licensePlate;
//
//    public Vehicle(String licensePlate) {
//        this.licensePlate = licensePlate;
//    }
//
//    public String getLicensePlate() {
//        return licensePlate;
//    }
//}
//
//class Car extends Vehicle {
//    public Car(String licensePlate) {
//        super(licensePlate);
//    }
//}
//
//class Bike extends Vehicle {
//    public Bike(String licensePlate) {
//        super(licensePlate);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ParkingLot parkingLot = ParkingLot.getInstance(10);
//
//        Vehicle car = new Car("ABC123");
//        Vehicle bike = new Bike("XYZ987");
//
//        parkingLot.parkVehicle(car);
//        parkingLot.parkVehicle(bike);
//
//        System.out.println("Available slots: " + parkingLot.getAvailableSlots().size());
//
//        parkingLot.leaveVehicle(1);
//        System.out.println("Available slots after leaving: " + parkingLot.getAvailableSlots().size());
//    }
//}

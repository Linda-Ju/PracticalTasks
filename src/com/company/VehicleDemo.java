package com.company;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.setLength(4);
        vehicle.setNumberOfSeats(4);
        vehicle.setNumberOFTires(4);
        vehicle.setName("BMW");
        vehicle.setCurrentSpeed(30);

        vehicle.startEngine();

        System.out.println("Speed: " + vehicle.speedUp());
        System.out.println("Speed: " + vehicle.slowDown());

        vehicle.stopEngine();
    }
}

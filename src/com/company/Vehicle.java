package com.company;

public class Vehicle {
    // 6th Task:
    // Create a class called Vehicle. Let this car have features like,
    // length of the vehicle, the number of seats,
    // no of tires, name/brand of the vehicle, current speed.
    //
    // methods include: speed up(increases speed by 5), slow down (reduce speed by 5), start engine, stop engine.

    int length;
    int numberOfSeats;
    int numberOFTires;
    String name;
    int currentSpeed;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOFTires() {
        return numberOFTires;
    }

    public void setNumberOFTires(int numberOFTires) {
        this.numberOFTires = numberOFTires;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int speedUp() {
        currentSpeed = currentSpeed + 5;
        return currentSpeed;
    }

    public int slowDown() {
        currentSpeed = currentSpeed - 5;
        return currentSpeed;
    }

    public void startEngine() {
        System.out.println("Start engine!");
    }

    public void stopEngine() {
        System.out.println("Stop engine!");
    }
}


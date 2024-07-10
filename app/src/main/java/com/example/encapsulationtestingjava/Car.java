package com.example.encapsulationtestingjava;

public class Car {
    private String make;
    private String model;
    private int mileage;

    public Car(String make, String model, int mileage) {
        this.make = make;
        this.model = model;
        if (mileage >= 0) {
            this.mileage = mileage;
        } else {
            throw new IllegalArgumentException("Invalid Car Mileage");
        }
    }

    public void get() {
        if (mileage >= 0) {
            System.out.println("Make: " + make + ", Model: " + model + ", Mileage: " + mileage);
        } else {
            throw new IllegalArgumentException("Invalid Car Mileage");
        }
    }

    public void set(String carMake, String carModel, int carMileage) {
        this.make = carMake;
        this.model = carModel;
        if (carMileage >= 0) {
            this.mileage = carMileage;
            System.out.println("Make: " + make + ", Model: " + model + ", Mileage: " + mileage);
        } else {
            throw new IllegalArgumentException("Invalid Car Mileage");
        }
    }

    // Getter methods for make, model, and mileage
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }
}

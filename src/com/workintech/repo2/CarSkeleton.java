package com.workintech.repo2;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void drive() {
        System.out.println("Driving...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running.");
    }
}

package com.workintech.repo2;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("electric start");

    }

    @Override
    public void drive() {
        System.out.println("electric drive");
    }

    @Override
    protected void runEngine() {
        System.out.println("electric run engine");
    }
}

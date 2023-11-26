package com.workintech.repo2;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println("hybrid start");

    }

    @Override
    public void drive() {
        System.out.println("hybrid drive");
    }
    @Override
    protected void runEngine() {
        System.out.println("hybrid run engine");
    }
}

package com.workintech.repo2;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println("gas start");

    }

    @Override
    public void drive() {
        System.out.println("gas drive");
    }
    @Override
    protected void runEngine() {
        System.out.println("gas run engine");
    }
}

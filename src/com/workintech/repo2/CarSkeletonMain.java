package com.workintech.repo2;

public class CarSkeletonMain {
    public static void main(String[] args) {

        CarSkeleton carSkeleton=new CarSkeleton("car1","car11");
        carSkeleton.drive();

        CarSkeleton electric=new ElectricCar("electric","afdafa",25,100,4);
        electric.drive();
        electric.runEngine();
        electric.startEngine();

        CarSkeleton hybrid=new HybridCar("hybridcar","afdafa",25,100,4);
        hybrid.drive();
        hybrid.runEngine();
        hybrid.startEngine();

        CarSkeleton gas=new GasPoweredCar("gas","gasdes",125,8);
        gas.startEngine();
        gas.drive();
        gas.runEngine();
    }



}

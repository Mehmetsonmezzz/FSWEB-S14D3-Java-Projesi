package com.workintech.repo;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels=4;
        this.engine=true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && cylinders == car.cylinders && wheels == car.wheels && Objects.equals(name, car.name);
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting" ;

    }

    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";

    }

    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";

    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}

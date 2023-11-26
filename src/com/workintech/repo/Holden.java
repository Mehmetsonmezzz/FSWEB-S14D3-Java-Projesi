package com.workintech.repo;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "the Holden's engine is starting"+getClass().getSimpleName();

    }

    @Override
    public String accelerate() {
        return "the Holden is accelerating"+getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return "the Holden is braking"+getClass().getSimpleName();
    }
}

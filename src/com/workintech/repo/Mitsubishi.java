package com.workintech.repo;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "the Mitsubishi's engine is starting"+getClass().getSimpleName();

    }

    @Override
    public String accelerate() {
        return "the Mitsubishi is accelerating"+getClass().getSimpleName();
    }

    @Override
    public String brake() {
        return "the Mitsubishi is braking"+getClass().getSimpleName();
    }
}

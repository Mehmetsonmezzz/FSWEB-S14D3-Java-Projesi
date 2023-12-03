package com.workintech.repo;

public class Ford extends Car {

    public Ford(int cylinders, String name) {

        super(cylinders, name);
    }

    @Override
    public String startEngine() {
         return "the Ford's engine is starting"+getClass().getSimpleName();

    }

    @Override
    public String accelerate() {
       return "the Ford is accelerating"+getClass().getSimpleName();
    }

    @Override
    public String brake() {
       return "the Ford is braking"+getClass().getSimpleName();
    }
}

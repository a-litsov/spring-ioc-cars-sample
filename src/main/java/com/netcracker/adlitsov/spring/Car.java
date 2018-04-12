package com.netcracker.adlitsov.spring;

public class Car {

    private Engine engine;

    public Car() {
        System.out.println("Car.Car");
    }

    public Car(Engine engine) {
        System.out.println("Car.Car");
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}

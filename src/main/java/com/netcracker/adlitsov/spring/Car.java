package com.netcracker.adlitsov.spring;

public class Car {

    private Engine engine;

    public Car() {
        System.out.println("Car.Car");
    }

    public Car(Engine engine) {
        System.out.println("Car.Car with engine");
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Car.setEngine");
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car#" + System.identityHashCode(this) + " {" +
                "engine=" + engine +
                '}';
    }
}

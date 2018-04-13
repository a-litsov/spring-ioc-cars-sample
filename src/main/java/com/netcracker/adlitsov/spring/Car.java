package com.netcracker.adlitsov.spring;

public class Car extends Vehicle {

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

    // Added only to test autowiring (to match bean name in spring-config.xml
    public void setTurboEngine(Engine engine) {
        System.out.println("Car.setEngine");
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Car.drive");
    }

    @Override
    public String toString() {
        return "Car#" + System.identityHashCode(this) + " {" +
                "engine=" + engine +
                '}';
    }
}

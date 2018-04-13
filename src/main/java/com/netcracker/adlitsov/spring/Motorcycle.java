package com.netcracker.adlitsov.spring;

public class Motorcycle extends Vehicle {
    private Engine myEngine;

    public Motorcycle() {
        System.out.println("Motorcycle.Motorcycle");
    }

    public Motorcycle(Engine engine) {
        System.out.println("Motorcycle.Motorcycle with engine");
        this.myEngine = engine;
    }

    public void setEngine(Engine engine) {
        System.out.println("Motorcycle.setEngine");
        this.myEngine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle.drive");
    }

    @Override
    public String toString() {
        return "Motorcycle#" + System.identityHashCode(this) + " {" +
                "engine=" + myEngine +
                '}';
    }
}

package com.netcracker.adlitsov.spring;

public class Bicycle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Bicycle.drive");
    }

    @Override
    public String toString() {
        return "Bicycle#" + System.identityHashCode(this) +  "{}";
    }
}

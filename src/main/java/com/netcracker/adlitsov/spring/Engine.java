package com.netcracker.adlitsov.spring;

public abstract class Engine {
    public abstract void runUp();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "#" + System.identityHashCode(this);
    }
}

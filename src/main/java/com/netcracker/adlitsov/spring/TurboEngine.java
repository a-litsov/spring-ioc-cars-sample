package com.netcracker.adlitsov.spring;

public class TurboEngine implements Engine {
    public TurboEngine() {
        System.out.println("TurboEngine.TurboEngine");
    }

    public void runUp() {
        System.out.println("TurboEngine.runUp");
    }
}

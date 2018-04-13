package com.netcracker.adlitsov.spring;

public class EngineAirCooledVTwin extends Engine {

    public EngineAirCooledVTwin() {
        System.out.println("EngineAirCooledVTwin.EngineAirCooledVTwin");
    }

    @Override
    public void runUp() {
        System.out.println("EngineAirCooledVTwin.runUp");
    }

}

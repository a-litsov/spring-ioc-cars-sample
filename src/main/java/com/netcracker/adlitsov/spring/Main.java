package com.netcracker.adlitsov.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {

    private static Map<String, Float> myMap;

    public static void main(String[] args) throws NoSuchFieldException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        String[] carNames = {"kalina", "bmwX5", "mercedesBenz", "mercedesBenzExclusive", "yamahaBolt", "spectra2018"};
        List<Vehicle> vehicles = new ArrayList<>();

        for (String carName : carNames) {
            for (int i = 0; i < 2; i++) {
                Vehicle current = context.getBean(carName, Vehicle.class);
                System.out.println(carName + "=" + current);
                current.drive();
            }
        }
        System.out.println("\nThat is how Spring knows at runtime generic types of strongly typed collections " +
                                   "that is field(property) of our bean:");
        System.out.println(Main.class.getDeclaredField("myMap").getGenericType());
        System.out.println("Types are erased for object, not for fields.");
    }
}

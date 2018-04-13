package com.netcracker.adlitsov.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        String[] carNames = {"kalina", "bmwX5", "mercedesBenz", "mercedesBenzExclusive"};
        Map<String, List<Car>> cars = new LinkedHashMap<>();

        for (String carName : carNames) {
            List<Car> currentCars = new ArrayList<>();
            cars.put(carName, currentCars);
            for (int i = 0; i < 2; i++) {
                currentCars.add(context.getBean(carName, Car.class));
            }
        }

        for (Map.Entry<String, List<Car>> entry: cars.entrySet()) {
            System.out.println(entry);
        }
    }
}

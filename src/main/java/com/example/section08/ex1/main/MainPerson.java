package com.example.section08.ex1.main;

import com.example.section08.ex1.model.Car;
import com.example.section08.ex1.model.House;
import com.example.section08.ex1.model.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
      p1.input();
        House[] houses = new House[2];
        Car[] cars = new Car[2];

        for (int i = 0; i < houses.length; i++) {
            houses[i] = new House();
            houses[i].input();
            houses[i].setOwner(p1);
        }

        for (int j = 0; j < cars.length; j++) {
            cars[j] = new Car();
            cars[j].input();
            cars[j].setOwner(p1);
        }

        for (House house : houses) {
            house.info();
            house.getOwner().info();
        }

        for (Car car : cars) {
            car.info();
            car.getOwner().info();
        }
    }

}

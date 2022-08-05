package com.example.section08.ex1.model;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;
    private Car[] cars;
private Nation nation;

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public House[] getHouses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    private House[] houses;

    public void input() {
        System.out.println("----input person----");

        System.out.println("enter name");
        name = new Scanner(System.in).nextLine();

        System.out.println("enter the age");
        age = new Scanner(System.in).nextInt();


    }

    public void info() {
        System.out.println("---Person information---");
        System.out.println("name :" + name);
        System.out.println("age :" + age);


    }
}

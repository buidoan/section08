package com.example.section08.ex1.model;

import java.util.Scanner;

public class Car {
    private String name;
    private int seatNumber;
    private int powerHorse;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPowerHorse() {
        return powerHorse;
    }

    public void setPowerHorse(int powerHorse) {
        this.powerHorse = powerHorse;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    private Person owner;

    public void input() {
        System.out.println("----input car----");
        Scanner scName = new Scanner(System.in);
        System.out.println("enter the name");
        name = scName.nextLine();
        Scanner scSeatNum = new Scanner(System.in);
        System.out.println("number of seat");
        seatNumber = scSeatNum.nextInt();
        System.out.println("enter the horse power");
        powerHorse = new Scanner(System.in).nextInt();

    }
    public void info(){
        System.out.println("---car information---");
        System.out.println("name :"+name);
        System.out.println("number of seat :"+seatNumber);
        System.out.println("power horse :"+powerHorse);
        System.out.println("owner : "+owner.getName());

    }
}

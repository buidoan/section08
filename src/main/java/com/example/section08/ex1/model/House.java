package com.example.section08.ex1.model;

import java.util.Scanner;

public class House {
    private String address;
    private String color;
    private int numRoom;
    private Person owner;

    public House() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void input() {
        System.out.println("----input house----");

        System.out.println("enter the address");
        address = new Scanner(System.in).nextLine();

        System.out.println("enter the color");
        color = new Scanner(System.in).nextLine();
        System.out.println("enter the number of room");
        numRoom = new Scanner(System.in).nextInt();

    }

    public void info() {
        System.out.println("---house information---");
        System.out.println("address :" + address);
        System.out.println("number of room :" + numRoom);
        System.out.println("color :" + color);
        System.out.println("owner : " + owner.getName());

    }
}

package com.example.section08.ex1.model;

import java.util.Scanner;

public class Product {
    private String name;
    private int price;
private Category category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }
    public void input() {
        System.out.println("----input product----");

        System.out.println("enter name product");
        name = new Scanner(System.in).nextLine();

        System.out.println("enter the price");
        price= new Scanner(System.in).nextInt();


    }

    public void info() {
        System.out.println("---Product information---");
        System.out.println("name :" + name);
        System.out.println("price :" + price);


    }
}

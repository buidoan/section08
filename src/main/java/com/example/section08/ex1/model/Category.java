package com.example.section08.ex1.model;

import java.util.Scanner;

public class Category {
    private int id;
    private String name;
private Product[] products;
    public Category() {
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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public void input() {
        System.out.println("----input category----");
        System.out.println("enter the id");
        id= new Scanner(System.in).nextInt();
        System.out.println("enter name category");
        name = new Scanner(System.in).nextLine();




    }

    public void info() {
        System.out.println("---Category information---");
        System.out.println("id :" + id);
        System.out.println("name :" + name);



    }
}

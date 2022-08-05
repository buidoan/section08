package com.example.section08.ex1.main;

import com.example.section08.ex1.model.Category;
import com.example.section08.ex1.model.Product;

import java.util.Scanner;

public class MainCategory {
    public static void main(String[] args) {
        Category c1=new Category();
        c1.input();
        System.out.println("enter n: ");
        int n=new Scanner(System.in).nextInt();
        Product[] products=new Product[n];
        for(int i=0;i<n;i++){
            products[i]=new Product();
            products[i].input();
            products[i].setCategory(c1);
        }
        for(Product p:products){
            p.info();
            System.out.println("category :"+p.getCategory().getName());
        }
    }
}

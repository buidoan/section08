package com.example.section08.ex1.main;

import com.example.section08.ex1.model.Nation;
import com.example.section08.ex1.model.Person;

import java.util.Scanner;

public class MainNation {
    public static void main(String[] args) {
        Nation vn = new Nation();
        vn.input();
        System.out.println("enter n : ");
        int n = new Scanner(System.in).nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i]=new Person();
            persons[i].input();
            persons[i].setNation(vn);
        }
        for (Person p : persons) {
            p.info();
            p.getNation().info();
        }
    }
}

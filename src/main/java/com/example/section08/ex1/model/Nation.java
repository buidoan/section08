package com.example.section08.ex1.model;

import java.util.Scanner;

public class Nation {
    private String name;
    private int postcode;
    private Person [] persons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Nation() {
    }
    public void input() {
        System.out.println("----input nation----");

        System.out.println("enter the name");
        name = new Scanner(System.in).nextLine();

        System.out.println("postcode");
        postcode = new Scanner(System.in).nextInt();


    }
    public void info(){
        System.out.println("---Nation information---");
        System.out.println("name :"+name);
        System.out.println("postcode :"+postcode);


    }
}

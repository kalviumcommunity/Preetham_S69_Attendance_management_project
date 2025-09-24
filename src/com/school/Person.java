package com.school;

public class Person {
    private static int nextIdCounter;
    protected int id;
    protected String name;

    public Person(String name){
        this.name = name;
        this.id = nextIdCounter++;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void displayDetails(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


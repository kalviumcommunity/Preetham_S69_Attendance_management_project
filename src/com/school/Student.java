package com.school;

public class Student {
    int studentId;
    String name;

    public void setDetails(int id, String name){
        this.studentId = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Student ID: "+this.studentId+" , Name: "+ this.name);
    }
}

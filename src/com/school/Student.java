package com.school;

public class Student {
    int studentId;
    String name;
    private static int nextStudentIdCounter = 1;

    public Student(String name) {
        this.name = name;
        this.studentId = nextStudentIdCounter++;
    }

    public void display(){
        System.out.println("Student ID: "+this.studentId+" , Name: "+ this.name);
    }
}

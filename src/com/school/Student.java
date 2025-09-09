package com.school;

public class Student {
    private int studentId;
    private String name;
    private static int nextStudentIdCounter = 1;

    public Student(String name) {
        this.name = name;
        this.studentId = nextStudentIdCounter++;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Student ID: "+this.studentId+" , Name: "+ this.name);
    }
}

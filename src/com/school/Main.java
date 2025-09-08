package com.school;

public class Main{
    public static void main(String[] args){
        Student[] student = new Student[2];
        student[0] = new Student("Tom");
        student[1] = new Student("Karl");
        Course[] course = new Course[2];
        course[0] = new Course("abc");
        course[1] = new Course("abd");

        for(Student s: student){
            s.display();
        }

        for(Course c: course){
            c.display();
        }
        System.out.println("Welcome");
}       
}
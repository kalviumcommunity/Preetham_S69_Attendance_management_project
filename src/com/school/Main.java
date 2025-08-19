package com.school;

public class Main{
    public static void main(String[] args){
        Student[] student = new Student[2];
        student[0] = new Student();
        student[0].setDetails(0,"Tom");
        student[1] = new Student();
        student[1].setDetails(1,"Karl");

        Course[] course = new Course[2];
        course[0] = new Course();
        course[0].setDetails("#abc","Tom");
        course[1] = new Course();
        course[1].setDetails("#abd","Karl");

        for(Student s: student){
            s.display();
        }

        for(Course c: course){
            c.display();
        }
        System.out.println("Welcome");
}       
}
package com.school;

public class Course {
    int courseId;
    String courseName;
    private static int nextCourseIdCounter = 1;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseId = nextCourseIdCounter++;
    }

    public void display(){
        System.out.println("Course ID: C"+this.courseId+" , Course Name: "+ this.courseName);
    }
}

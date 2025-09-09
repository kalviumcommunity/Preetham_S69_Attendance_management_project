package com.school;

public class Course {
    private int courseId;
    private String courseName;
    private static int nextCourseIdCounter = 1;

    public Course(String courseName) {
        this.courseName = courseName;
        this.courseId = nextCourseIdCounter++;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void display(){
        System.out.println("Course ID: C"+this.courseId+" , Course Name: "+ this.courseName);
    }
}

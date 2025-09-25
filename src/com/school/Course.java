package com.school;

public class Course implements Storable{
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

    @Override
    public String toDataString(){
        return "Course ID: " + courseId + ", Course: " + courseName;
    }

    public void display(){
        System.out.println("Course ID: C"+this.courseId+" , Course Name: "+ this.courseName);
    }
}

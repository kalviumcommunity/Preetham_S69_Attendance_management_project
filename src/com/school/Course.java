package com.school;

public class Course {
    String courseId;
    String courseName;

    public void setDetails(String id, String cName){
        this.courseId = id;
        this.courseName = cName;
    }

    public void display(){
        System.out.println("Course ID: "+this.courseId+" , Course Name: "+ this.courseName);
    }
}

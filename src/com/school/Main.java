package com.school;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Student[] student = new Student[2];
        student[0] = new Student("Tom");
        student[1] = new Student("Karl");
        Course[] course = new Course[2];
        course[0] = new Course("abc");
        course[1] = new Course("abd");
        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<AttendanceRecord>();
        attendanceLog.add(new AttendanceRecord(student[0].getStudentId(), course[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student[1].getStudentId(),course[1].getCourseId() ,"null"));

        for(AttendanceRecord attend : attendanceLog){
            attend.displayRecord();
        }

        for(Course c: course){
            c.display();
        }
        System.out.println("Welcome");
}       
}
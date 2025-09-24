package com.school;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Student[] student = new Student[2];
        student[0] = new Student("Tom","A");
        student[1] = new Student("Karl","A");
        Course[] course = new Course[2];
        course[0] = new Course("abc");
        course[1] = new Course("abd");
        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher("Tom","English");
        teachers[1] = new Teacher("Karl","Computer Science");
        Staff[] staffs = new Staff[2];
        staffs[0] = new Staff("Tom","Main");
        staffs[1] = new Staff("Karl","Sub");
        ArrayList<AttendanceRecord> attendanceLog = new ArrayList<AttendanceRecord>();
        attendanceLog.add(new AttendanceRecord(student[0].getId(), course[0].getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(student[1].getId(),course[1].getCourseId() ,"null"));

        for(AttendanceRecord attend : attendanceLog){
            attend.displayRecord();
        }

        for(Course c: course){
            c.display();
        }

        for(Teacher t: teachers){
            t.displayDetails();
        }

        for(Staff s: staffs){
            s.displayDetails();
        }
        System.out.println("Welcome");
}       
}
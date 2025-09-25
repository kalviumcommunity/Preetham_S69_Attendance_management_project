package com.school;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tom", "A"));
        students.add(new Student("Karl", "A"));
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("abc"));
        courses.add(new Course("abd"));
        Teacher[] teachers = new Teacher[2];
        teachers[0] = new Teacher("Tom","English");
        teachers[1] = new Teacher("Karl","Computer Science");
        Staff[] staffs = new Staff[2];
        staffs[0] = new Staff("Tom","Main");
        staffs[1] = new Staff("Karl","Sub");
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        records.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));

        for(AttendanceRecord attend : records){
            attend.displayRecord();
        }

        for(Course c: courses){
            c.display();
        }

        for(Teacher t: teachers){
            t.displayDetails();
        }

        for(Staff s: staffs){
            s.displayDetails();
        }
        System.out.println("Welcome");

        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");
}       
}
package com.school;

public class Student extends Person implements Storable {
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name);
        this.gradeLevel = gradeLevel;
    }

    // public int getStudentId() {
    //     return studentId;
    // }

    // public String getName() {
    //     return name;
    // }
    @Override
    public String toDataString(){
        return "ID: " + getId() + "Student," + name + "," + gradeLevel;
    }

    public void displayDetails(){
       super.displayDetails();
       System.out.println("Grade Level: " + gradeLevel);
    }
    
}

package com.school;

public class Teacher extends Person{
    public String subjectTaught;

    public Teacher(String name, String subjectTaught){
        super(name);
        this.subjectTaught = subjectTaught;
    }
    
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Subject: " + subjectTaught+", Role: Teacher");
    }
}

package com.school;

public class Staff extends Person{
    public String role;

    public Staff(String name, String role){
        super(name);
        this.role = role;
    }

    public void displayDetails(){
         System.out.println("Staff Role: " + role + ", Role: Staff");
    }
}

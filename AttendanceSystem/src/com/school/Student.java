package com.school;

public class Student {
    private String studentId;
    private String name;
    
    // Default constructor
    public Student() {
    }
    
    // Parameterized constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    
    // Method to set student details
    public void setDetails(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("------------------------");
    }
    
    // Getter methods
    public String getStudentId() {
        return this.studentId;
    }
    
    public String getName() {
        return this.name;
    }
    
    // Setter methods
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

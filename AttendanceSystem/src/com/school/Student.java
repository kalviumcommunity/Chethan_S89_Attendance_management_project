package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
    private int studentId;
    private String name;

    // Constructor with auto-generated ID
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: S" + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("------------------------");
    }

    // Public getter for studentId
    public int getStudentId() {
        return this.studentId;
    }

    // Public getter for name
    public String getName() {
        return this.name;
    }
}

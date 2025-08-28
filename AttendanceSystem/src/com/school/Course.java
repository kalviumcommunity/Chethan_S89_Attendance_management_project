package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String courseName;

    // Constructor with auto-generated ID
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("------------------------");
    }

    // Getter methods
    public int getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }
}

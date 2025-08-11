package com.school;

public class Course {
    private String courseId;
    private String courseName;
    
    // Default constructor
    public Course() {
    }
    
    // Parameterized constructor
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    // Method to set course details
    public void setDetails(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    
    // Method to display course details
    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("------------------------");
    }
    
    // Getter methods
    public String getCourseId() {
        return this.courseId;
    }
    
    public String getCourseName() {
        return this.courseName;
    }
    
    // Setter methods
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

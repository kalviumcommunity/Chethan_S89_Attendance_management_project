package com.school;

public class Course implements Storable {
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

    // Public getter for courseId
    public int getCourseId() {
        return this.courseId;
    }

    // Public getter for courseName
    public String getCourseName() {
        return this.courseName;
    }

    @Override
    public String toDataString() {
        return courseId + "," + courseName;
    }
}

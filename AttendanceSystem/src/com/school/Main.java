package com.school;

public class Main {
    public static void main(String[] args) {
        // Create Student instances
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Display Student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        // Create Course instances
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("History");

        // Display Course details
        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
    }
}

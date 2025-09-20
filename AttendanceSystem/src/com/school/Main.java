
package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create and populate students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "10th Grade"));
        students.add(new Student("Bob", "11th Grade"));
        students.add(new Student("Charlie", "12th Grade"));

        // Create and populate courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("Mathematics"));
        courses.add(new Course("Science"));
        courses.add(new Course("History"));

        // Create and populate attendance records
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0).getId(), courses.get(0).getCourseId(), "Present"));
        records.add(new AttendanceRecord(students.get(1).getId(), courses.get(1).getCourseId(), "Absent"));
        records.add(new AttendanceRecord(students.get(2).getId(), courses.get(2).getCourseId(), "Late"));

        // Create Teacher and Staff
        Teacher t1 = new Teacher("Mrs. Smith", "Mathematics");
        Staff staff1 = new Staff("Mr. John", "Librarian");

        // Display details
        for (Student s : students) s.displayDetails();
        t1.displayDetails();
        staff1.displayDetails();
        for (Course c : courses) c.displayDetails();

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : records) {
            record.displayRecord();
        }

        // Save data to files
        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");
    }
}

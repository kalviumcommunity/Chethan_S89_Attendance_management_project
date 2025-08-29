
package com.school;

import java.util.ArrayList;
import java.util.List;

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

        // Attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s3.getStudentId(), c3.getCourseId(), "Late")); // Invalid status

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}

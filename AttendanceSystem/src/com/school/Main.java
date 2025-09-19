
package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create Student instances
        Student s1 = new Student("Alice", "10th Grade");
        Student s2 = new Student("Bob", "11th Grade");
        Student s3 = new Student("Charlie", "12th Grade");

        // Create Teacher instance
        Teacher t1 = new Teacher("Mrs. Smith", "Mathematics");

        // Create Staff instance
        Staff staff1 = new Staff("Mr. John", "Librarian");

        // Display details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        t1.displayDetails();
        staff1.displayDetails();

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
        attendanceLog.add(new AttendanceRecord(s1.getId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s3.getId(), c3.getCourseId(), "Late")); // Invalid status

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}

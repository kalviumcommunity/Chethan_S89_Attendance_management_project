
package com.school;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize services
        FileStorageService fileStorageService = new FileStorageService();
        RegistrationService registrationService = new RegistrationService(fileStorageService);
        AttendanceService attendanceService = new AttendanceService(registrationService, fileStorageService);

        // Register students
        registrationService.registerStudent("Alice", "10th Grade");
        registrationService.registerStudent("Bob", "11th Grade");
        registrationService.registerStudent("Charlie", "12th Grade");

        // Register teachers and staff
        registrationService.registerTeacher("Mrs. Smith", "Mathematics");
        registrationService.registerStaff("Mr. John", "Librarian");

        // Create courses
        registrationService.createCourse("Mathematics");
        registrationService.createCourse("Science");
        registrationService.createCourse("History");

        // Display school directory
        displaySchoolDirectory(registrationService);

        // Display courses
        System.out.println("\n--- Courses ---");
        for (Course course : registrationService.getCourses()) {
            course.displayDetails();
        }

        // Mark attendance using IDs
        List<Student> students = registrationService.getStudents();
        List<Course> courses = registrationService.getCourses();
        
        attendanceService.markAttendance(students.get(0).getId(), courses.get(0).getCourseId(), "Present");
        attendanceService.markAttendance(students.get(1).getId(), courses.get(1).getCourseId(), "Absent");
        attendanceService.markAttendance(students.get(2).getId(), courses.get(2).getCourseId(), "Late");

        // Display attendance records
        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceService.getAttendanceRecords()) {
            record.displayRecord();
        }

        // Save all data
        registrationService.saveAllRegistrations();
        attendanceService.saveAttendanceData();
    }

    private static void displaySchoolDirectory(RegistrationService regService) {
        System.out.println("\n--- School Directory ---");
        for (Person person : regService.getAllPeople()) {
            person.displayDetails();
        }
    }
}

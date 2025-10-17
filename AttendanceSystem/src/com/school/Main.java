
package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails();
        }
    }
    
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

        // Create Teacher and Staff
        Teacher t1 = new Teacher("Mrs. Smith", "Mathematics");
        Staff staff1 = new Staff("Mr. John", "Librarian");
        
        // Create a list of all people in the school
        ArrayList<Person> schoolPeople = new ArrayList<>();
        schoolPeople.addAll(students);
        schoolPeople.add(t1);
        schoolPeople.add(staff1);
        
        // Display school directory using polymorphism
        displaySchoolDirectory(schoolPeople);
        
        // Display course details
        System.out.println("\n--- Course Details ---");
        for (Course c : courses) c.displayDetails();

        // Create FileStorageService and AttendanceService
        FileStorageService storageService = new FileStorageService();
        AttendanceService attendanceService = new AttendanceService(storageService);
        
        // Mark attendance using Student and Course objects directly
        System.out.println("\n--- Marking Attendance (Using Objects) ---");
        attendanceService.markAttendance(students.get(0), courses.get(0), "Present");
        attendanceService.markAttendance(students.get(1), courses.get(1), "Absent");
        
        // Mark attendance using IDs
        System.out.println("\n--- Marking Attendance (Using IDs) ---");
        attendanceService.markAttendance(students.get(2).getId(), courses.get(2).getCourseId(), "Late", students, courses);
        
        // Display all attendance records
        attendanceService.displayAttendanceLog();
        
        // Display attendance for a specific student
        attendanceService.displayAttendanceLog(students.get(0));
        
        // Display attendance for a specific course
        attendanceService.displayAttendanceLog(courses.get(1));
        
        // Save all data to files
        storageService.saveData(students, "students.txt");
        storageService.saveData(courses, "courses.txt");
        attendanceService.saveAttendanceData();
    }
}

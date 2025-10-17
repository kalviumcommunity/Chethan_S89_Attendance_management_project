
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
        
        // Create and populate attendance records with Student and Course objects
        ArrayList<AttendanceRecord> records = new ArrayList<>();
        records.add(new AttendanceRecord(students.get(0), courses.get(0), "Present"));
        records.add(new AttendanceRecord(students.get(1), courses.get(1), "Absent"));
        records.add(new AttendanceRecord(students.get(2), courses.get(2), "Late"));

        // Display course details
        System.out.println("\n--- Course Details ---");
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

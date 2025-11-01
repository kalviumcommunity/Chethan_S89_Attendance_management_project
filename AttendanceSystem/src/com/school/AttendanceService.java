package com.school;

import java.util.ArrayList;

public class AttendanceService {
    private ArrayList<AttendanceRecord> attendanceRecords;
    private RegistrationService registrationService;
    private FileStorageService fileStorageService;

    public AttendanceService(RegistrationService registrationService, FileStorageService fileStorageService) {
        this.attendanceRecords = new ArrayList<>();
        this.registrationService = registrationService;
        this.fileStorageService = fileStorageService;
    }

    public void markAttendance(int studentId, int courseId, String status) {
        Student student = registrationService.findStudentById(studentId);
        Course course = registrationService.findCourseById(courseId);
        
        if (student != null && course != null) {
            attendanceRecords.add(new AttendanceRecord(studentId, courseId, status));
        }
    }

    public void saveAttendanceData() {
        fileStorageService.saveData(attendanceRecords, "attendance_log.txt");
    }

    public ArrayList<AttendanceRecord> getAttendanceRecords() {
        return attendanceRecords;
    }
}
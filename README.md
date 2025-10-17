# chethan_s89_Attendance_management_project




## Part 8: Service Layer Implementation
- Created `AttendanceService` class to manage attendance operations.
- Implemented method overloading with multiple versions of `markAttendance()` and `displayAttendanceLog()`.
- Added helper methods to find students and courses by ID.
- Encapsulated attendance data management and file storage operations.
- Updated `Main.java` to use the new service layer for attendance operations.
- Demonstrated polymorphic behavior with different method signatures.

## Part 7: Object Relationships and Polymorphism
- Modified `AttendanceRecord` to use `Student` and `Course` objects instead of IDs.
- Added getters `getStudent()` and `getCourse()` to `AttendanceRecord`.
- Enhanced `displayRecord()` to show more detailed information using student and course properties.
- Implemented polymorphism with a `displaySchoolDirectory()` method that works with any `Person` object.
- Created an `ArrayList<Person>` to store all school people (students, teachers, staff).
- Updated the main method to use actual `Student` and `Course` objects when creating `AttendanceRecord` objects.

## Part 6: Data Storage with Storable Interface
- Added `Storable` interface with `toDataString()` method.
- Implemented `Storable` in `Student`, `Course`, and `AttendanceRecord` classes.
- Created `FileStorageService` to save lists of storable objects to text files.
- Updated `Main.java` to use ArrayLists for students, courses, and attendance records, and save them to files.

### How to Run
1. Navigate to the project root directory.
2. Compile: `javac AttendanceSystem\src\com\school\*.java`
3. Run: `java -cp AttendanceSystem\src com.school.Main`
4. Output will show the school directory (using polymorphism), course details, and enhanced attendance records.
5. Check the files `students.txt`, `courses.txt`, and `attendance_log.txt` in the project root for saved data.
# Student Management System
## Based on a standard Java foundations curriculum, here are the core features and requirements you need to build for the Student Management System project:
### 1. Student Record CRUD (Create, Read, Update, Delete)Create:
* Add: a new student record with fields like ID, Name, Age, Email, Course, and Grade/GPA.
* Read: Retrieve and display student details. You should be able to view a single student by their ID or list all students currently in the system.
* Update: Modify existing information (like updating a student’s grade, email, or course) using their ID.
* Delete: Remove a student permanently from the system using their ID.
### 2.In-Memory Data Management (Collections)Storage Structure:
Use a Java Collection structure to hold student records while the program is running. A HashMap<String, Student> is highly recommended because it allows you to look up a student instantly by their ID.
Alternatively, you can use an ArrayList<Student>.
### 3. Data Processing and Filtering (Streams API)Search / Filter:
Use Java Streams to search for students based on criteria
(e.g., finding a student by email or filtering for students enrolled in a specific course).
Analytics / Reports: Use Streams to generate quick statistics, such as:
Calculating the average GPA/grade of all students.
Listing all failing or passing students.Counting the total number of students in each course.
Sorting: Sort the student list alphabetically by name or by performance (highest to lowest grade) using Stream.sorted().
### 4. Robust Error Handling (Exceptions)Validation:
Prevent the user from adding duplicate IDs or entering invalid data formats (like a negative age or an empty name).
Custom Exceptions: Implement custom exceptions like StudentNotFoundException.
If a user tries to search, update, or delete an ID that doesn’t exist, the system must catch this gracefully and show an error message instead of crashing.
### 5. Interactive Console UI (User Interface)Text Menu Loop:
Create a text-based terminal menu using a Scanner in a while loop that keeps running until the user selects "Exit".
User Input: Prompt the user to select an option
(e.g., 1. Add Student, 2. View All, 3. Search, 4. Exit) and type in the necessary details.
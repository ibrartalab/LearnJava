package coreJava.projects.studentManagmentSystem.src.com.backend.repositories;

import coreJava.projects.studentManagmentSystem.src.com.backend.models.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class StudentRepository {
    // This is the in-memory db to stores all the students data
    // Encapsulation applied here, to protect our Student's data.
    private final HashMap<Integer, Student> students = new HashMap<>();

    /**
     * This method will add a new student to the students list
     * @param student its take the Student itself as s param to add into the students list
     */
    public void addStudent(Student student){
        // edge cases checking
        if(student != null){
            int studentId = student.getId();
            students.put(studentId,student);
            System.out.println("Student " + student.getName() + " has been created!");
        }else{
            // tell the user there is something missing, please verify and retry again.
            System.out.println("Not a valid Student Info!");
        }
    }

    /**
     * Get all the Students records by using this public method
     * @return Return a collection of Student, to make sure you can apply all the collections
     * methods
     */
    public List<Student> getAllStudents(){
        return students.values().stream().toList();
    }

    public Student getById(int studentId){
        return (Student) students.values().stream().
                filter(s -> s.getId() == studentId);
    }
    /**
     * Use this method to find and delete a specific student form the list
     * @param studentId It takes studentId as parameter
     * @return If the student removed successfully it will return true otherwise false
     */
    public boolean deleteStudentById(int studentId){
        Student re = students.remove(studentId);
        return re != null;
    }


}

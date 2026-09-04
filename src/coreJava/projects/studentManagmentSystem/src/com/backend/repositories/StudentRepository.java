package coreJava.projects.studentManagmentSystem.src.com.backend.repositories;

import coreJava.projects.studentManagmentSystem.src.com.backend.models.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class StudentRepository {
    // This is the in-memory db to stores all the students data
    // Encapsulation applied here, to protect our Student's data.
    private final HashMap<Integer, Student> students = new HashMap<>();

    /*
        addStudent method will create and add a student to the students HashMap,
        in-memory db for our app.
        It takes Student type of object as param to validate and store it.
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

    /*
        This method allow us to get all the students from the HashMap/db so far created.
     */
    public List<Student> getAllStudents(){
        return students.values().stream().toList();
    }

    /*
        This method utilize the Java Steam API to create a steam of students,
        then filter-out a specific student based on the provided studentId.
     */
    public Student getById(int studentId){
        return students.values().stream()
                .filter(s -> s.getId() == studentId)
                .findFirst()
                .orElse(null);
    }

    /*
        This method takes a studentId as a param to delete that specific student from the students HashMap.
        This method return a boolean value either true or false. So, if the user deleted/removed form the
        memory it will return true otherwise false.
     */
    public boolean deleteStudentById(int studentId){
        Student re = students.remove(studentId);
        return re != null;
    }
}

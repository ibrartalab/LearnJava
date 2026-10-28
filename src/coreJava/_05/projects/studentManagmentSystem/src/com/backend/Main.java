package coreJava.projects.studentManagmentSystem.src.com.backend;

import coreJava.projects.studentManagmentSystem.src.com.backend.models.Student;
import coreJava.projects.studentManagmentSystem.src.com.backend.repositories.StudentRepository;
import coreJava.projects.studentManagmentSystem.src.com.backend.services.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);

        studentService.createStudent("Ibrar",20,"ib@example.com","CS",3.9);
        List<Student> studentList =  studentService.getALlStudents();
        if (!studentList.isEmpty()) {
            Student firstStudent = studentList.get(0);
            System.out.println("Name: " + firstStudent.getName() + ", GPA: " + firstStudent.getGpa());
        }
    }
}

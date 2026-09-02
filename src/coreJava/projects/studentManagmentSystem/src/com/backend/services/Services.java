package coreJava.projects.studentManagmentSystem.src.com.backend.services;

import coreJava.projects.studentManagmentSystem.src.com.backend.models.Student;

import java.util.List;

public interface Services {
    public void createStudent(String name,int age,String email,String course,double gpa);
    public Student updateStudent(int studentId,Student updatedStudent);
    public void deleteStudent(int studentId);
    public List<Student> getALlStudents();
    public Student getStudentById(int studentId);
}

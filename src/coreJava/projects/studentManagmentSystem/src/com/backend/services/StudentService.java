package coreJava.projects.studentManagmentSystem.src.com.backend.services;

import coreJava.projects.studentManagmentSystem.src.com.backend.models.Student;
import coreJava.projects.studentManagmentSystem.src.com.backend.repositories.StudentRepository;

import java.util.List;

public class StudentService implements Services{
    // This is the place where you business logic, which means all the CRUD
    // operations will be performed here.
    private final StudentRepository studentRepository;
    private int id = 1;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(String name, int age, String email, String course, double gpa) {
        if(name == null || name.trim().isEmpty() || age <= 0 || gpa < 0.0 || gpa > 4.0){
            System.out.println("Registration failed: Invalid student parameters provided.");
            return;
        }
        Student newStudent = new Student(id++,name,age,email,course,gpa);
        studentRepository.addStudent(newStudent);
    }

    @Override
    public Student updateStudent(int studentId, Student updatedStudent) {
        if(studentId > 0){
            Student existingStudent = getStudentById(studentId);
            if(existingStudent != null && updatedStudent != null){
                existingStudent.setName(updatedStudent.getName());
                existingStudent.setAge(updatedStudent.getAge());
                existingStudent.setEmail(updatedStudent.getEmail());
                existingStudent.setCourse(updatedStudent.getCourse());
                existingStudent.setGpa(updatedStudent.getGpa());

                System.out.println("Student ID " + studentId + " updated successfully.");
                return existingStudent;
            }
        }
        System.out.println("Update failed: Student not found.");
        return null;
    }

    @Override
    public void deleteStudent(int studentId) {
        if(studentId > 0){
            Student targetStudent = getStudentById(studentId);

            if (targetStudent != null){
                boolean isDeleted =  studentRepository.deleteStudentById(studentId);
                if (isDeleted) System.out.println("Student with id " + studentId + " has been deleted.");
            }
        }
    }

    @Override
    public List<Student> getALlStudents() {
        return studentRepository.getAllStudents();
    }

    @Override
    public Student getStudentById(int studentId) {
        if(studentId <= 0) return null;
        return studentRepository.getById(studentId);
    }
}

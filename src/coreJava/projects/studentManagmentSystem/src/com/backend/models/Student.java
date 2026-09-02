package coreJava.projects.studentManagmentSystem.src.com.backend.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private  String name;
    private  int age;
    private  String email;
    private  String course;
    private  double gpa;

    public Student(int id,String name,int age,String email,String course,double gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
        this.gpa = gpa;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

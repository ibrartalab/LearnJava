package coreJava.advanced.collections.comparable;

public class Student implements Comparable<Student> {
    public int id;
    public int age;
    public String name;

    public Student(int id,int age,String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student:[" +
                "id=" + this.id +
                ",age=" + this.age +
                ",name=" + this.name +
                "]";
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }
}

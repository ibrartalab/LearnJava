package coreJava.advanced.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnComparable {
    static void main(String[] args) {
        /*
         Comparable is an interface in Java which help us to sort collection of custom objects(Student or any other).
         Comparable used with your main class to be implemented by it, which sort elements in a natural
         sorting rule. It is contained only one method comparTo().
         And we know that we could use lambda expression with functional interfaces.

         The mathematical logic of the compareTo() method is return an integer based on the comparison
         of the current object(this) and the target object (o). by subtracting this from o.
         In case of negative number(-1): this is smaller and comes before o.
         in case of positive number(1+): this is larger and comes after o.
         if number is zero(0): both are equal.
         */
        Student s1 = new Student(5,23,"A");
        Student s2 = new Student(2,22,"B");
        Student s3 = new Student(4,13,"F");
        Student s4 = new Student(1,33,"C");
        Student s5 = new Student(3,20,"D");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        System.out.println(studentList);
        // We are the Collections class sort() method because it is only takes one arg List<T>.
        Collections.sort(studentList);
        System.out.println(studentList);
        // We can also use this overloaded method which takes the List<T> and a Comparator.
        Collections.sort(studentList,new C());
        System.out.println(studentList);

    }
}

class C implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}
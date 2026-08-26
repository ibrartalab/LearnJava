package coreJava.advanced.streamsapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {
    static void main(String[] args) {
        // We have a list of students
        List<String> students = Arrays.asList("Sam","Bob","Jone","Alice","Sam");
        // Challenge: Is to get only the unique names and put them into a new List and print them.
        // Approach 1: To do it with using the imperative programming or the old way.
        List<String> uniqueStudents = new ArrayList<>();
        for(String student:students){
            if(!uniqueStudents.contains(student)){
                uniqueStudents.add(student);
            }
        }
        Collections.sort(uniqueStudents);
        System.out.println("Using the old way or Imperative Programming!");
        System.out.println(uniqueStudents);

        // Approach 2: Using the Java StreamAPI
        // Before using the StreamAPI, if you don't know about it yet.
        // StreamAPI has three distinguish phases.
        // 1.Opening a source 2.Applying intermediate operations 3.Terminal Operation
        Stream<String> studentsStream = students.stream(); // this is open source
        List<String> result = studentsStream
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Using Streams:" + result);

        // Now to make it simpler
        List<String> result1 = students.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println(result1);
    }
}

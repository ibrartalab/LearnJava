package coreJava.advanced.optional;

import java.util.Optional;

public class LearnOptional {
    static void main() {
        // Optional is container Object in simple word it is a final class,
        // which may or may not contain non-null value.
        // Before implementing it lets first understand why the need of optional comes.
//        Student s1 = getStudent("Ibrar",20);
//        System.out.println(s1.getName());

        // Now imagine you are query this through a database, and there is no user,
        // with the name of Ibrar?
        // In this case you will get a NullPointerException

        // But if you smart enough you will just wrap this with conditional statements
//        if(s1 != null){
//            System.out.println(s1.getName());
//        }else{
//            System.out.println("No user data found!");
//        }

        // But using optional is more accurate and optimize way of handling this.
        // And it is also make sense of if you are not sure about the data, either
        // it will return the original data or null you should use optional<T>.
        Optional<String> emptyOpt = Optional.empty();
        System.out.println(emptyOpt.isEmpty());
        Optional<String> fullOpt = Optional.of("Hello!");
        System.out.println(fullOpt.get());
        Optional<String> nullableOpt = Optional.ofNullable(null);
        Optional<Optional<String>> nullableOptionalValue = Optional.ofNullable(emptyOpt);
        System.out.println(nullableOptionalValue);

        System.out.println(fullOpt.isPresent()); // true-cause not a null
        System.out.println(emptyOpt.isPresent()); // false-cause a null value

        Optional<Student> validOpt = getStudent("Khan",22);
        validOpt.ifPresent(student -> System.out.println(student.getName()));

        Optional<Student> invalidOpt = getStudent("Ibrar",-5);
        Student fallBackOpt = invalidOpt.orElse(new Student("Guest",8));
        System.out.println(fallBackOpt.getName());
    }

    public static Optional<Student> getStudent(String name, int age){
        if(name.isBlank() || name.trim().isEmpty() || name == null || age < 0){
            return Optional.empty();
        }
        return Optional.of(new Student(name,age));
    }

    // Shorter version and recommended only returning the student
//    public Student getStudent(String name, int age){
//        return new Student(name,age);
//    }
}

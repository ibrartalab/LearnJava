package coreJava.advanced.streamsapi.deppdive;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowItWorks {
    static void main(String[] args) {
        List<String> students = Arrays.asList("Sam","Bob","Jone","Alice","Sam");

        // Filter out students names consist of more than 4 chars.
        // print out the result of that array.

        List<String> result = students.stream()
                .filter(n -> n.length() >= 4)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        // This is how the filter intermediate operations work
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String name) {
                if(name.length() >= 4)
                    return true;
                else
                    return false;
            }
        };

        List<String> res = students.stream()
                .filter(predicate)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);

        // In the first example we used like this .filter(n -> n.length() >= 4)
        // this is how lambda expression powerful and make a lot of work easy.
        // So if you think how we come of these one-liner lambda expression,
        // then lets break it down the predicate object we just created in the example second.
        /*
        So we know that this is an anonymous inner class.
        And if we remove the part comes before the curly braces, or you can call the block scope
        this anonymous class it should work they have to be.

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String name) {
                if(name.length() >= 4)
                    return true;
                else
                    return false;
            }
        };

        Predicate<String> predicate = {
            @Override
            public boolean test(String name) {
                if(name.length() >= 4)
                    return true;
                else
                    return false;
            }
        };

        Now we already this as well that we can remove this if else statement.
        Predicate<String> predicate = {
            @Override
            public boolean test(String name) {
                return name.length() >= 4;
            }
        };

        We can also replace the anonumous class with lambda expression
        Predicate<String> predicate = (name) -> {
            return name.length() >= 4;
        };
        furthur if we returing one statement just remove curly braces
        Predicate<String> predicate = (name) -> return name.length() >= 4;
        Also for one-liner return statement do not need of return keyword to be used
        Predicate<String> predicate = (name) -> name.length() >= 4;
        Remove braces from the parms (name) no need of it.
        Predicate<String> predicate = name -> name.length() >= 4;

        So at the end we do not need to create the predicate object,
        we simply pass this name -> name.length() >= 4 to the filter(name -> name.length() >= 4)
         */
        List<String> res2 = students.stream()
                .filter(name -> name.length() >= 4)
                .sorted()
                .toList();

        System.out.println(res2);
    }

}

package coreJava.advanced.collections.comparator;

import java.util.ArrayList;
import java.util.List;

public class LearnComparator {
    static void main(String[] args) {
        /*
         Comparator is also an interface in Java Collection Framework in the
         Collection(Interface). It is the same as Comparable(Interface) to help
         us to sort collection of custom objects.
         We use this interface over the comparable when we do not want to modify original
         class code or need to sort the same data multiple ways.
         */
        List<Languages> languagesList = new ArrayList<>();
        languagesList.add(new Languages(1,"Java"));
        languagesList.add(new Languages(4,"Python"));
        languagesList.add(new Languages(2,"JavaScript"));
        languagesList.add(new Languages(3,"Ruby"));
        System.out.println(languagesList);

        languagesList.sort((l1,l2) -> l1.id - l2.id);
        System.out.println(languagesList);
        languagesList.sort((l1,l2) -> l1.name.compareTo(l2.name));
        System.out.println(languagesList);

        // another example with comparing by string using the lambda expression
        List<Alphabets> alphabets = new ArrayList<>();
        alphabets.add(new Alphabets(6,'F'));
        alphabets.add(new Alphabets(1,'A'));
        alphabets.add(new Alphabets(4,'D'));
        alphabets.add(new Alphabets(3,'C'));
        alphabets.add(new Alphabets(2,'B'));
        alphabets.add(new Alphabets(5,'E'));
        System.out.println(alphabets);
        alphabets.sort((a1,a2) -> a1.alphabet.compareTo(a2.alphabet));
        System.out.println(alphabets);
    }
}

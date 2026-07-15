package coreJava.collections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    static void main(String[] args) {
        /*
         Before actually working with ArrayList, we know that ArrayList is implemented List(Interface).
         List(Interface) extends Collection(Interface) extends iterable(Interface).
         So, we can use all the implementations of the Collection and Iterable interface.
         We will look it one by one.
        */
        List<String> cities = new ArrayList<>();
        /*
         Let's try the List interface methods.
         Some of these methods are extended from their parent interfaces.
         add is an abstract method of Collection interface and overridden by many others interface like List.
         List interface support duplicates entries and stored in sequential ordered.

         add() appends element to the end of the List.
         It is also throws some exceptions on a certain scenarios.
        */
        cities.add("Islamabad");
        cities.add("Karachi");
        cities.add("Lahore");
        cities.add("Peshawar");
        cities.add("Peshawar");
        System.out.println(cities);

        /*
         add() the own abstract method from the List(interface).
         The add() method from the Collection interface is taking zero params and return a boolean value.
         But this one from the List interface takes params (index,E c) and does not return anything.
        */
        cities.add(4,"Abbottabad");

        /*
         addALl() will add a list of elements to the other list
         adding one list inside another one.
        */
        List<String> cities1 = new ArrayList<>();
        cities1.add("Swat");
        cities1.add("Quetta");
        cities1.add("Abbottabad");
        System.out.println(cities.addAll(cities1));
        /*
         Now cities List will contain the following elements.
         [Islamabad, Karachi, Lahore, Peshawar, Peshawar, Swat, Quetta, Abbottabad]
        */
        System.out.println(cities);

        /*
         There is one more overloaded addAll() method, which is accepting two
         params the index(from where to start adding the new list element),the new
         list.
         Think of adding two Char list in the correct way.
         list1 = ['A','B','C','H']
         list2 = ['D','E','F','G']
         To maintain the correct order we should need to be adding the list2 elements
         after the second last element of the list1 like after the 'C'.
         So, in this case we should use the addAll() the List interface method, not the
         one which is coming from the Collection interface.
         [A, B, C, D, E, F, G, H]
        */
        List<Character> alpha = new ArrayList<>();
        alpha.add('A');
        alpha.add('B');
        alpha.add('C');
        alpha.add('H');

        List<Character> alpha1 = new ArrayList<>();
        alpha1.add('D');
        alpha1.add('E');
        alpha1.add('F');
        alpha1.add('G');

        System.out.println(alpha.addAll(3,alpha1));
        System.out.println(alpha);

        // get() return the element on the specified index.
        System.out.println(cities.get(3));

        // size() return the length or numbers of elements in the list.
        System.out.println(cities.size());

        // addFirst() to add element at the first position to the list.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.addFirst(1);
        System.out.println(numbers); // [1,2,3]
        // addLast() to add element to the end of the list.
        numbers.addLast(4);
        System.out.println(numbers); // [1,2,3,4]
        // set() to replace an element int the list
        numbers.set(3,5);
        System.out.println(numbers);
        // contains() return a boolean value where the specified element is
        // present in the list or not.
        System.out.println(numbers.contains(2));
        // containsAll() return true in case all the same elements are present
        // inside the list and list2.
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(5);
        numbers1.add(3);
        System.out.println(numbers.containsAll(numbers1));
    }
}

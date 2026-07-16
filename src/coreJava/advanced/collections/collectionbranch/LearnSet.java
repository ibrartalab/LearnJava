package coreJava.advanced.collections.collectionbranch;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    static void main(String[] args) {
        /*
         The Set interface is a core part of the Java Collections Framework
         designed to mimic a mathematical set.
         Its defining rule is simple: it cannot contain duplicate elements.
         If you try to add an item that is already in the set, Java will reject it and return false.
        */

        /*
         HaseSet stores item in a random order.
         It is very fast with a constant time O(1) for adding, removing, and checking if an item
         exists.
        */
        Set<Integer> hashSetContainer = new HashSet<>();
        hashSetContainer.add(10);
        hashSetContainer.add(90);
        hashSetContainer.add(50);
        hashSetContainer.add(10); // duplicates are not allowed
        hashSetContainer.add(60);
        System.out.println(hashSetContainer); // [50,10,90,60] only

        /*
         LinkedHashSet is another implementation which is also fast, but slower than HashSet.
         It preserves the insertion order in which the item added.
         */
        Set<Integer> linkedHashSetContainer = new LinkedHashSet<>();
        linkedHashSetContainer.add(10);
        linkedHashSetContainer.add(90);
        linkedHashSetContainer.add(50);
        linkedHashSetContainer.add(10); // duplicates are not allowed
        linkedHashSetContainer.add(60);
        System.out.println(linkedHashSetContainer); // [10, 90, 50, 60]

        /*
         TreeSet is the one of the implementation of the Set Interface.
         It is slower than the others two O(logN) logarithmic time, because each time
         when you insert an element its try to sort the set. Which means you can get your elements
         in ascending order regardless of the insertion order.
         */
        Set<Integer> treeSetContainer = new TreeSet<>();
        treeSetContainer.add(10);
        treeSetContainer.add(90);
        treeSetContainer.add(50);
        treeSetContainer.add(10); // duplicates are not allowed
        treeSetContainer.add(60);
        System.out.println(treeSetContainer); // [10, 50, 60, 90]

    }
}

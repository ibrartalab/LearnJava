package coreJava.collections;

public class Intro {
    /*
     The Java Collection Framework(JCF) is a built-in set of ready-mad
     classes and interfaces that helps you to store,organize, and manipulate group of objects
     efficiently.
     Instead of writing complex data-handling code from scratch(building a custom resizing array
     or a linked list), Java provides these pre-built tools in the java.util.package.

     As we know data structures are the containers which hold/store different types of data.
     So, the JCF works on 4 main types of containers(data structures).
     List(The ordered line)
     Set(The unique container: just hold unique elements)
     Queue(The waiting line: Use the FIFO(first in, first out) principle.
     Map(The ID directory: stores data in a key-value pair).

     Know to understand the hierarchical structure of the JCF(Java Collection Framework).
     You can think of it as a family tree.
     So, in the top of the tree are Interfaces(the rules/blueprint) or the contracts. Below them
     are the classes( which is the actual code implementations that you use in your program).

     Now there are two distinct root structure in JCF.
     1: The Collection branch -> working with single items.
     2: The Map branch -> working with key-value pairs.

     The JCF Hierarchy Tree:
     The first Collection branch.
     Interfaces:
            1: Iterable(Interface) The Parent Interface
            2: Collection(Interface) extends Iterable(Interface)
            2.1: List(Interface) extends Collection(Interface)
            2.2: Set(Interface) extends Collection(Interface) ,
                2.2.1: SortedSet(Interface) extends Set(Interface)
            2.3: Queue(Interface) extends Collection(Interface),
                2.3.1: Deque(Interface) extends Queue(Interface)
    Classes:
            1: ArrayList implements List(I)
            2: LinkedList implements List(I),SortedSet(I- extends Set(I)),Deque(I- extends Queue(I))
                Summary LinkedList class can implements List,Set,SortedSet,Queue, and Deque.
            3: Vector implements List(I)
            4: HashSet implements SortedSet(I- extends Set(I))
                Summary HashSet class can implement Set, and SortedSet.
            5: TreeSet implements SortedSet(I- extends Set(I))
                Summary TreeSet class can implement Set, and SortedSet.
            6: PriorityQueue implements Deque(I- extends Queue(I))
            7: ArrayDeque implements Deque(I- extends Queue(I))

    The second Map branch:
    Interfaces:
            1: Map(Interface) The parent interface
            2: SortedMap(Interface) extends Map(Interface)
    Classes:
            1: HashMap implements SortedMap(interface extends Map interface).
            2: LinkedHashMap implements SortedMap(interface extends Map interface).
            3: TreeMap implements SortedMap(interface extends Map interface).

    Collection<String> fruits = new ArrayList<>();
    Now we can access all the methods of the Collection interface and also Iterable interface, cause Collection extends
    Iterable.
    Also, all others methods of the ArrayList class and all others methods of implemented interfaces and extend class.
     */
}

package coreJava.collections;

import java.util.LinkedList;

public class LearnLinkedList {
    static void main(String[] args) {
        /*
         As we know LinkedList implements these interfaces, that is how
         we are able to pass the reference of them while creating the LinkedList.
         List<Integer> linkedList = new LinkedList<>();
         Queue<Integer> linkedList1 = new LinkedList<>();
         Deque<Integer> linkedList2 = new LinkedList<>();

         LinkedList is not as the same as Array and ArrayList which is store the
         data in a contiguous memory. Instead, it is store the data in separate parts
         of the memory. Think of a Train made of connected cars.

         Every single item in the list is wrapped in an object called a Node.
         Node generally contains two things:
         The actual data -> "MyName" and the Pointer(link) directly to the next
         Node in line.

         But, in Java it is specifically a Doubly LinkedList. Which means every Node
         holds two pointers.
         One pointing forward to the next item, and one pointing backward to the previous
         item.
         ["Islambad","Karachi","Lahore"]
         Node1: Null <- Prev, Data:"Islamabad", Next -> Karachi
         Node2: Islamabad <- Prev, Data:"Karachi", Next -> Lahore
         Node3: Karachi <- Prev, Data:"Lahore", Next -> Null
        */
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums.getFirst());
        System.out.println(nums.getLast());
        System.out.println(nums.get(3));
        System.out.println(nums);
        // Queue/Deque specific methods
        System.out.println(nums.offer(5));
        System.out.println(nums);
        System.out.println(nums.peek());
        System.out.println(nums.peekFirst());
        System.out.println(nums.peekLast());

    }
}

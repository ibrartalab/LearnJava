package coreJava.advanced.collections.collectionbranch;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class LearnArrayDeque {
    static void main(String[] args) {
        // ArrayDeque is a short form for (Array Double-Ended Queue).
        // It's a hybrid data structure which allows you to add or remove
        // items from both the front and the back at lighting-fast speed.
        // It maintains two pointers: The Haad and Tail pointer.

        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.offer("D");
        System.out.println(stack);
        System.out.println(stack.pollLast());

        // Queue
        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println(queue);
        System.out.println(queue.poll());

        /*
         PriorityQueue
         is a specialized class in Java that handles data based on importance or value,
         rather than just the order in which the items arrive.
         Instead of operating on a strict First-In, First-Out (FIFO) basis like a movie theater line,
         it works like a hospital emergency room: patients with the most urgent needs are treated first,
         regardless of when they checked in.
         Everytime you add an element to the queue Java used a self-sorting inbox system to position it based on
         its priority. This self-sorting system arrange items in a natural ascending order(smallest number or alphabetical
         letters first).
        */
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(); // its gonna used the default priority
        pQueue.offer(40);
        pQueue.offer(10);
        pQueue.offer(50);
        pQueue.offer(20);
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue);

        // But if we want to out the larger numbers first we need to define
        // custom ordering system.
        PriorityQueue<Integer> pQueue1 = new PriorityQueue<>((a,b) -> b-a);
        pQueue1.offer(10);
        pQueue1.offer(30);
        pQueue1.offer(90);
        pQueue1.offer(60);
        System.out.println(pQueue1.peek());
        System.out.println(pQueue1.poll());
        System.out.println(pQueue1.poll());


    }
}

package coreJava.collections;

import java.util.ArrayDeque;

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

        ArrayDeque<String> queue = new ArrayDeque<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println(queue);
        System.out.println(queue.poll());

    }
}

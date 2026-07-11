package coreJava.memory;

public class Memory {
    /*
        We have two types of logical sepration of memory. The heap and stack memory.
        Stack memory creates stacks for each method call and their respective primitive
        types live inside the own stack, and it is a short-lived memory. Once the
        method execution end the particular stack will be gone from the stack memory.
        The second one we have heap memory where all the objects are stored here.
        but the refernces for the objects are still store inside the stack.
    */
    static void main(String[] args) {
        int x = 10;
        Memory memory = new Memory();
        String name = "Ibrar";

        // Stack:
        //  main[x=10, memory(which is referencing to Memory inside the hea),name]
        // Heap:
        //  Memory, String lined inside a special area called (String pool)
    }
}

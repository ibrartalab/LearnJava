package coreJava.advanced.threads.basics;

public class BasicThread {
    static void main(String[] args) {
        System.out.println("Hello World!");

        // Whenever we run the hello program there is always one thread which execute.
        System.out.println(Thread.currentThread().getName());

        // Know to crate our own thread we can either extend the Thread class or implement
        // Runnable interface

        // Let's try with the Thread class
        ThreadWorld world = new ThreadWorld();
        ThreadHello hello = new ThreadHello();
        world.start();
        hello.start();

        // Now to learn the second way of creating thread
        // by implementing the runnable interface
        ThreadA threadA = new ThreadA();
        Thread thread = new Thread(threadA);
        // There is no direct use of the start method
        // threadA.start();
        thread.start();
        System.out.println(thread.currentThread().getName());


    }
}

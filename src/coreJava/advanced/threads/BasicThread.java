package coreJava.advanced.threads;

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

    }
}

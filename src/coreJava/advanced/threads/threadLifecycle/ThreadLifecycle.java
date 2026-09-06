package coreJava.advanced.threads.threadLifecycle;

public class ThreadLifecycle {
    static void main(String[] args) throws InterruptedException{
        ThreadWow wow = new ThreadWow(); // NEW
        ThreadNice nice = new ThreadNice(); // NEW

        System.out.println("Thread Name:" + wow.getName() + " Status: " + wow.getState());
        System.out.println("Thread Name:" + nice.getName() + " Status: " + nice.getState());

        wow.start(); // RUNNABLE / RUNNING
        nice.start(); // RUNNABLE / RUNNING

        System.out.println("Thread Name:" + wow.getName() + " Status: " + wow.getState());
        System.out.println("Thread Name:" + nice.getName() + " Status: " + nice.getState());

        Thread.sleep(100); // TIMED_WAITING

        // TIMED_WAITING
        System.out.println("Thread Name:" + wow.getName() + " Status: " + wow.getState());
        System.out.println("Thread Name:" + nice.getName() + " Status: " + nice.getState());

        wow.join(); // TERMINATED
        nice.join(); // TERMINATED

        System.out.println("Thread Name:" + wow.getName() + " Status: " + wow.getState());
        System.out.println("Thread Name:" + nice.getName() + " Status: " + nice.getState());
    }
}

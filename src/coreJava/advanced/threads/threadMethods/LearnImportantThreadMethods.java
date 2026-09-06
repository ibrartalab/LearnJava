package coreJava.advanced.threads.threadMethods;

public class LearnImportantThreadMethods {
    // We know about anonymous classes.
    // So will be using it, because we do not want to create extra classes.
    static void main() throws InterruptedException{
        /*
            start() - Will make it ready to execute or being running
            sleep() - Stop thread for some time,which moving into TIMED_WAITING state
            join() - Tells the caller thread/method to wait for the completion on which
                     thread this method has been called
            getPriority() - To get the priority number of the thread
            getState() - To get the current state of the thread
            getName() - To get the name of the thread
            setPriority() - To set the your own priority
        */
        Task t1 = new Task(); // NEW state
        Task2 t2 = new Task2(); // NEW state
        Task t3 = new Task(); // NEW state

        // To print the current state and name of the thread call getState and getName
        // on that thread to get.
        System.out.println(t1.getName() + " " + t1.getState());
        System.out.println(t2.getName() + " " + t2.getState());
        System.out.println(t3.getName() + " " + t3.getState());

        // This start() method will move the thread from a NEW state
        // into RUNNABLE or RUNNING
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.getName() + " " + t1.getState());
        System.out.println(t2.getName() + " " + t2.getState());
        System.out.println(t2.getName() + " " + t3.getState());

        // This method will return the default priority of the thread
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName() + " " + t1.getPriority());
        System.out.println(t2.getName() + " " + t2.getPriority());
        System.out.println(t3.getName() + " " + t3.getPriority());

        // This Thread.sleep() method will might throw an InterruptedException
        // so we need to handle it.
        // This will move the thread from a RUNNABLE state into TIMED_WAITING
//        Thread.sleep(200);
        Thread.yield();
        System.out.println(Thread.currentThread().getState());

        System.out.println(t1.getName() + " " + t1.getState());
        System.out.println(t2.getName() + " " + t2.getState());
        System.out.println(t3.getName() + " " + t3.getState());


        t1.join(); // Move into TERMINATED state
        t2.join(); // Move into TERMINATED state
        t3.join(); // Move into TERMINATED state
        System.out.println(t1.getName() + " " + t1.getState());
        System.out.println(t2.getName() + " " + t2.getState());
        System.out.println(t3.getName() + " " + t3.getState());

        System.out.println(t1.isAlive());

    }
}

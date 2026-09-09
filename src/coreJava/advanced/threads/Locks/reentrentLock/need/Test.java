package coreJava.advanced.threads.Locks.reentrentLock.need;

public class Test {
    static void main() {
        Example1 example1 = new Example1();
        Example2 example2 = new Example2();

//        example1.resource1();
//        example2.resource1();

        Runnable task = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " " + "Executing...");
                example2.resource1();
            }
        };

        Thread t1 = new Thread(task,"T1");
        Thread t2 = new Thread(task,"T2");

        t1.start();
        t2.start();

    }
}

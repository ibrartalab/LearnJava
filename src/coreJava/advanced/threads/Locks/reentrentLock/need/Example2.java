package coreJava.advanced.threads.Locks.reentrentLock.need;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example2 {
    private final Lock lock = new ReentrantLock();

    // Reentrant lock is basically maintaining a counter for each lock.lock()
    // against lock.unlock()
    public void resource1(){
        // lock acquired
        lock.lock(); // count = 1
        try {

            System.out.println(Thread.currentThread().getName() + " " + "Resource 1"); // this line will print
            resource2(); // call this method- jump-into it
            Thread.sleep(2000);
            // critical processes processing here
            System.out.println(Thread.currentThread().getName() + " " + "This is critical area!, Do not give access");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            // this will unlock this resource1() lock
            lock.unlock();
            //count = 0
        }
    }

    // resource1() call this method resource2()
    public void resource2(){
        // this method also acquired another lock
        lock.lock(); // count = 2
        try{
            System.out.println(Thread.currentThread().getName() + " " + "Resource 2"); // this line will print
        }finally {
            lock.unlock(); // this will unlock the current lock
            // count = 1

            // Now you understand this that if we have a resource call another resource
            // and both acquired locks itself it won't break the code, because the java
            // reentrantLock main a counter against it.

            // So, you decide why not to put both unlock methods inside the resource2
            // finally block to avoid confusion.
//            lock.unlock();

            // This will still work, because we know that the counter will become 0.
            // which is correct, but there is a flaw in this code.
            // So, unlocking all the locks here will work the same, but if new thread
            // want to enter they will directly read all the hidden and sensitive info or executing
            // methods.
            // look in line no 17
        }
    }
}

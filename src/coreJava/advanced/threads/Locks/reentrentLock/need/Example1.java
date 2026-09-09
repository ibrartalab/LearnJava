package coreJava.advanced.threads.Locks.reentrentLock.need;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example1 {
    private final Lock lock = new ReentrantLock();

    // Reentrant lock is basically maintaining a counter for each lock.lock()
    // against lock.unlock()
    public void resource1(){
        // lock acquired
        lock.lock(); // count = 1
        try {
            System.out.println("Resource 1"); // this line will print
            resource2(); // call this method- jump-into it
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            lock.unlock(); // this will unlock this resource1() lock
            // count = 0
        }
    }

    // resource1() call this method resource2()
    public void resource2(){
        // this method also acquired another lock
        lock.lock(); // count = 2
        try{
            System.out.println("Resource 2"); // this line will print
        }finally {
            lock.unlock(); // this will unlock the current lock
            // count = 1
        }
    }
}

package coreJava.advanced.threads.Locks.readwrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SourceCode {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    private StringBuilder code = new StringBuilder("feature-0");

    public String pushCode(String newCode) {
        writeLock.lock();
        try {
            code.append(", ").append(newCode);
            return "Code Pushed!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Something wrong happened, your original code are: " + code;
        } finally {
            writeLock.unlock();
        }
    }

    public void getCode() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "read: " + code);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            readLock.unlock();
        }
    }
}

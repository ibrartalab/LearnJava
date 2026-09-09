package coreJava.advanced.threads.Locks.reentrentLock.fairnessReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance = 1000;
    // The purpose of this locking is basically to maintain the order of executions.
    // If you define or call the t1 first, then t2, and the last t3.
    // It will execute in the same order.
    private final Lock fairLock = new ReentrantLock(true);

    public void withdrawMoney(double amount) {
        System.out.println(Thread.currentThread().getName() + " " + "Attempting to Withdraw");
        try {
            if (fairLock.tryLock()) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " " + "Transaction processing..." + amount);
                        Thread.sleep(2000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " " + "Remaining balance is: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        System.out.println(e.getMessage());
                    } finally {
                        fairLock.unlock();
                    }

                } else {
                    System.out.println(Thread.currentThread().getName() + " " + "Insufficient balance");
                }
            } else {
                System.out.println("The current resource has been acquired by another process");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println(e.getMessage());
        }
    }
}

package coreJava.advanced.threads.Locks.reentrentLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private  double balance = 100;
    private Lock lock = new ReentrantLock();

    public  void withdraw(double amount){
        System.out.println(Thread.currentThread().getName() + " " + "Attempting withdrawal: " + amount);
        try {
            if(lock.tryLock(2000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " "+ "Processing transaction...");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " "+ " Transaction success:Remaining balance: " + balance);
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName() + " "+ "Insufficient balance");
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " "+ "Another process trying for the same resource.");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public double getBalance(){
        return balance;
    }
}

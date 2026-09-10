package coreJava.advanced.threads.Locks.deadlocks.example1;

public class Bank {
    public static void transfer(BankAccount from, BankAccount to, double amount){
        synchronized (from){
            System.out.println(Thread.currentThread().getName() + " " + "Locked" + from.accountHolder);
            try{
                Thread.sleep(40000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            synchronized (to){
                from.balance -= amount;
                to.balance += amount;
                System.out.println(Thread.currentThread().getName() + " " + "transferred" + amount);
            }
        }
    }
}

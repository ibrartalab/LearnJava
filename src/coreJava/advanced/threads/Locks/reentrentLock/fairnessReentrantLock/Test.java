package coreJava.advanced.threads.Locks.reentrentLock.fairnessReentrantLock;

public class Test {
    static void main() throws InterruptedException {
        BankAccount bankAccount = new BankAccount();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdrawMoney(200);
            }
        };

        Thread t1 = new Thread(task,"Thread-1");
        Thread t2 = new Thread(task,"Thread-2");
        Thread t3 = new Thread(task,"Thread-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

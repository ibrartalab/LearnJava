package coreJava._03.advanced.threads.Locks.deadlocks.example1;

public class BankAccount {
    final String accountHolder;
    double balance;

    public BankAccount(String accountHolder,double amount){
        this.accountHolder = accountHolder;
        this.balance = amount;
    }

}

package coreJava.advanced.threads.Locks.deadlocks.example1;

public class Test {
    static void main(String[] args) {
        PersonA personA = new PersonA("Ibrar",20);
        PersonB personB = new PersonB("Khan",23);

        BankAccount p1Account = new BankAccount(personA.getName(),1000);
        BankAccount p2Account = new BankAccount(personB.getName(),500);

        new Thread(() -> Bank.transfer(p1Account,p2Account,300),"T1").start();
        new Thread(() -> Bank.transfer(p2Account,p1Account,200),"T2").start();
    }
}

package coreJava.oops.inheritance.multiLevel;

public class Parent extends GrandParent {
    private boolean haveJob;

    public double getMoneyInBankAccount() {
        double moneyInBankAccount = 30000000.00;
        return moneyInBankAccount;
    }

    @Override
    public void greet() {
        System.out.println("Hi, from parent");
    }
}

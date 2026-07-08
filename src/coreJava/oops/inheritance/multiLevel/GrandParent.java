package coreJava.oops.inheritance.multiLevel;

public class GrandParent {
    private final int hasCar = 2;
    private final int hasLands = 3000;
    private final int hasHouse = 2;
    private final double inCashMoney = 100000000.00d;


    public int getHasCar() {
        return hasCar;
    }

    public int getHasLands() {
        return hasLands;
    }

    public int getHasHouse() {
        return hasHouse;
    }

    public double getInCashMoney() {
        return inCashMoney;
    }

    public void greet(){
        System.out.println("Hello, from grand parent!");
    }

}

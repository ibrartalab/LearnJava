package coreJava.oops.abstraction;

public class TestAbstraction {
    static void main(String[] args) {
        Car myCar = new Car("Mercedes","M2026",true,4,2);
        myCar.hasSideMirrors(myCar.sideMirrors);
        myCar.hasToFuel(20);
        System.out.println(myCar.fuelLiters);
        myCar.hasWheels(myCar.wheels);
    }

    // Abstraction provide us a way to hide internal details, So that the end user do not need to
    // worry about it. we can achieve abstraction in java using the abstract keyword.
    // You can create abstract classes, methods. Abstraction is more like is a contract
    // where the implementing party of that contract must have to follow all the rules and implementation
    // of the contract properly.

    // In Java, you should create abstract methods inside an abstract class, but can not create
    // it inside a non-abstract class that is not allowed.
    // Also, an abstract class has to be both abstract and non-abstract methods, but not wise versa.

}

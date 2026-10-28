package coreJava.oops.inheritance.multiLevel;

public class TestMLInheritance {
    static void main(String[] args) {
        Child c1 = new Child(1);
        int car = c1.getHasCar();
        System.out.println(car);
        c1.greet();

        /*
            If a child class does not have implementations for their immediate parent method
            it will look into just the immediate parent of that child class or if neither he has
            then the most outer or the higher in the order will run their own implementations.

            GrandParent has a method called greet();
            Parent extend GrandParent and override greet();
            Child extend Parent but does not override the greet() method himself.

            Now when you create an object of the child class Child c1 = new Child();
            and then call c1.greet() --> first it will look inside the child class for this
            method if its found here it will return/run whatever has been written in it.
            But in-case inside the Child class has no implementation found, then the JVM look
            for the implementatio of greet() inside immediate parent/base class of the Child
            which is the Parent class in our case. And in-case parent does not have the greet()
            then it will continue searching in the same direction bottom to up looking first in
            the subclasses and then moving to baseclasses.
         */
    }
}

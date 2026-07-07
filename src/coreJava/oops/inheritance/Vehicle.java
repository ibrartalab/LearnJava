package coreJava.oops.inheritance;

public class Vehicle {
    String name;
    String model;
    boolean hasEngine;
    int wheels;

    public void canStart(){
        System.out.println("Vehicle is starting...");
    }
    public void canMove(){
        System.out.println("Vehicle is moving...");
    }
}

package coreJava.oops.inheritance;

public class Car extends Vehicle {
    String color;
    int carRegNumber;

    public Car(String name,String model,boolean isEngine,int countWheels,String color,int carRegNumber){
        super.name = name;
        super.model = model;
        super.hasEngine = isEngine;
        super.wheels = countWheels;
        this.color = color;
        this.carRegNumber = carRegNumber;
    }
    @Override
    public void canStart(){
        System.out.println(name+" is staring engine...");
    }
    @Override
    public void canMove() {
        System.out.println(super.name + " is moving...");
    }
}

package coreJava.oops.abstraction;

public class Car extends Vehicle{
    String name;
    String model;
    boolean hasEngine;
    int wheels;
    int fuelLiters = 10;
    int sideMirrors;

    public Car(String name,String model,boolean hasEngine,int wheels,int sideMirrors){
        this.name = name;
        this.model = model;
        this.hasEngine = hasEngine;
        this.wheels = wheels;
        this.sideMirrors = sideMirrors;
    }

    public void hasWheels(int wheels){
        System.out.println("This "+this.name+" has "+wheels+" number of wheels.");
    }

    public void hasToFuel(int liters){
        this.fuelLiters += liters;
        System.out.println(name+" has add"+liters+" liters of more fuels.");
    }
    public void hasSideMirrors(int mirrors){
        System.out.println("This "+name+" car has "+mirrors+" number of side mirrors");
    }
}

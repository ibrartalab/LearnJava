package coreJava.oops.abstraction.interfaces;

public class LearnInterfaces {
    static void main(String[] args) {
        Car newCar = new Car();
        newCar.hasWheels();
        newCar.hasToFuel();
        newCar.hasSideMirrors();
    }
}

/**
 * Interface is a new concept which doing the same thing as abstract classes, but it
 * has its own benefits of using over abstract class.
 * While its not a pure way of achieving abstraction in our program , but in the other
 * hand its give us the flexibility to use multiple inheritance and default methods
 * creating options.
 */
interface Vehicle{
    /**
     * we can use properties inside interfaces, but that will be
     * static final variables. Because this interface will be implemented by many
     * others classes, and we want a consistent data sharing, so neither any class
     * have the rights to change the data.
     */
    public static final int regNo = 134587;

    /**
     * All gray color keywords are redundant means you do not need
     * to add explicitly, java add it implicitly for us.
     */
    public void hasWheels();
    public void hasToFuel();
    public void hasSideMirrors();
}

class Car implements Vehicle{

    @Override
    public void hasWheels() {
        System.out.println("Car has wheels");
    }

    @Override
    public void hasToFuel() {
        System.out.println("Car has to add fuels");
    }

    @Override
    public void hasSideMirrors() {
        System.out.println("Car has two side mirrors");
    }
}
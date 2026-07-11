package coreJava.oops.abstraction;

abstract class Vehicle {
    abstract void hasWheels(int wheels);
    abstract void hasToFuel(int liters);
    abstract void hasSideMirrors(int mirrors);

    /*
    Note:
        Abstract class can have abstract and non-abstract(concrete) methods.
        But we can not define abstract methods in a non-abstract class.
        Which means if we need to use abstract methods inside a non-abstract class
        we must make it abstract or move them into a separate abstract class.
     */
    /*
     you can later override this method in its implementation class, but you do not need
     to write implementation for it you want to use as it is.
    */
    public void sayHello(){
        System.out.println("Hello!");
    }
}

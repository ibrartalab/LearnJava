package coreJava.oops.basics;

public class BasicsOfOops {
    /*
     Object-Oriented Programming (OOP) is a development paradigm focused on classes and objects.
     It secures and protects data from unauthorized access through encapsulation.
     It also hides internal complexity using abstracted methods, shielding end users from implementation details.
     This structure enhances code reusability, organization, and scalability.
     We have four pillars of oops to achieve all the benefits of using it.
     Inheritence, Abstraction, Ploymorphism, and Encapsulations.
     We will definitely learn each of them one by one indetails in their own respective package, but here we are just to know
     the basics to confidently use it.
     Now as we know that everything in java is written and will be using inside classes and objects, by using the oops principle.
     What is object?, what is class?, and how to use it.

    Class:
        A class is a blueprint or a sketch for an object to be crated by using it.
        class is a logical entity which does not exist in real, but it does have the power to help objects being created.
        think of a blueprint of a house that is being used for to build houses not a single one. Class is created once that
        can be used multiple times to create multiple objects of the same type.
    Object:
        An object is a real and physical entity like car, house, laptop and anything in the real world.
        Objects hold the data/information for a real objects which going to be mapped in the codes. The computer memory are
        allocated against the objects to store data of that objects.

    How to create objects and classes in Java?
    to create classes and objects in java we need to know the syntax rules for it.
    we will learn each and everything in details just bare with us.

    public class MyClass{}

    Is it that simple to create a class inside java.
    the signature for a class is straight forward you define access-modifiers following by the class keyword and the class name of your
    choice and in last the curly braces.

    public( is an access-modifiers) class(reserved java keyword) MyClassName(name for your class) block scope {}.
    the scope is the body of the class where you can write the properties and behaviors.

    How to write the Hello World program?
    public class Main{
        public static void main(String[] args){
            System.out.println("Hello World, Java folks!);
        }
    }

    Now it is time to learn how to create objects and how to use it.

    public class Car{
        int age;
        String name;
    }

    Now to create an object of the car class and use it, we need the Java Main class and the main method which is the entry
    point for every Java program.
    You might also be thinking about what is method and why we need it in this place. we will learn methods later, but for now
    think of it is the engine for your program to crate objects and run it.

    public class Main{
        public static void main(String[] args){
            Car myCar = new Car();
            myCar is the object of the Car class. which means you can access all the properties and behaviors of
            the Car class using the myCar object.

            myCar.age = 23;
            myCar.name = "Khan";
            System.out.println("My name is" + name + " and I am " + age + "years old.");
        }
    }

    So, in actual this is the code to create objects => Car myCar = new Car();
    */
}

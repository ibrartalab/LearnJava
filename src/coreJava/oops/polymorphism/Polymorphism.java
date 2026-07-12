package coreJava.oops.polymorphism;

public class Polymorphism {
    /*
        Polymorphism the word is the combination of two words Poly and Morphism.
        Poly - means many
        Morphism - means forms
        Which means same methods or objects that behave in many forms.

        There are two types of polymorphism the runtime and compile time.
     */
    static void main(String[] args) {
        Dog tommy = new Dog("Tommy",2,4);
        tommy.sound();
        // This is called method overloading(compile time polymorphism).
        tommy.findThief();
        tommy.findThief("wallet");

        /*
         We could also instantiate the jane(Dog) obect by lcoking or passing
         the reference of the Animal class, cause Dog is inheriting Animal, but
         then  we can only access the Base class(Animal) properties and behaviuors.
         If you can try accessing the jane.findThief() we couldn't. This is also
         known as Runtime polymorphism. This is also called upcasting.
        */
        Animal jane = new Dog("Jane",2,4);
        jane.sound();

        /*
         Down-casting is explicitly casting base class reference back into
         subclass reference.
         Animal tommy = new Dog(); -- this is up-casting.
         We are referncing baseclass while creating the subclass Dog.
         Dog myDog = (Dog) tommy; -- this is down-casting
         Compiler does not check the explicit casting at compile time.
         Note:
         If the right site of object is not a subclass of the left side
         reference it won't give a compile time error, but it will crash
         your ptogram at run-time.
        */

        Dog myTommy = (Dog) tommy; // compile and runtime both are safe.

        // This will give a runtime error.
//        Animal ree = new Cat();
//        Cat myRee = (Cat) ree;

    }

}

class Animal{
    private final String name;
    private final int eyes;
    private final int legs;

    public Animal(String name,int eyes,int legs){
        this.name = name;
        this.eyes = eyes;
        this.legs = legs;
    }
    public void sound(){
        System.out.println("Animal sound");
    }
    public String getName(){
        return this.name;
    }
    public int getEyes(){
        return this.eyes;
    }

    public int getLegs() {
        return this.legs;
    }
}


class Dog extends Animal{
    public Dog(String name,int eyes,int legs){
        super(name, eyes, legs);
    }

    /**
     * This sound method is overridden inside Dog and this is called Method Overriding(runtime polymorphism).
     * sound() in this place is calling the getName() method to get the current Dog name in then write
     * their own implementation for sound() method.
     */
    @Override
    public void sound(){
        String name = getName();
        System.out.println(name+" is barking loudly.");
    }

    /**
     * This method will find the thief, by smelling an object of the thief
     * by the dog. This method is takes one object parameter.
     * @param object - which does not return anything, cause it's a void method.
     */
    public void findThief(String object){
        System.out.println(getName()+" is smelling the "+object+" to find the thief.");
    }
    /**
     * This method will find the thief, by smelling an object of the thief
     * by the dog. This method does not take any object parameter.
     * which does not return anything, cause it's a void method.
     */
    public void findThief(){
        System.out.println(getName()+" is smelling to find the thief.");
    }
}

class Cat{
    public void sound(){
        System.out.println("Meow....");
    }

}
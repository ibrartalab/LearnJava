package coreJava.oops.abstraction.interfaces.functionalinterfaces;

public class FunctionalInterfaces {
    /*
     Functional Interface is an interface which has only one abstract method.
     If that is the case you can call it by using the @FunctionalInterface annotation to declare it.
     You can access it through a lambda expression.

     It is the same is declaring inner, nested or anonymous classes, but by avoiding the repetitive things.
     */
    static void main(String[] args) {
        //Lambda expression
        Clouds clouds = () -> System.out.println("It's raining...");
        clouds.rain();

        /*
            If you look it to the lambda expression it's the same as creating inner or anonymous
            classes.
            Outerclass.Inner inner = new Outerclass(). new Inner();
            OR
            Outerclass aClass = new Outerclass(){
                @override
                public void rain(){
                    System.out.println("It's raining...");
                }
            };

            we replace the above examples.
            with the lambda expression make it simple and easy to use.
            () -> {};
         */
    }
}

@FunctionalInterface
interface Clouds{
    void rain();
}

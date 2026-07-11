package coreJava.methods;

public class TestMethods {
    static void main(String[] args) {

        int sumOfTwo = MethodsInJava.sum(12,30);
        System.out.println(sumOfTwo);

        String pass = "khan123khan";
        String hashed = MethodsInJava.replaceWithStars(pass);
        System.out.println(hashed); // 11 stars
        String hashed2 = MethodsInJava.optimizedReplaceWithStars(pass);
        System.out.println(hashed2); // 11 stars
        /*
         You will see the same output in the console for both, but the difference is in the logic and how
         optimize it is.
         The TimeComplexity of replaceWithStars will be BigO(n2)
         For enhanceReplaceWithStars is going to be BigO(n)
         Tricky Questions
         What will be the value of x after calling the incrementByOne(x) method.
        */


        int x = 20;
        int incrementedByOne = MethodsInJava.incrementByOne(x);
        System.out.println(incrementedByOne); // 21
        System.out.println(x); // 20
        /*
         Why the original value does not change/update of x. While the answer is simple, it because when you are
         using primitive its basically copy the value of x and pass to the method. then the method perform operation
         based on the copied value and then return it back. So the variable who's stored the returned value is going to be
         the updated one, but as we already discuss the original value will remain the same.
         Provided given string tell us what will happen after called the intoUpperCase(String) method.
        */

        String name = "Khan";
        MethodsInJava.intoUpperCase(name); // KHAN
        System.out.println(name); // Khan (the original one)
        /*
         As we know Strings are immutable it means once you create a string you will be unable to change it.
         It is the same condition as the above primitive although string is an object , but it's use string pool
         A special area in the heap to store the same string object(instance) at once and share it across the variables.
        */
        MethodsInJava.intoLowerCase(name); // khan

    }
}

package coreJava.methods;

public class MethodsInJava {

    // Methods are used to group logics in one place that could be use in multiple places laters.
    // Methods help us to achieve reusability in the code.
    // Think of a scenario where you required to sum two numbers in many places at your code, you can do it by writing the same logic in each place
    // or create a sum() method to reuse whenever you need it.

    /*
    * Let's understand every keyword that we used in methods
    * public static int sum(int n1, int n2){
    *   return n1 + n2;
    * }
    * public -> this is an access modifier, where to access this method in different places in your project. public(access everywhere).
    * static -> Its become a part of the class itself, rather than its instance of the class. which means you don't need to create an object
    *           of the class to access it, instead just by using the class name. ClassName.MethodName(parameters).
    * int -> It's a primitive that can hold numbers, but in here used as a return type for the returning value from this method. value = n1+n2;
    * sum -> Is the method name. you can follow the same rules of variables name for methods name as well.
    * (int n1, int n2) -> These are the parameters for this method, which will be passing by the caller of this method.
    *                       You can pass as many as you want parameters.You can also pass different types of params to this same method.
    * {} -> It's called the block. Inside this block you can perform any kind to operations It's also known body of the method.
    * methodName(params) -> This is the signature of the method. It is important concept for method overriding and overloading.
    */
    public static int sum(int n1, int n2){
        return n1 + n2;
    }

    // This method will take one parameter as input and increment by 1 using the pre-increment operator. And return the updated value.
    public static int incrementByOne(int x){
        return ++x;
    }

    // As we already discuss, that you can pass/accept any type of value in the method signature.
    // This method can take a string as input validate it, if it's null or not.
    // then remove all the extra spaces and convert into upper case.
    public static void intoUpperCase(String str){
        if(str != null){
        System.out.println(str.trim().toUpperCase());
        }
    }
    // Same as the intoUpperCase method instead it will convert a string into lowerCase
    public static void intoLowerCase(String str){
        if(str != null){
            System.out.println(str.trim().toLowerCase());
        }
    }

    // Convert a string of chars into stars(*)
    public static String replaceWithStars(String str){
        String hash = "";
        // Removing extra spaces
        String trimmedStr = str.trim();
        // count the letters
        int count = 0;
        for(int i=0; i < trimmedStr.length(); i++){
            count++;
        }
        // convert into count time stars
        for(int i=1; i <= count; i++){
            hash += "*";
        }
        return hash;
    }
    // Enhanced and optimized version of string into stars method.
    public static String optimizedReplaceWithStars(String str){
        StringBuilder builder = new StringBuilder();
        builder.repeat("*", str.trim().length());
        return builder.toString();
    }
}
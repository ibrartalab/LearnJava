package coreJava.methods;

public class MethodsInJava {

    static void main() {
        int res = sum(12,30);
        System.out.println(res);
        String name = "     Khan    ";
        intoUpperCase(name);
        intoLowerCase(name);
        replaceWithStars(name);
        optimizedReplaceWithStars(name);

        // Tricky conditions
        int x = 10;
        int incrementedValue = incrementByOne(x);
        System.out.println(incrementedValue); // 11
        System.out.println(x); // 10

        String greeting = "Hello!";
        intoUpperCase(greeting);
        System.out.println(greeting);


    }

    // Methods are used to group logics and write it once to run multiple times in multiple places.
    // Think of it, you need to add some numbers in different places multiple times.
    // So, you will just write the same code everywhere again and again.
    public static int sum(int n1, int n2){
        return n1 + n2;
    }
    public static int incrementByOne(int x){
        return ++x;
    }

    // Methods that are not just work with integers, but can also work with strings.
    // Write a method to convert the provided string into an Upper case removing extra spaces.
    public static void intoUpperCase(String str){
        if(str != null){
        System.out.println(str.trim().toUpperCase());
        }
    }

    public static void intoLowerCase(String str){
        if(str != null){
            System.out.println(str.trim().toLowerCase());
        }
    }

    public static void replaceWithStars(String str){
        // Removing extra spaces
        String trimmedStr = str.trim();
        // count the letters
        int count = 0;
        for(int i=0; i < trimmedStr.length(); i++){
            count++;
        }
        // convert into count time stars
        for(int i=1; i <= count; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    // Now think of optimizing the replaceWithStars method.
    public static void optimizedReplaceWithStars(String str){
        for(int i=0; i < str.trim().length(); i++){
            System.out.print("*");
        }
        System.out.println();
    }



}

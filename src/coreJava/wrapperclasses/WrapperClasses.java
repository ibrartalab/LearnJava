package coreJava.wrapperclasses;

public class WrapperClasses {
    /*
     Wrapper classes are Java classes which wrap up the primitive data types
     into object type.
     It's useful when working with collections.
     Integer, Float, Char,Long,Boolean
    */
    static void main(String[] args) {
        IntWrapper intWrapper = new IntWrapper(12);
        Integer d = intWrapper.getData();
        System.out.println(d);

        /*
         Now there is a concept of autoboxing and unboxing.
         Autoboxing is the automatic conversion the compiler makes between primitive types
         and their corresponding object wrapper classes (e.g., int to Integer).
         Unboxing is the reverse process, converting an object wrapper class back into
         its primitive type (e.g., Integer to int).
        */
        Character ch = 'a';
        Integer age = 23;
        Boolean isDev = true;
        /*
         we write this code Character ch='a'; but the compiler call the valueOf()
         method on that specific wrapper class.
         Character ch = Character.valueOf('a'); - this is done by the compiler it is
         called autoboxing.
        */

        // This is Unboxing explicit conversion back to primitive from a wrapper class.
        char originalCh = ch;
        int myAge = age;
        boolean iamDev = isDev;

        /*
         we write this code char originalCh = ch; but the compiler call the
         char originalCh = ch.charValue();
         method on that specific primitive type.
         Even though this method char originalCh = ch.charValue(); call is also done
         by the compiler itself, but we explicitly tell the compiler to invoke this
         method by specifying this line char originalCh = ch;.
        */
    }

}

/**
 * This class is basically a custom wrapper class for primitive int data type.
 */
class IntWrapper{
    int data;

    public IntWrapper(Integer data){
        this.data = data;
    }
    public Integer getData(){
        return this.data;
    }
}
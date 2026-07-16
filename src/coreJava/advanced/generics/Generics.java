package coreJava.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    /*
     Generics allow you to write a single class,interface, or method that
     works with different data types while maintaining strict compile-time
     type safety.
     By using parameters types like <T>.

     This old way of manul casting can cause ClassCastException
         if someone add int or any other type of data rather than String at position 0.
         List list = new ArrayList();
         list.add(12);
         String str = (String) list.get(0);
         System.out.println(str);

    */

    static void main(String[] args) {
        // The new way with Generics
        List<String> names = new ArrayList<String>();
        names.add("Apple");
        System.out.println(names.get(0));

        AClass<Integer> aClass = new AClass<>();
        aClass.setData(1122);
        System.out.println(aClass.getData());

        AClass<String> aClass1 = new AClass<>();
        aClass1.setData("This is how powerful generics are.");
        System.out.println(aClass1.getData());

        BClass bClass = new BClass();
        bClass.print("This is generics specific method.");
        BClass.addStars("Hello");
        BClass.addStars(true);
        BClass.addStars(12);

        Calculator<Integer> calculator = new Calculator<>(12,33);
        int res = calculator.add();
        System.out.println(res);
    }


}

/**
 * This is a custom generic container class which would accept
 * T type of data and work with it.
 * @param <T>
 */
class AClass<T>{
    private T data;

    public void setData(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }
}

/**
 * This class has contains Generic Methods.
 * Which can be used with different type of data using Generics.
 */
class BClass{

    public <T> void print(T data){
        System.out.println(data);
    }
    public static <T> void addStars(T content){
        System.out.println(content+"*");
    }
}

/**
 * Bounded Type Parameters (Restricting Types):
 * Sometimes you want a method or class to work with multiple types,
 * but only within a specific family.
 * You can restrict the acceptable types using the extends keyword.
 */
class Calculator<T extends Number>{
    private final T num1;
    private final T num2;

    public Calculator(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return (num1.intValue() + num2.intValue());
    }
}

package coreJava.oops.basics.statickeyword;

public class StaticKeyword {
    /*
     Static keyword:
        Class members are attached to the class using the static keyword.
        There are two types of class members static and non-static. non-static members are part of the
        instances of the class, where static are attached to the class itself.
     */

    // Static members are loaded first while creating the class during compile time.
    // which means static members will be run before all the rest of the code.
    // Non-static members are run and allocate memory it run-time.
    // So, if you need some work that has to be created and run very first,
    // in this case you have to use static blocks.
    static {
        System.out.println("This will make sure to run first\nBecause this is a static block!");
    }

    // Static variables are created once for the entire application lifecycle and then share a copy
    // across all the users of this.
    // We haven't talked about the final keyword. final keyword is used to make somthing constant that will never be changed.
    public static final String city = "Islamabad";

    // non-static properties
    public int currentYear = 2026;

    // you can access static members inside static and non-static context.
    // But we can't access non-static members inside static context.
    public static void sayHello(){
        System.out.println("Hello from static!");
//         sayHi(); // inaccessible
    }
    public void sayHi(){
        System.out.println("Hi from non-static!");
        // sayHello(); // we can access it here.
    }

    static void main(String[] args) {
        // we can access all the static members without creating an object directly using the class name.
        System.out.println(StaticKeyword.city);
        StaticKeyword.sayHello();

        // so if we want to call sayHi() method. we need to create an object for it.
        StaticKeyword st = new StaticKeyword();
        System.out.println(st.currentYear);
        st.sayHi();

        /*
         We can't access non-static members directly using class name.
         same we can't access static members using the object instance.
         StaticKeyword.sayHi() -- inaccessible
         StaticKeyword.currentYear -- inaccessible

         Also, these as well.
         st.sayHello() or st.city -- inaccessible
        */

    }

}

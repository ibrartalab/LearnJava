package coreJava.basics.operators;

public class AssignmentOperators {
    static void main(String[] args) {
        // Assignment operators help to initialize variables and Objects
        int age; // this is the declaration part
        // to assign an actual age you need to use the assignment operator for it
        age = 24;
        // want to test out what actually will be in age
        System.out.println(age); // this will print 24, we know that
        // so the = sign is called the assignment operator here
        // we have more assignment operators as well like +=,-=,/=,*=

        // suppose we have x and y , and want to add the y into x
        // remember keeping the x original value as well plus adding y to it
        int x = 10;
        int y = 12; // declaration + initialization in one line
//        x = x + y;
//        System.out.println(x);
        x += y;
        System.out.println(x);
        // x = x + y; or x += y; both does the same thing, the only difference is easiness of writing
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
    }
}

package coreJava.printing;

public class Printing {
    void main() {
    /*
     There are three ways to print values in java. println, print and printf.
     system is a class, out is a static member of that class to access the console and the println method to print something.
    */
        System.out.println("Hello Java!"); // println just add a new line to the print statement.

    /*
     print do not add a new line at the end of the print statement.
     System.out.print("Hello Java!");
     System.out.print("Hello Java in next line");
     concatenation
    */

        String name = "Khan";
        int age = 25;
        float height = 5.6f;
        String address = "Village bazargai, district buner.";
        char bloodGroup = 'A';

        System.out.println(name + " " + age + " " + height + " " + address + " " + bloodGroup);
        System.out.printf("My name is %s, I am %d.,My height is %.1f,I blong to this city %s,and my blood group is %c",name,age,height,address,bloodGroup);
    }
}
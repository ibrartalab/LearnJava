package coreJava.dataTypes;

public class DataTypes {
    void main() {
        // Primitive data types
        //Integral/whole numbers
        //byte, short, int, long
        byte age = 127; //1byte
        short age1 = 32767; // 2bytes
        int age2 = 2147483647; // 4bytes
        long age3 = 9223372036854775807L; // 8bytes

        /*
        How to find out the MIN and MAX value for each data type, it will hold.
         byte can hold a values in between -128 to 127
        */
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.BYTES);
        System.out.println(Integer.toBinaryString(127));
        // short can hold a values in between -32768 to 32767
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        // int can hold a values in between -2147483648 to 2147483647
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // long can hold a values in between -9223372036854775808 to 9223372036854775807
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        // Decimal numbers
        // float, double
        float salary = 1000.123212345534532343124321f; // 4bytes
        double xSalary = 2000.4756377366478826466278274625382883652667472534136; // 8bytes
        // float can hold a values in between 1.4E-45 to 3.4028235E38
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        // double can hold a values in between 4.9E-324 to 1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        // characters
        char firstChar = 'I'; // 2bytes
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE); // 65535
        System.out.println((char) (10024)); // You can print any character symbol
        System.out.println(Character.BYTES);
        System.out.println(Integer.toBinaryString(65535)); // 1111111111111111

        //booleans
        boolean isOpen = true;
        boolean isClose = false;
    }
}
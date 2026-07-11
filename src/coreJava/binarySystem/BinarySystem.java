package coreJava.binarySystem;

import coreJava.binarySystem.custom.BinaryToDecimal;
import coreJava.binarySystem.custom.DecimalToBinary;

import java.util.ArrayList;

public class BinarySystem {
    /*
     In Decimal number system we have 10 ( 0 - 9), but in binary we have just two digits ( 0 or 1)
     0,1,2,3,4,5,6,7,8,9 = Decimals
     0,1 = Binary
     Now to understand better we need to learn how the conversion happened from decimal to binary

     we get number 34 in decimal and want to know the binary of it after conversion
     so, the conversion is so simple, divide the decimal by 2.
     34 / 2 = 17 r0
     17 / 2 = 8 r1
     8 / 2 = 4 r0
     4 / 2 = 2 r0
     2 / 2 = 1 r0
     1 / 2 = 0 r1
     start from bottom to top, including the last number goes up to all the reminders.
     100010

     how we can convert binary into decimals. it's very straight forward.
     just get the binary number e.g: 100010
     once you have the binary number assign indexing starting from 0. toward right to left
           5 4 3 2 1 0 --indexes
           1 0 0 0 1 0 --binary
           --now used 2 the power index multiply by the current binary digit --> 2^5 * 1
           2^5*1 2^4*0 2^3*0 2^2*0 2^1*1 2^0*0
           32 0 0 0 2 0
           --sum the resulted values --> 32+0+0+0+2+0 = 34
     so, we get our original decimal number 34

     We learnt how to convert decimal into binary and wise versa.
     how to perform some mathimatical operations on binaries.

     to do binary addition as simple as the normal addition on decimals
         0101
      +  0010
      the operation will go from right to left we now that.
      1+0 = 1, 0+1=1, 1+0=1 --> 111
      101 = 5
      0b010 = 2
      111 = 7
      try on yourself by utilizing the custom converters class's in custom package.

     binary subtraction involve many steps
     suppose you are subtracting 2 from 5, so in this case you need to find out the negative of 2 in binary
     to get the negative binary of any number you have to use 2's complement
     step 1: swap the bits of that number 1 with 0 and 0 with 1 and then add +1.
     step 2: get the resulted binary and add to the binary of the first number from which subtracting 5
     0010 = 2 positive number
        convert into negative
        0010
        1101
           1
       10000
        0+1+1 = 10(2 in binary) put 0 and carry 1
        1+1+0 = 10 put 0 and carry 1
        1+0+1 = 10 put 0 and carry 1
        1+0+1 = 10 put 0 and carry 1

        101
     */

    static void main() {
        // we could use the built-in java conversion methods
        int num = 5;
        System.out.println(Integer.toBinaryString(num));
        System.out.println();

        /*
         You can also use our custom-built DecimalToBinary methods.
         just need to create a new object of the DecimalToBinary class and then call the convertToBinary method
        */
        DecimalToBinary dtb = new DecimalToBinary();
        ArrayList<Integer> binaryNumber = dtb.convertToBinary(34);
        /*
         dtb.printBinaryToConsole(binaryNumber);
         here you can use the built-in binary to decimal converting methods
         using the BinaryToDecimal class
        */

        BinaryToDecimal btd = new BinaryToDecimal();
        btd.convertToDecimal(0b10);

    }
}

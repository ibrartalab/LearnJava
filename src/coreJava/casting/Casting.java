package coreJava.casting;

public class Casting {
    void main() {
        /*
        Casting or conversion are used to puts small buckets into larger one and larger one into small
        by implicit way or explicit.
        when the system did itself is called implicit and if a user did it by itself is explicit casting/conversion.
        widening/automatic casting - simply putting small buckets into a larger one.
         it happened by default also known as implicit casting
        */

        short smallNumber = 80; // short = 2byte's --> 16bit's
        int largerNumber = 1000; // int = 4byte's --> 32bit's

        int shortInt = smallNumber; // no error/warning
        double largerBucketThanInt = largerNumber; // still no error/warning
        // because a larger buckets can easily hold small values
        System.out.println(shortInt);
        System.out.println(largerBucketThanInt);

        /*
        Narrowing casting/conversion or explicit is done by the user to explicitly cast larger
        values into smaller buckets, knowing that it could lose the data it is also called loosey conversion.
        */
        byte sBucket = 127; // you can store b/t -127 to 128
        // short is 1byte(8bit's) so if you think of the memory structure there will be 8 blocks.
        int mBucket = 140;
        /*
         this will print the binary representation of the provided decimal number.
         so if the  value of first block starting from left is 1 the number will be negative
         if its 0 the number will be positive. this position called MSB(most significant bit)
         the first from right site is LSB(least significant bit)
        */
        System.out.println(Integer.toBinaryString(mBucket));
        System.out.println(Integer.toBinaryString(sBucket));
        byte mediumIntoSmall = (byte) mBucket; // warning -> required short , but provided int
        System.out.println(mediumIntoSmall); // console -116 instead of 140
    }
}
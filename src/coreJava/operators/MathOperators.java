package coreJava.operators;

public class MathOperators{
    static void main(String[] args) {
        // Math operators and Math class are super important in java.
        // Where you are building banking apps, fintech or any kind of other apps
        // you will probably need Math operators to work with calculation based logic.
        // Math class is also important because it has many built-in methods to use.

        // +,-,*,/,% and many more these are Math operators
        int mySalary = 1000;
        int monthlyBonus = 100;
        int salaryPlusBonus = mySalary + monthlyBonus; // addition(+)
        System.out.println("My salary with bonus is: " + salaryPlusBonus);

        int tax = 300;
        salaryPlusBonus -= tax; //  subtraction(-)
        System.out.println("My salary after tax is: " + salaryPlusBonus);

        int salaryPA = (mySalary + monthlyBonus) * 12; // multiplication(*)
        System.out.println("My Annual salary after tax is: " + (salaryPA - tax));

        int dailyEarnings = salaryPA / 365; // division(/)
        System.out.println("My daily earnings is: " + dailyEarnings);

        // Now we have left the most useful but some time confusing operator the modules%
        // Imagine you wrote an algorithm which is used to find whether a number is odd or even.
        // So knowing a number if it is odd, or even we need to divide the number by 2.
        // if the number is fully dividable or not, to do this we need to get the reminder
        // after the division if the reminder is 0(even) 1(odd).
        int x = 5;
        int y = 2;
        System.out.println(x%2); // 1
        // so for normal division operation we use / forward slash, but to get the reminder
        // we use the modules % sign.

        // Incremental operators
        // As the name describe incremental, means incrementing something or decrementing something by one
        // Post-increment -> Use the value first(prev) and then increment it
        int a = 10;
        System.out.println(a++); // 10
        System.out.println(a); // 11
        int q = 20;
        int w = 12;
        int e = q++ + w;
        System.out.println(e); // 32
        System.out.println(q); // 21

        // Pre-increment -> Update the value first and then use it.
        int b = 9;
        System.out.println(++b); // 10
        System.out.println(b); // 10
        int r = 32;
        int t = 4;
        int u = r + ++t;
        System.out.println(u); // 37

        // Post-decrement -> Use the value first(prev) and then decrement it
        int c = 8;
        System.out.println(c--); // 8
        System.out.println(c); // 7

        // Pre-decrement -> Decrement the value first and then use it.
        int s = 12;
        int d = 4;
        int f = --s + d;
        System.out.println(f); // 15

        // Using both at same time to understand the logic behind very well.
        int n = 33;
        int m = n++ + --n;
        System.out.println(m); // 66
        // There is one addition operation, but two different incremental operators hs used.
        // n(original)=33
        // m= n++(post-increment) n is still 33 here, but if you use n again at any place that will be 34.
        // m= n++(33) + --n(34-because we are using the updated one)
        // m= --n(pre-decrement) now n is 33 because 34-1=33
        // m= n++(33) + --n(33) -> m= 33+33 -> m=66


    }
}
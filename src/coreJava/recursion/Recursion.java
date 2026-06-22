package coreJava.recursion;

public class Recursion {
    static void main() {
        // when a function call itself recursively until completion.
        // Find n natural numbers n= n + n-1
        int n = 5;
        int naturalNumber = findNaturalNumber(n);
        System.out.println(naturalNumber); // 15 for n=5
        // 5 + 4 + 3 + 2 + 1 = 15

        // find factorial for n = n * n-1 (n! = n! * n! -1)
        int factorial = findFactorialNumber(n);
        System.out.println(factorial);
        // 5 * 4 * 3 * 2 * 1 = 120

        // Print numbers from 1 to 100
        printNumbers(n);
    }

    static int findNaturalNumber(int n){
        // Base case
        if(n == 1){
            return 1;
        }
        return n + findNaturalNumber(n - 1);
    }

    static int findFactorialNumber(int n){
        // Base case
        if(n == 1){
            return 1;
        }
        return n * findFactorialNumber(n - 1);
    }

    static void printNumbers(int n){
        // Base case
        int local = 1;
        while (local <= n){
            System.out.println(local);
            printNumbers(n -1);

        }
    }


}
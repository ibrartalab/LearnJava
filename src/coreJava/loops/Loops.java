package coreJava.loops;

public class Loops {
    void main() {
        // We have four types of loops in Java.
        // We used loops for every repetitive tasks or iteration/Trivarsing over Arrays.

        // While loop
        // Every loop has three parts initial value,condition and updating of the value.
        int initial = 1; // initialization of the loop
        while(initial <=10){ // condition
            System.out.println(initial); // The job done by the loop
            initial++; // updating
        }

        // Do while loop
        // The different b/t while and doWhile loop is doWhile loop will at least run one time in any situation.
        int initial1 = 1;
        do{
            System.out.println(initial1);
            initial1++;
        }while(initial1 <= 10);

        // for loop
        // Most of the time we are using this loop. Its very well-structured version of loops.
        for(int i=1; i <= 10; i++){
            System.out.println("Printing using forLoop: " + i);
        }

        // forEach loop - This loop mainly used with Arrays and collections.
        int[] array = new int[3]; // simple array with size of 3
        // Manually feed data into the array
        array[0] = 12;
        array[1] = 32;
        array[2] = 44;
        for(int i: array){
            System.out.println(i);
        }
        // In others loops (i) has been used to hold the index of the value,
        // but in forEach loop (i) hold the actual values of the array.
        // we can directly use i to get the element of the array using forEach loop.
        for(int i=0; i < array.length; i++){
            System.out.println(i); // 0,1,2
            System.out.println(array[i]); // will print the actual values.
        }

        // nested loops, loop inside another loop is nesting
        // you will often use nested loops in your program, but some it's not a recommended way to
        // use more than one nested loop.

        // a simple scenario -> the interviewer asked you to print numbers from 0 to 5 in one line
        // print it 10 times, so if you are the smart one you might be thinking of writing it once
        // and then copy-pasting  it 10 times. which might be worked, but always look for worst case
        // scenario where the interviewer asked you to do the same task 100 times.
        for(int i=0; i<10; i++){
            // this outer loop track how many times you want the iteration - 10
            for (int j = 0; j <=5; j++) {
                // this nested/inner loop will take care of the resulting numbers to be print
                // to the console
                System.out.print(j + " ");
                // make sure to use print not println, you if you don't now the difference b/w
                // go to the printing package of the coreJava and learnt
            }
            // this is important to use here for better view result
            System.out.println();

        }


    }
}
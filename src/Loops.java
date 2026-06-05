void main() {
    // We have four types of loops in Java.
    // We used loops for every repetitive tasks or iteration/Trivarsing over Arrays.

    // While loop
    // Every loop has three parts initial value,condition and updating of the value.
    int initial = 1; // initialization of the loop
    while(initial <=10){ // condition
        System.out.println(initial); // The job will be done by the loop
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
    // In others loops (i) has been used to hold the index of the value, but in forEach loop (i) hold the actual values of the array.
    // we can directly use i to get the element of the array using forEach loop.
    for(int i=0; i < array.length; i++){
        System.out.println(i); // 0,1,2
        System.out.println(array[i]); // will print the actual values.
    }
}
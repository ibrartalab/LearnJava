public class ArraysInJava{
    void main() {
        // Arrays are used to store multiple values of the same type in a single place.
        // can be use to store users, list of things and somthing else that are related to each other.
        // Arrays can be 1D(dimensional),2D or multiple as well.

        // Before jumping right into creating 1D or 2D arrays, lets understand how to work with arrays.
        // Arrays are store values by indexes, which is from 0(is the first element) to the lenght of it.
        // Also to keep in mind that arrary is a fixed sized. it means you have to define the size for the array during
        // initialization. later we will learn how to create dynamically size arrays.
        //Syntax
        int[] numbers = new int[5];
        // to explain the above line, int is a primitive used to store integer/decimal numbers.
        // And brackets[] is used to define an array.
        // numbers is we already know its a variable to store the refernce of the array.
        // new int[5] to instantiate an object we use new keyword in java, int[5] to tell the size of the array.

        // 1D Array
        int[] oneDimensionalArray = new int[4];
        // Now we learnt how to initialize arrays. its time to learn how to add values to it.
        // There are two ways of doint it, one the manual way of adding value ans second one using the power of loops.
        // Manual way
        oneDimensionalArray[0] = 10;
        oneDimensionalArray[1] = 20;
        oneDimensionalArray[2] = 30;
        oneDimensionalArray[3] = 40;
        // Access the position by index and then assign value to it. Its not required to assign values to each element
        // because if you dont, the intial value is 0.

        // Its always a good way to use foreach loop for printing the array elements.
        System.out.println("RESULT of the array element added manually");
        for(int index: oneDimensionalArray){
            System.out.print(index + " "); // adding an extra spaces b/t each element
        }
        System.out.println();
        // Adding values to the array using for loop.
        for (int i = 0; i < oneDimensionalArray.length; i++) {
            // Used a Math class to assign random values each time the loop run.
            oneDimensionalArray[i] =(int) (Math.random() * 10);
        }
        // Its always a good way to use foreach loop for printing the array elements.
        // Printing the values to see, is the Math.random works or not.
        System.out.println("RESULT of the array element added randomly(using loop)");
        for(int index: oneDimensionalArray){
            System.out.print(index + " ");
        }
        System.out.println();

        // 2D Array -> Matrix shape or Excel sheets rows and columns to store data.
        // use double brackets to use 2D arrays. first to track rows and the second for columns.
        int[][] twoDimensionalArray = new int[3][3];
        // To assign values to 2d arrays, we will need to use nested loops.
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            // This will keep track of the rows
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                // This will keep track of columns
                twoDimensionalArray[i][j] = (int) (Math.random() * 50);
            }
        }
        // printing out the result of the 2D arrays
        System.out.println("2D Arrays");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for(int j = 0; j < twoDimensionalArray.length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println();
        }


        // Jagged Array -> Arrays of Arrays with different columns size's.
        // Think of it, you are designing parental schema and you need to store the info
        // about their childrens, and its not a normal thing to have everyone the exactly
        // equal numbers of childs right. So in those kind of scenario we need to use jagged array.
        int[][] parentalInfo = new int[3][];
        // you know how many parents are there, but not sure each has x number of childrens int[3][].
        // [3] means how many parenalInfo will be stored. [] empty about the childs.
        parentalInfo[0] = new int[3];
        parentalInfo[1] = new int[4];
        parentalInfo[2] = new int[5];

        System.out.println("Jagged Array");
        // To assign values to Jagegd arrays, we will need to use nested loops.
        for (int i = 0; i < parentalInfo.length; i++) {
            // This will keep track of the rows
            for (int j = 0; j < parentalInfo[i].length; j++) {
                // This will keep track of columns
                parentalInfo[i][j] = (int) (Math.random() * 50);
            }
        }
        // Its always a good way to use foreach loop for printing the array elements.
        for(int i = 0; i < parentalInfo.length; i++) {
            for(int j = 0; j < parentalInfo[i].length; j++) {
                System.out.print(parentalInfo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
void main() {
    // Arrays are used to store multiples values of same type in a single place.
    // 1D array
    int[] oneDimensionalArray = new int[4];
    // Now we had already learned how to use loops for repetitive tasks, like adding values to the array.
    /*
     * The old way of adding values to the array without using loops.
     * oneDimensionalArray[0] = 1;
     * oneDimensionalArray[1] = 20;
     * oneDimensionalArray[2] = 13;
     * oneDimensionalArray[3] = 10;
     */
    for (int i = 0; i < oneDimensionalArray.length; i++) {
        oneDimensionalArray[i] =(int) (Math.random() * 10); // Used a Math class to assign random values each time the loop run.
    }
    // Printing the values to see, is the Math.random works or not.
    for(int i: oneDimensionalArray){
        System.out.println(i);
    }

    // 2D Array -> Matrix shape or Excel sheets rows and columns to store data.
    int[][] twoDimensionalArray = new int[3][3]; // use double brackets to use 2D arrays. first for rows and the second for columns.
    // To assign values to 2d arrays, we will need to nested loops.
    for (int i = 0; i < twoDimensionalArray.length; i++) {
        // This will keep track of the rows
        for (int j = 0; j < twoDimensionalArray.length; j++) {
            // This will keep track of columns
            twoDimensionalArray[i][j] = (int) (Math.random() * 50);
        }
    }

    for (int i = 0; i < twoDimensionalArray.length; i++) {
        for(int j = 0; j < twoDimensionalArray.length; j++) {
            System.out.println(twoDimensionalArray[i][j]);
        }
    }

    // Jagged arrays -> Arrays of Arrays with different columns size's.
    int[][] jaggedArray = new int[3][];
    jaggedArray[0] = new int[3];
    jaggedArray[1] = new int[4];
    jaggedArray[2] = new int[5];

    for (int i = 0; i < jaggedArray.length; i++) {
        // This will keep track of the rows
        for (int j = 0; j < jaggedArray[i].length; j++) {
            // This will keep track of columns
            jaggedArray[i][j] = (int) (Math.random() * 50);
        }
    }

    for(int i = 0; i < jaggedArray.length; i++) {
        for(int j = 0; j < jaggedArray[i].length; j++) {
            System.out.print(jaggedArray[i][j] + " ");
        }
        System.out.println();
    }

}
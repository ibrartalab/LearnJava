package DSAJava.docs;

public class IntroToDSA {
    // DSA is an abbreviation for Data Structure and Algorithm.
    // Data Structure means how the way we store and organize data.
    // Algorithm is the step-by-step process of solving a problem to get the expected outcomes.
    static void main(String[] args) {
        // You have two Arrays one contains names and second one kept the keys for it.
        // names and keysOfNames: Now we are using the Array Data Structure to store them.

        // Now we want print only those names which are starts-with searchedKey not all of them.
        // So for this problem/case we design an algorithm below.
        String[] names = {"Ibrar","Khan","Ayaz","Shabbir","Irfan","Afsar","Sahel","Baba"};
        String[] keysOfNames = {"I","K","A","S","B"};
        String searchedKey = "S";
        // Algorithm: A step-by-step instructions to get only the specified keys names from the Array.
        for (int i=0; i<names.length;i++){
            if(names[i].startsWith(searchedKey)){
                System.out.println(names[i]);
            }
        }
        // Time complexity is: BigO(NxM) N represents the numbers of elements in the names and M is the length of the searchedKey.
        // Space complexity is: BigO(1).
        /*
         * The for loop runs exactly N times. Now inside the loop the case statement it compares each element one by one.
         * it runs up to M times the length of searchedKey. So if you look it the total operations are
         * equal to N x M.
         * We could write it in using the BigO(NxM)
         * The Space is BigO(1) constant, because we are not creating a new array and not dynamic structures are grown.
         */

        // Now after learning Data structure and Algorithm we need to know how assess our algorithm
        // to design better algorithms and to write optimized solutions.

        // To know how good is our algorithms are we need to learn these three things to
        // easily evaluate of algorithms Accuracy, Time Complexity and Space Complexity.
        // Accuracy: Can we achive the expected outcomes from the algorithms you have written.
        // Time Complexity: The time it takes to complete the task.
        // Space Complexity: How much extra spaces you are utilizing to solve the probelm.

        // We used a term for this to denote Time and Space Complxity by BigO()
        // Examples BigO notations.
        /*
            Time Complexity
         * BigO(1) Constant Time:
         *      Execution time will be constant(same) regarless of the growing inputs.
         * BigO(log n) Logorithmic Time:
         *      Execution times grows slowly because the problem/input size is cut in half
         *      at every single step.
         * BigO(n) Linear Time:
         *      The execution time grows directly and proportionally with the size of the inout data.
         * BigO(n^2) Quadratic Time:
         *      Execution time grows quadratically, beacause of the use of nested loops iteratig over
         *      the same inout.
         * BigO(2^n) Exponential Time:
         *      The execution time doubles with each addional input element
         *      typically seen in naive recursive algorithms.

         -----Space Complexity-----
         *  BigO(1) Constant Sapce:
         *      Memory usage remain the same/fixed and does not change with size of the input.
         *  Big(log n) Logarithmic Space:
         *      Memory usage grows minimally, usually tracking the height of a balanced tree or recursion stack.
         *  BigO(n) Linear Space:
         *      Extra memory allocated grows proportionally to the input size, like creating a duplicate array.
         *  BigO(n^2) Quadratic Space:
         *      Extra memory grows quadratically, like initializing a two-dimensional grid of size (n * n).
         *  BigO(2^n) Exponential Space:
         *      Extra memory doubles with each new input, often matching the deep call stack of exponential recursion.
         */

        // Also time and space complexities calculated based on the steps it takes and the different
        // kinds of operations like getting,searching,traversing,updating,deleting,inserting and more.

    }
}

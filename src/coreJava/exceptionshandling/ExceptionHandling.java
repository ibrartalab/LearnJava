package coreJava.exceptionshandling;

import java.io.*;

public class ExceptionHandling {
    /*
        Exception is an unexpected behavior in the code which is occurred during the runtime of
        a program lead to crash the app.
        Exceptions could be happened at runtime or compile time, in some time by
        the users doing I/O operations.

        Some of the examples are would be for run and compile time exceptions below.
        Runtime Exceptions:
        Divided by zero, ArrayIndexOutOfBound, Arithmetic, IllegalArgument etc.

        Compile time Exception:
        I/O Exception(Accessing a file that does not exist), classNotFound, SQLException,
        ParseException etc.

    */

    /**
     * This method is specifically design to test the unchecked(Run time)
     * exception IllegalArgumentException. Its take an input of String name
     * and check if either it is an empty String then return an IllegalArgumentException
     * exception.
     * @param name - A name parameter of String to take it as an input.
     */
    private static void sayHello(String name){
        if(!name.isEmpty()){
            System.out.println("Hello "+name+"!");
        }else{
            throw new IllegalArgumentException("Name can not be empty.");
        }
    }

    static void main(String[] args) {
        // These are the examples of unchecked(Runtime exceptions).
        /*
         ArrayIndexOutOfBound exception:
             int[] numbers = new int[5];
             System.out.println(numbers[5]); // cause an error
             this line of code will not be executed, because we are not handling the
             ArrayIndexOutOfBound exception here.
             System.out.println("This even run"); // this will not run
        */
        int[] numbers = new int[3];
        // This part is actual exception handling with try-catch blocks.
        try{
            System.out.println(numbers[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("This even run"); // now this line will execute.

        /*
         Divide by zero exceptio:
            An exception occurred when we try to divide a number by zero, which negative
            infinity.
            int a = 5/0;
            System.out.println(a);
        */
        try{
            int a = 5/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        /*
         IllegalArgumentException:
            When we pass wrong parameters to a method.
            public void sayHello(String name){
                System.out.println("Hello "+name+"!");
            }
            ExceptionHandling.sayHello(""); // throw an error
         */
        try {
            ExceptionHandling.sayHello("");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // Checked(Compile time exceptions) examples.
        /*
         FileNotFoundException:
            This is a checked(compile time) exception. The compiler check the
            specified file path at compile time to verify if the file is really
            exist or not.
            File file = new File("D://Java//learnJava//coreJava//simple.txt");
            FileReader fileR = new FileReader(file);
         */
        try{
            File file = new File("D:\\Java\\LearningJava\\src\\coreJava\\simple.txt");
            FileReader fileR = new FileReader(file);
            System.out.println(fileR);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        /*
         There is a new keyword finally
         How to use it? Why it is important?
         The block of code inside finally will run always either there is an exception
         or not. We can think of it as the same is the else or default block of switch
         statement. finally block is useful for cleanup code like closing a file or
         a network connection.
        */
        try{
            File file = new File("D://simple.txt");
            FileReader fileR = new FileReader(file);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This block of code will run always");
        }
        /*
             finally we always run, but not in following conditions:
                Use of System.exit() method.
                When an exception occurred itself in the finally block.
                The death of a thread - means when a thread is to run this, but it not available.
        */

        // Now there are two more keywords used for exception handling.
        // throws and throw:
        // throw is used to explicitly source or rise a single exception.
        // throws is a declaration used in a method signature to warn the callers
        // of the method about potential exceptions.
        try {
            ExceptionHandling.eligibleForVote(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * This method is created for testing how to throw an explicit exception.
     * It takes one int age parameter and check if it is less than 18 throw exception
     * otherwise grant access to the voter to vote.
     * @param age - the real age of the voter.
     */
    public static void eligibleForVote(int age){
        if(age < 18){
            throw new IllegalArgumentException("Access denied: You are not allowed to vote.");
        }else{
            System.out.println("Access granted: You can vote.");
        }
    }

    /**
     * This method is created for testing how to throw multiple exception
     * using throws keyword in the readFile signature.
     * @param filePath - the actual url/file path
     * @throws FileNotFoundException - this is an exception when the file does not exist
     * or the path is incorrect.
     * @throws IOException - this is a parent exception class of the FileNotFoundException
     * if this method throw any other exception rather than FileNotFoundException then the
     * IOException will handle that.
     */
    public void readFile(String filePath) throws FileNotFoundException, IOException{
        File file = new File(filePath);
        FileReader fileR = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileR);
        reader.read();
        reader.close();
    }

}

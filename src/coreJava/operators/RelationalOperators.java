package coreJava.operators;

public class RelationalOperators {
    /*
     relational operators help to handle some conditional based problems
     suppose creating a voting system you can use loops to write the basic algorithm
     but to handle more efficient conditions we need relational
    */
    static void main(String[] args) {
        // >= greater than equal to
        int age = 20;
        if(age >= 18){
            System.out.println("Able to vote!");
        }
        // == equal to  and != not equal to
        int time = 2;
        if(time == 2) System.out.println("It is lunch time come later!");
        if(time != 2) System.out.println("Open to work! not lunch time");

        // <= less than equal to
        int kidALlowed = 12;
        if(kidALlowed <= 16){
            System.out.println("You are not allowed outside the home");
        }

        // < less than
        int finalMarks = 30;
        if(finalMarks < 30){
            System.out.println("You are failed!");
        }
        // > greater than
        if(finalMarks > 29){
            System.out.println("You are pass!");
        }
    }
}

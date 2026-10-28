package coreJava.basics.conditionalStatments;

public class ConditionalStatement {
    static void main() {
        /*
         To work with conditional statements we first need to understand some operators.
         Relational Operators like <(less than), >(greater than), ==(equal to),>=,<= and !(not equal to)
         Logical operators and ternary operators as well.
         We could use conditionals with these operands string,char,short,int,long
         Operands basically are the actual data on which you could perform operations (e.g) 2 > 3
         A good scenario where you are the hiring manager for CodeJava company(a dummy name used here) and you have been
         some certain rules for the job role. Like minimum of five years of experience and must have a cs(computer science) degree.
        */

        String jobRole = "Mid Software Engineer";
        int minExperience = 2;
        String degreeOfStudying = "Arts";
        // so in this scenario both conditions are must have.
        if(minExperience >= 5 && degreeOfStudying == "CS"){
            System.out.println("Congrats! You are eligible for this opportunity " + jobRole);
        }else{
            System.out.println("Oh! try next time.");
        }

        /*
         Creating a student grading system to utilize all relational, logical operators with conditional statement
         Criteria:
         Marks > 90 "A", >= 75 "B", >= 60 "C", < 60 fail
        */
        int marks = 90;
        if(marks >= 90){
            System.out.println("Congrats! You have secured a Grade A");
        }else if(marks >= 75){
            System.out.println("Congrats! You have secured a Grade B");
        }else if(marks >= 60){
            System.out.println("Congrats! You have secured a Grade C");
        }else{
            System.out.println("Sorry! You are failed.");
        }

        // Now is we discussed earlier that there is an optimize/ one line feature to replace writing if-else statements multiple times.
        int openTime = 10;
        int closingTime = 15;
        boolean isOpen = openTime < closingTime ? true : false; // ternary operators
        System.out.println(isOpen);
    }
}
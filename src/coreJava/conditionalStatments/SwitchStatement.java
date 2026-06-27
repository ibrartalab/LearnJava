package coreJava.conditionalStatments;

public class SwitchStatement {
    static void main(String[] args) {
        // Switch statement is the optimize solution to if-else statements, because if you know or have worked with if-else
        // it's basically check all the prior cases if your matching case is the last one, and you have written more than 20 if-else statements.
        // But there switch statement comes into picture hey you don't need to check all the prior cases if the one you are looking for is in the last.
        // now you have that power (switch has the power ) to directly find the matching result in jump over to it.

        // switch does not need any operators to work with only your condition variable.
        int dayNumber = 1;
        switch(dayNumber){ // condition matching goes right here
            // the case on which you want to do something if it is match.
            case 1:
                System.out.println("Monday!");
                // very important part
                break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("Wednesday!");
                break;
            case 4:
                System.out.println("Thursday!");
                break;
            case 5:
                System.out.println("Friday!");
                break;
            case 6:
                System.out.println("Saturday!");
                break;
            case 7:
                System.out.println("Sunday!");
                break;
            default:
                System.out.println("Invalid Entry.");
        }

        // As we discussed above a little bit about if-else and switch , lets know more about them.
        // Suppose you write a grading system using if-else in the failed condition has been written at the end.
        // before it there are 4 to 5 five more conditions checking. So if-else will check the first, then second and till to reach at the end.
        // So, to shift the code into and switch and the matching condition is at 2nd position/case it will jump into that , but suppose there are more conditions as well
        // after it those conditions will also be executed. to avoid it and actually make the switch for optimization we need to use the break statement inside the matching ones
        // or in every single case.

        // break is used to break the current flow of the program.
    }
}

package coreJava.basics.operators;

public class LogicalOperators {
    static void main(String[] args) {
        // we have three types of logical operators, and it's the most important.
        // logical operators always return boolean values either true or false

        // logical AND && -> if both conditions are true it will return true otherwise false
        String degree = "Arts";
        int yearsOfExperience = 5;
        if(degree == "CS" && yearsOfExperience >= 5){
            System.out.println("Hi, congrats you are eligible to apply for this role!");
        }else{
            System.out.println("Oh!, sorry you are not eligible for this role");
        }

        // Logical OR || -> either one of the condition true it will return true
        if(degree == "CS" || yearsOfExperience >= 5){
            System.out.println("Hi, congrats you are eligible to apply for this role!");        }
        else{
            System.out.println("Oh!, sorry you are not eligible for this role");
        }

        // Logical NOT ! -> its basically do the opposite job true become false and wise versa
        boolean isTodayOff = true;
        if(!isTodayOff){
            System.out.println("Today is off, you can go to the gym.");
        }
    }
}

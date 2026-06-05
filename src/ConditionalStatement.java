void main() {
    // To work with conditional statements we first need to understand some operators.
    // Relational Operators - Operands string,char,short,int,long
    // in relational operators we have <, >, <=, >=, ==, !=
    int a = 100;
    int b = 200;
    boolean c = a > b; // false
    boolean c1 = a < b; // true
    boolean c2 = a <= b; // true
    boolean c3 = a >= b; // false
    boolean c4 = a == 100; // true
    boolean c5 = a != b; // true
    System.out.println(c5);

    // Logical operators -> &&, ||, !
    // Logical AND && operator
    String jobPost = "Senior Software Engineer";
    //Requirements for this job role
    int minYearOfExp = 5;
    String degreeIn = "CS";
    int userExp = 4;
    String userDegree = "BBA";
    if(userExp >= minYearOfExp && userDegree.equals(degreeIn)){
        System.out.printf("You can apply for the job role %s",jobPost);
        System.out.println();
    }else{
        System.out.printf("You are not currently eligible for this job role %s",jobPost);
        System.out.println();
    }

    // Logial OR || operator
    String jobPost2 = "Internee Software Engineer";
    String degreeOfStudying = "CS";
    switch (degreeOfStudying){
        case "CS","SE","IT":
            System.out.printf("You can apply for this internship opportunity for the role of %s",jobPost2);
            System.out.println();
            break;
    }

    // Logical NOT ! operator
    boolean notEligible = false;
    System.out.println(!notEligible);
    // Converts true into false and false into true.

    // Creating a student grading system to utilize all relational, logical operators with conditional statement
    // Criteria:
    // Marks > 90 "A", >= 75 "B", >= 60 "C", < 60 fail
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

    // But there is an optimize way of doing this
    // Switch case
    int dayNumber = 1;
    switch(dayNumber){
        case 1:
            System.out.println("Monday!");
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

}
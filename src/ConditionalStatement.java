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
    if(degreeOfStudying.equals("CS") || degreeOfStudying.equals("SE") || degreeOfStudying.equals("IT")){
        System.out.printf("You can apply for this internship opportunity for the role of %s",jobPost2);
        System.out.println();
    }

    // Logical NOT ! operator
    boolean notEligible = false;
    System.out.println(!notEligible);
    // Converts true into false and false into true.

}
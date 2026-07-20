package maths.mathematicalFoundation.arithmetic;

public class LearnArithmetic {
    /*
     Arithmetic is the foundational and most important branch of Mathematics with worked with numbers
     and the operation we can perform on them.
     It answers the following question:
     How many?
     How much?
     How far?
     How long?
     How fast?

     Before answering to the above questions, we need to know why arithmetic exist?
     Let go back into past and look what kind of problems people were facing.
     Suppose you have dogs, but know how many. And then someone came to you and ask this
     one question how many dogs do you have?
     And answering this question was not simple.
     People in that time counting quantities by using fingers, stones, sticks, marks on wood, and knots on rop.
     Which wasn't a simple task.

     Now arithmetic solve these kind of problems with natual numbers.
     Number is an abstract idea for counting quantities not an actual object.
     If I say I have 3 apples (not the apple mobiles) 3 is not the apples itself , but it is just
     counting the quantities of apples.
     Eventually these maths symbols were invented:
     One -> 1
     Two -> 2
     Three -> 3

    Arithmetic also describe counting quantities , position, and measurement.

    Types of Numbers(Preview):
    We will learn more about this inside the number system.
    Natural Numbers
    Whole Numbers
    Integers
    Rational Numbers
    Irrational Numbers
    Real Numbers
    Complex Numbers

    Answers to these questions:
    How many? I have 12 cups.
    How much? I need 200 dollars.
    How far?  The bank is far 200km from here.
    How long? This land is 2yields long.
    How fast? This car is 300km/h faster than yours.

    Fundamental Operations:
    Addition used + symbol adding quantites
    Multiplecation used x or * symbol to reapetedly adding of quantities
    Subtraction used - symbol remove part of quantity
    Diviion used / symbol to split equaly.

     */
    static void main(String[] args) {
        // The four fundamental operations
        // Addition
        int myBasket = 0;
        int apples = 12;
        int buyOneMore = 1;
        myBasket = apples + buyOneMore;
        System.out.println(myBasket);

        // Subtraction
        int sellOneApple = 1;
        myBasket = myBasket - sellOneApple;
        System.out.println(myBasket);

        // Multiplication
        // one basket have two apples and we have 4 baskets
        int twoApples = 2;
        int totalBaskets = 4;
        myBasket = myBasket + (2*4);
        System.out.println(myBasket);

        // Division
        // we are donating our apples to these number of people
        int people = 5;
        int applesPerPerson = myBasket / people;
        System.out.println(applesPerPerson);

    }
}

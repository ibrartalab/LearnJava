package coreJava.oops.basics.thiskeyword;

public class This {
    private int count;
    private int randomNumber;

    public This(int count,int randomNumber){
        /*
        These will return zeros.
        count = count;
        randomNumber = randomNumber;
        */

        this.count = count;
        this.randomNumber = randomNumber;

    }

    /*
        We can see that we just create a new object of This class and pass 10 as the argument value
        for count inside the constructor, but when we were trying to get the value its reutn zero.

        If you really want to learn why it happend then read these docs.
        Now go back and open This.java file and look it the construtor you had created so far.

        public This(int count,int randomNumber){
            count = count;
            randomNumber = randomNumber;
        }

        So, This(int count) and count inside the constructor are the same count which is reassgining to itself.
        We know that the parameters passed inside in a method signature is the copy of the original one.
        suppose you pass this:
        This(20,4){
            20 = 20;
            4 = 4;
        }
        which is for now correct, you add somthing reassigneing itself is a different case , but for now
        we have 20 and 4.

        Now look it to the getCoutn() and getRandomNumbber() methods what they are returnig.
        Those values which are setled inside the constructor, obviously not, it's returning the
        memebers of This class. But during the object creation time we do not set them,
        but instead just pass some values that are adding themselves.

        Now you might understand this situation, but you will ask again if this happend then
        how it returns zeros.
        While it very simpple and stright forward if you do not add a constructor explixitly.
        Then it is always created a default constructor by the compiler.And its assign default
        values to each class memeber.

        the default constructor will look like this:
        public This(){
            count = 0;
            randomNumber = 0;
        }

        To handle this situation and avoid ambiguty java introduce this keyword which is
        very useful to refer the current context.
    */

    public int getCount(){
        return count;
    }
    public int getRandomNumber(){
        return randomNumber;
    }

    public This getCurrentContext(){
        return this;
    }
}

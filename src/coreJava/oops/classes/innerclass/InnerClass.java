package coreJava.oops.classes.innerclass;

public class InnerClass {
    static void main(String[] args) {
        /**
         To use the inner class functionality, we firstly need to create
         an object of the outer enclosing class and then access the inner class.
         There are two ways to create an object of the inner class.
         This is the first and efficient way of creating an object of
         the inner class (Software's). Because the outer class (Mobile)
         is a short-lived object which means we don't care about to hold the
         reference of the Mobile , but we care about the Software's mostly.
         So, in that case the Mobile object will sooner be available to the Garbage collector.
         Its also called anonymous outer object instantiation.
        */
        Mobile.Software software = new Mobile("SAMSUNG"). new Software();
        // The second way of creating the instance of inner class is.
        Mobile mobile = new Mobile("APPLE");
        Mobile.Software software1 = mobile.new Software();

        software.MusicPlayer();
        mobile.bootMessage();

    }
}

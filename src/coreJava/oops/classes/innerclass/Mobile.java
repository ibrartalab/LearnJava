package coreJava.oops.classes.innerclass;

/**
 * Inner classes and nested static classes are also useful
 * to achieve encapsulation as well.
 * If you remember we had already talked about encapsulation is a way
 * to bundle all the same type of logic inside a single file, which is
 * quite possible with inner classes and nested static classes.
 */
public class Mobile {
    private static final int IMEI = 29588372;
    private final String mobileName;

    public Mobile(String mobileName){
        this.mobileName = mobileName;
    }

    public void bootMessage(){
        System.out.println(this.mobileName+" Hello!");
    }

    /**
     * you can access the inner class right here inside the outer class(Mobile)
     * by creating an object of it.
     */
    public void startMusic(){
        Software software = new Software();
        software.MusicPlayer();
    }

    /**
     * It's called inner class.
     * we can treat like a normal classes, where we can define
     * public, private methods, properties and statics.
     */
    class Software {
        public void MusicPlayer(){
            System.out.println("Music are playing in "+mobileName);
        }
        public int getIMEI(){
            return IMEI;
        }
    }
}

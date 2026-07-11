package coreJava.oops.classes;

public class AnonymousClass {
    static void main() {
        /*
          This is the way of creating anonymous subClass of the outer class.
          Anonymous class is the same is inner or static subclass in terms of creating,
          But it can only be used once.
          In some scenario where you want to create a subclass, the use of it will be once,
          then in that case instead of creating inner or nested static subclasses you can
          use anonymous class.
         */
        OuterClass aClass = new OuterClass(){
            /*
              we can define methods and properties as much is we want like
              a normal regular classes. It is the same as others classes, but it does
              not have a name.
             */
            public void show(){
              System.out.println("This will show something!");
            }

            // We could also override method of the outer class.
             @Override
            public void play(){
                 System.out.println("Anonymous is playing something!");
             }

        };

        OuterInterface aInterface = new OuterInterface() {
            @Override
            public void sing() {
                System.out.println("Anonymous interface is singing.");
            }
        };

        aInterface.sing();
        aClass.play();

    }
}

class OuterClass{
    public void play(){
        System.out.println("This will play something!");
    }
}

interface OuterInterface{
    void sing();
}
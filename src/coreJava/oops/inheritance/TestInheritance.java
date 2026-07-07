package coreJava.oops.inheritance;

public class TestInheritance {
    static void main(String[] args) {
        Car toyota = new Car("TOYOTA","2025",true,4,"black",112025);
        toyota.canStart();
        toyota.canMove();
        System.out.println(toyota.model);
    }

    // In Java, we have multi-level or hierarchical inheritance supported not multiple.
    // we could have one parent which has multi children but not two parents at the same time
    /*
        A
        |
        B and C
        |
        D
        |
        E
       this is allowed A extends by B and C, then B extends by D and D extends by E.
        A B
       /   \
         C
       this is not allowed to extend, A and B by C at the same time. it is called multiple
       inheritance.
     */
}

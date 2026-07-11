package coreJava.oops.basics.superkeyword;

public class SubClass extends BaseClass {
    /*
     super keyword helps us to call the methods,properties and constructor of
     the super/parent class inside the sub/child class
    */

    private int age;
//    private  String name;

    public SubClass(int age,String name){
        this.age = age;
        super(name);
    }

    public int getBaseClassAge(){
        return  super.age;
    }

    static void main(String[] args) {
        SubClass sb = new SubClass(23,"subclass");
        System.out.println(sb.getBaseClassAge());
    }
}

package coreJava.oops.accessmodifiers.package1;

public class Home1 {
    // Access modifiers used to give and revoke access to some parts of the code
    // to use outside the current package.

    // We have these access modifiers public, private, protected, and default.

    // We can access this method in this class, another class inside the same package, others classes in another packges.
    // Simply mean from everywhere in this project.
    public void homeOnePublic(Object o){
        System.out.println("This is a public call in home 1 from: "+ o.getClass().getName());
    }

    // Private can only be access inside the same class. Not in a subclass, in same package or
    // outside the package.
    private void homeOnePrivate(){
        System.out.println("This is a private call in home 1 from: "+this.getClass().getName());
    }

    // Protected can be access in the same class, same package another class and
    // same package subclass. another package subclass as well.
    protected void homeOneProtected(Object o){
        System.out.println("This is a protected call in home 1 from: "+o.getClass().getName());
    }

    // The last one is default also known as package private,like protected but can not
    // access from another package subclass which is possible with protected.
    // for default, we do not need to specify any access modifiers that is treated as
    // default access modifier.
    void homeOneDefault(Object o){
        System.out.println("This is default call in home 1 from: "+o.getClass().getName());
    }

    static void main() {
        Home1 inHome1 = new Home1();
        inHome1.homeOnePublic(inHome1);
        inHome1.homeOnePrivate();
        inHome1.homeOneProtected(inHome1);
        inHome1.homeOneDefault(inHome1);
    }
}

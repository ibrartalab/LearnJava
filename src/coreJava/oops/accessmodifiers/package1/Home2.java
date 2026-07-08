package coreJava.oops.accessmodifiers.package1;

public class Home2 {
    static void main(String[] args) {
        Home2 home2 = new Home2();
        Home1 home1 = new Home1();
        home1.homeOnePublic(home2);
        home1.homeOneProtected(home2);
        home1.homeOneDefault(home2);

        // h1.homeOnePrivate();

        // To know uncomment line 7 and hover over on it, you will see a message saying
        // that this is private access method you can not access it here.
    }
}

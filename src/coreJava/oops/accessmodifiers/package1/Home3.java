package coreJava.oops.accessmodifiers.package1;

public class Home3 extends Home1{
    static void main(String[] args) {
        Home3 home3 = new Home3();
        Home1 home1 = new Home1();

        home1.homeOnePublic(home3);
        home1.homeOneProtected(home3);
        home1.homeOneDefault(home3);

        home3.homeOnePublic(home3);
        home3.homeOneDefault(home3);
        home3.homeOneProtected(home3);

    }
}

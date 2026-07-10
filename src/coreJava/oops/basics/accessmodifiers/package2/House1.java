package coreJava.oops.basics.accessmodifiers.package2;
import coreJava.oops.basics.accessmodifiers.package1.Home1;

public class House1 {
    static void main(String[] args) {
        House1 house1 = new House1();
        Home1 home1 = new Home1();

        home1.homeOnePublic(house1);
        // home1.homeOneProtected(house1);
        // home1.homeOnePrivate();
        // home1.homeOneDefault(house1);

        // To know uncomment line home1.homeOnePrivate(); and hover over on it, you will see a message saying
        // that this is private access method you can not access it here.
        // Same for home1.homeOneProtected();
        // Same for home1.homeOneDefault(house1);
    }
}

package coreJava.oops.basics.accessmodifiers.package2;

import coreJava.oops.basics.accessmodifiers.package1.Home1;

public class House2 extends Home1 {
    static void main(String[] args) {
        House2 house2 = new House2();
        Home1 home1 = new Home1();

        home1.homeOnePublic(house2);
        house2.homeOnePublic(house2);
        house2.homeOneProtected(house2);
    }
}

package coreJava.oops.basics.thiskeyword;

public class TestThis {
    static void main() {
        This t = new This(10,4);
        int count = t.getCount();
        int randomNumber =  t.getRandomNumber();
        System.out.println(count);
        System.out.println(randomNumber);
        This ct = t.getCurrentContext();
        System.out.println(ct.getCount());
    }
}

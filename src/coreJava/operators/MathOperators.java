void main() {
    int mySalary = 1000;
    int bonus = 500;
    int totalSal = mySalary + bonus; // addition
    int tax = 300;
    int totalSalAfterTax = totalSal - tax; // subtraction
    int perDayEarn = totalSalAfterTax / 30; // division
//    System.out.println(perDayEarn);
    int perYear = totalSalAfterTax * 12; // multiplication
//    System.out.println(perYear);

    int a = 20;
    int b = 10;
    int x = (a * b) / (a + b);
//    System.out.println(x);

    int mix = 10 * 30 / 4;
    int m = 30 / 4 * 10;
//    System.out.println(mix);
//    System.out.println(m);

    int modolus =  5 % 2;
//    System.out.println(modolus);

    //PreFix and Suffix
    //PreIncrement and PostIncrement
    int q = 10;
    int w = 2;
    int v = ++q + w;
    System.out.println(v); // 13
    System.out.println(q); // 11

    int xx = 5;
    int yy = xx++ + ++xx;
    System.out.println(yy);
    System.out.println(xx);

    //PreDecrement and PostDecrement
    int aa = 10;
    int bb = --aa + aa--;
    System.out.println(bb);

}
void main() {
    // Operands - byte, short, int, long: can only apply bitwise operators on integrals.

    // AND &
    int a = 5 & 4; // & means multiplying bits: 5(101) and 4(100) = 100
    System.out.println(Integer.toBinaryString(5));
    System.out.println(Integer.toBinaryString(4));
    System.out.println(a);
    // If both are 1 then it will 1 otherwise 0

    // OR |
    int b = 4 | 3; // If any side is 1 then it will be 1
    System.out.println(Integer.toBinaryString(4));
    System.out.println(Integer.toBinaryString(3));
    System.out.println(b);

    // XOR ^
    int c = 6 ^ 5; // If both side different then it will be 1
    System.out.println(Integer.toBinaryString(6));
    System.out.println(c);

    // NOT ~
    int d = 6;
    int e = ~d; // It will replace 0 with 1 and 1 with 0.
    System.out.println(e);
    System.out.println(Integer.toBinaryString(e));

    // leftShift <<
    int x = 5;
    System.out.println(Integer.toBinaryString(x));
    int y = x << 2;
    System.out.println(y);
    System.out.println(Integer.toBinaryString(y));

    // rightShift >>
    int j = -5;
    System.out.println(Integer.toBinaryString(j));
    int k = j >> 2;
    // If the number is Positive the right shift will fill the empty spaces with O, if its negative it will fill with 1.
    System.out.println(k);
    System.out.println(Integer.toBinaryString(k));

    //Unsigned rightShift >>>
    int l = -5;
    System.out.println(Integer.toBinaryString(l));
    int n = l >>> 2; // But unsigned right shift always fill empty spaces with 0.
    System.out.println(n);
    System.out.println(Integer.toBinaryString(n));


}
void main() {

    //Narrowing casting/conversion
    short a = 12;
    int b = 20;
    short c = (short) b;
    System.out.println(c);

    float x = 20.12f;
    double y = 23.00;
    float z =(float) y + x;
    double f = x + y;
    System.out.println(z);
    System.out.println(f);

    //widening/automatic casting - simply putting small buckets into a larger one
    int e = 23;
    double r = 12.0;
    double d = e + r;
    double t = e;
}
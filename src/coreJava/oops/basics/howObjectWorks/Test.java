package coreJava.oops.basics.howObjectWorks;

public class Test {
    static void main() {
        Car car = new Car(); // create new memory in heap and address reference stored in car.
        car.name = "World"; // update name with value "World"
        Car nCar = intoUpperCase(car);
        // intoUpperCase accept and return a reference of car. now the same car reference had saved in nCar.
        // So,now we can say that car and nCar are pointing to the same memory location, and if we change either one the other will
        // automatically change/modify.
        System.out.println(nCar.name); // WORLD
        System.out.println(car.name); // WORLD

        // But it's not the same with String and Primitives
        // Examples:
        int x = 10;
        int incremented = incrementByOne(x);
        System.out.println(incremented); // 11
        System.out.println(x); // 10

        String name = "good!";
        String replaced = replaceOneWord(name);
        System.out.println(name); // good!
        System.out.println(replaced); // food!
    }

    private static String replaceOneWord(String name) {
        // Replace one word to make another word
        return name.replace("g","f");
    }

    public static Car intoUpperCase(Car car){
        car.name = car.name.toUpperCase();
        return car;
    }

    public static int incrementByOne(int n){
        return ++n;
    }
}

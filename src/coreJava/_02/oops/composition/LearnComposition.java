package coreJava.oops.composition;

public class LearnComposition {
    static void main(String[] args) {
        Car myCar = new Car("Honda Civic",2026,"DieselEngine");
        System.out.println(myCar.engine.type);
        myCar.start();
    }
}

class Car{
    String model;
    int year;
    Engine engine;

    public Car(String model,int year,String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); // Hardcoded composition
    }

    public void start(){
        this.engine.start();
        System.out.println(this.model + " is running...");
    }
}

class Engine{
    String type;

    public Engine(String type){
        this.type = type;
    }

    public void start(){
        System.out.println(type + " is starting...");
    }

}

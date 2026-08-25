package coreJava.solid.example.fare;

public class EconomyFare implements FareStrategy{
    @Override
    public double calculateFare(double distance){
        return distance * 1.5; // base economy rate
    }

}

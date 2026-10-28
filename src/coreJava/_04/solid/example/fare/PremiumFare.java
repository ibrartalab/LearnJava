package coreJava.solid.example.fare;

public class PremiumFare implements FareStrategy{

    @Override
    public double calculateFare(double distance) {
        return (distance * 3.0) + 5.0; // Premium rate + booking fee
    }
}

package coreJava.solid.example.fare;

// This is the use of OCP(Open/Close Principle) and also LSP(Liskov Substitution Principle)
public interface FareStrategy {
    double calculateFare(double distance);
}
// Strategy interface for calculating fares. Open for extension (adding new vehicle types),
// closed for modification (no massive if-else structures).

// LSP compliance rule: If we add a DiscountedFare strategy later, it must strictly compute
// and return a valid double without crashing or throwing unsupported operation exceptions.
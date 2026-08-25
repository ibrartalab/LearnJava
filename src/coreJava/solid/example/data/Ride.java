package coreJava.solid.example.data;

// This is the use of SRP(Single Responsibility Principle) and Reusable Entity
public class Ride {
    // It will act only as a entity/schema for the app.
    // It does not calculate prices or talking to the databased and sending notifications.
    private final String passengerId;
    private final double distanceKm;
    private final String vehicleType;

    public Ride(String passengerId, double distanceKm, String vehicleType) {
        this.passengerId = passengerId;
        this.distanceKm = distanceKm;
        this.vehicleType = vehicleType;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}

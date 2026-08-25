package coreJava.solid.example.dataengine;

import coreJava.solid.example.data.Ride;

// ISP (Interface Segregation Principle)
public interface AnalyticsEngine {
    void logTripData(Ride ride);
}

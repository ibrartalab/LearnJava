package coreJava.solid.example.dataengine;

import coreJava.solid.example.data.Ride;

// ISP (Interface Segregation Principle)
public interface RideRepository {
    void saveRide(Ride ride);
}

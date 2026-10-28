package coreJava.solid.example.dataengine;

import coreJava.solid.example.data.Ride;

// // Implementation respects ISP by only interacting with the persistence layer
public class DatabaseRepository implements RideRepository{
    @Override
    public void saveRide(Ride ride) {
        System.out.println("[Database] Ride saved for passenger: " + ride.getPassengerId());
    }
}

package coreJava.solid.example;

import coreJava.solid.example.data.Ride;
import coreJava.solid.example.dataengine.RideRepository;
import coreJava.solid.example.fare.FareStrategy;
import coreJava.solid.example.notification.NotificationService;

import java.util.List;

// The master class (orchestrating all solid principles)
public class RideSharingApp {
    // DIP: Handled completely via decoupled interfaces injected at runtime
    private final RideRepository repository;
    private final NotificationService notification;
    private final List<FareStrategy> fareStrategies;

    public RideSharingApp(
            RideRepository repository,
            NotificationService notification,
            List<FareStrategy> fareStrategies)
    {
        this.repository = repository;
        this.notification = notification;
        this.fareStrategies = fareStrategies;

    }

    public void completeBooking(Ride ride, FareStrategy chosenStrategy) {
        // 1. SRP: Delegating pricing calculation out
        double absoluteFare = chosenStrategy.calculateFare(ride.getDistanceKm());
        System.out.println("[System] Calculated dynamic fare: $" + absoluteFare);

        // 2. ISP/SRP: Database saving is handled by its own layer
        repository.saveRide(ride);

        // 3. DIP: Notification abstract call
        notification.sendAlert(ride.getPassengerId(), "Your ride is confirmed! Total: $" + absoluteFare);
    }
}

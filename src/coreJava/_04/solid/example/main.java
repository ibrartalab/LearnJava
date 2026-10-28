package coreJava.solid.example;

import coreJava.solid.example.data.Ride;
import coreJava.solid.example.dataengine.DatabaseRepository;
import coreJava.solid.example.dataengine.RideRepository;
import coreJava.solid.example.fare.FareStrategy;
import coreJava.solid.example.fare.PremiumFare;
import coreJava.solid.example.notification.NotificationService;
import coreJava.solid.example.notification.SMSNotification;

import java.util.List;

public class main {
    static void main(String[] args) {
        // Assemble our decoupling layers manually (In real life, Spring Boot auto-wires this)
        RideRepository mysqlRepo = new DatabaseRepository();
        NotificationService smsService = new SMSNotification();
        FareStrategy premiumPricing = new PremiumFare();

        // Initialize our SOLID booking platform
        RideSharingApp platform = new RideSharingApp(mysqlRepo, smsService, List.of(premiumPricing));

        // Create a mock ride request
        Ride customerRide = new Ride("User_9821", 14.5, "Premium");

        // Execute transaction loop safely
        platform.completeBooking(customerRide, premiumPricing);
    }
}

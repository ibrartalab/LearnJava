package coreJava.solid.example.notification;

// DIP (Dependency Inversion Principle)
public interface NotificationService {
    void sendAlert(String userId, String text);
}
// The high-level coordinator depends entirely on abstractions (interfaces),
// not concrete database or notification subclasses.
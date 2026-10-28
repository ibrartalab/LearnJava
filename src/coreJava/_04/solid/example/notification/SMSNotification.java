package coreJava.solid.example.notification;

// low-level concrete details/class
public class SMSNotification implements NotificationService{
    @Override
    public void sendAlert(String userId, String text) {
        System.out.println("[SMS] Sent to " + userId + ": " + text);
    }
}

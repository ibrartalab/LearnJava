package coreJava.solid.dip.dipviolation;

public class NotificationManager {
    // Violation of the DIP - Direct dependency on low-level class/details
    private final EmailService emailService = new EmailService();

    public void notifyUser(String message){
        emailService.sendEmail(message);
    }
}

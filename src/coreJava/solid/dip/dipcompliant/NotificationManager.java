package coreJava.solid.dip.dipcompliant;

public class NotificationManager {
    private final MessageService messageService;

    // Dependency Injection (Inversion of Control)
    public NotificationManager(MessageService messageService){
        this.messageService = messageService;
    }

    public void notifyUser(String message){
        messageService.sendMessage(message);
    }
}

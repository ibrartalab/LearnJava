package coreJava.solid.dip.dipcompliant;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println("Email sent: " + message);
    }
}

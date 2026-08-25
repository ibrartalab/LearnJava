package coreJava.solid.dip.dipviolation;


// This is the low-level class
public class EmailService {
    public void sendEmail(String message){
        System.out.println("Email sent: " + message);
    }
}

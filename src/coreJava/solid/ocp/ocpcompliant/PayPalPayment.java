package coreJava.solid.ocp.ocpcompliant;

public class PayPalPayment implements PaymentMethod{
    public void process(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

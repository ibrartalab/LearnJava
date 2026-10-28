package coreJava.solid.ocp.ocpcompliant;


public class CreditCardPayment implements PaymentMethod{
    public void process(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

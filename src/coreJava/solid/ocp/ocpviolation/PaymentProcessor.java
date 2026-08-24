package coreJava.solid.ocp.ocpviolation;

// Every time a new payment gateway comes for integration,
// we will be minifying this one file again and again, which
// will violate the OCP.
public class PaymentProcessor {
    public void processPayment(String type, double amount) {
        if (type.equalsIgnoreCase("CreditCard")) {
            System.out.println("Processing Credit Card payment of $" + amount);
        } else if (type.equalsIgnoreCase("PayPal")) {
            System.out.println("Processing PayPal payment of $" + amount);
        } // Future changes require modifying this method directly
    }
}

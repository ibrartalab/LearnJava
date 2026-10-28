package coreJava.solid.ocp.ocpcompliant;

// Now this core class is closed for modifications.
public class PaymentManager {
    public void executePayment(PaymentMethod method, double amount) {
        method.process(amount); // Works seamlessly with any new method added later
    }
}

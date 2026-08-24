package coreJava.solid.srp.srpcompliant;

// Now this class is only focus on the core functionalities of the Invoice.
public class Invoice {
    private final double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotalWithTax() {
        return amount * 1.18;
    }
    public double getAmount() { return amount; }
}

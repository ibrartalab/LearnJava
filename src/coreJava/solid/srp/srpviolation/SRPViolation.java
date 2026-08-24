package coreJava.solid.srp.srpviolation;

public class SRPViolation {
    // This is an example of violating SRP(Single Responsibility Principle).
    class Invoice {
        // These properties and methods is fine to be inside this Invoice class.
        private final double amount;

        public Invoice(double amount) {
            this.amount = amount;
        }

        public double calculateTotalWithTax() {
            return amount * 1.18; // 18% tax
        }

        // Violation: Database responsibility
        public void saveToDatabase() {
            System.out.println("Saving invoice to MySQL database...");
        }

        // Violation: Presentation responsibility
        public void printInvoice() {
            System.out.println("Printing invoice PDF for amount: " + amount);
        }
    }
}



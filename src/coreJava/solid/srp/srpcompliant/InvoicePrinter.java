package coreJava.solid.srp.srpcompliant;

// Focus only on formatting and printing the invoices
public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println("Printing invoice for amount: " + invoice.getAmount());
    }
}

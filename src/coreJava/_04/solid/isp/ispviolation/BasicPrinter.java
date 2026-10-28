package coreJava.solid.isp.ispviolation;

public class BasicPrinter implements SmartDevice{
    public void print() {
        System.out.println("Printing...");
    }

    // Violation: Forced to implement methods it doesn't support
    public void scan() {
        throw new UnsupportedOperationException();
    }
    public void fax() {
        throw new UnsupportedOperationException();
    }
}

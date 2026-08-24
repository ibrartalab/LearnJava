package coreJava.solid.isp.ispcompliant;

public class BasicPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Printing documents....");
    }
}

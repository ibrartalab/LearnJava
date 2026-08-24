package coreJava.solid.isp.ispcompliant;

public class MultiFunctionPrinter implements Printer,Scanner,FaxMachine{
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing...");
    }

    @Override
    public void scan(){
        System.out.println("Scanning...");
    }
}

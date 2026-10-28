package coreJava.solid.ocp.ocpcompliant;

// Now with the help of this interface we are open for extension.
// This is the use case of OCP principle.
// In the future, we are able to add multiple payments gateways as many as we want by implementing OCP.
public interface PaymentMethod {
    void process(double amount);
}

package coreJava.solid.lsp.lspviolation;

public class FixedDepositAccount extends BankAccount{
    @Override
    public void withdraw(double amount) {
        // Violation: Breaks behavioral expectations of the base class
        throw new UnsupportedOperationException("Withdrawals not allowed on Fixed Deposits!");
    }
}

package coreJava.solid.lsp.lspcompliant;

public class SavingsAccount extends WithdrawableAccount{
    // Inherits withdraw seamlessly

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }
}

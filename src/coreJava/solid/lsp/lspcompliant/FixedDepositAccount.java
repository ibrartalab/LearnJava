package coreJava.solid.lsp.lspcompliant;

import coreJava.solid.lsp.lspcompliant.BankAccount;

public class FixedDepositAccount extends BankAccount {
    // Only inherits what it can actually do (getBalance). No unexpected exceptions.

    @Override
    public double getBalance() {
        return super.getBalance();
    }
}

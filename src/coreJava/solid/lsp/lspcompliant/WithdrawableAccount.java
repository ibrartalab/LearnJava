package coreJava.solid.lsp.lspcompliant;

import coreJava.solid.lsp.lspviolation.BankAccount;

// Introduce an intermediate abstraction for withdrawable features
public class WithdrawableAccount extends BankAccount {
    public void withdraw(double amount) {
        balance -= amount;
    }
}

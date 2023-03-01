package com.example.realworldjava.bank_transaction_analyzer;

@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}

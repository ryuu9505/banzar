package com.example.realworldjava.bank_transaction_analyzer;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class BankTransactionAnalyzerTest {

    private final BankTransactionAnalyzer bankTransactionAnalyzer = new BankTransactionAnalyzer();
    private final BankStatementParser bankStatementParser = new BankStatementCSVParser();

    @Test
    public void analyze() throws IOException {

        bankTransactionAnalyzer.analyze("sample.csv", bankStatementParser);
    }
}
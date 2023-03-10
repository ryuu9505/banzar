package com.example.realworldjava.bank_transaction_analyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankTransactionAnalyzer {

    private static final String RESOURCES = "src/main/resources/";

    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {

        // read input
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);

        // parsing
        final List<BankTransaction> bankTransactions
                = bankStatementParser.parseLinesFrom(lines);
        final BankStatementProcessor bankStatementProcessor
                = new BankStatementProcessor(bankTransactions);

        // report
        collectSummary(bankStatementProcessor);
    }

    private static void collectSummary(BankStatementProcessor bankStatementProcessor) {
        System.out.println("The total for all transactions is "
                + bankStatementProcessor.calculateTotalAmount());
        System.out.println("Transactions in January "
                + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("The total salary received is "
                + bankStatementProcessor.calculateTotalForCategory("Salary"));

    }
}

package com.example.realworldjava.bank_transaction_analyzer;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class BankTransactionTest {

    @Test
    public void equal() {

        final BankTransaction transaction1 = new BankTransaction(LocalDate.of(2000, Month.JANUARY, 1), -50, "Tesco");
        final BankTransaction transaction2 = new BankTransaction(LocalDate.of(2000, Month.JANUARY, 1), -50, "Tesco");
        final BankTransaction transaction3 = new BankTransaction(LocalDate.of(2000, Month.JANUARY, 1), -50, "Costco");

        assertTrue(transaction1.equals(transaction2));
        assertFalse(transaction3.equals(transaction2));
    }
}
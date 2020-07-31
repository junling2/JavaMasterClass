package com.yamcha;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();
    private double initialTransaction;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.initialTransaction = initialTransaction;
        transactions.add(initialTransaction);
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getInitialTransaction() {
        return initialTransaction;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

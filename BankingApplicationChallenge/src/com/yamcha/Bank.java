package com.yamcha;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean addBranch(Branch newBranch) {
        if (findBranch(newBranch.getName())){
            return false;
        }
        branches.add(newBranch);
        return true;
    }

    public boolean findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addCustomer(String customerName, String branchName, double initialTransaction) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                branches.get(i).addCustomer(customerName, initialTransaction);
                return true;
            }
        }
        return false;
    }

    public boolean addTransaction(String customerName, String branchName, double amount) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                branches.get(i).addTransaction(customerName, amount);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getCustomerList(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i).getCustomerNames();
            }
        }
        return null;
    }

    public ArrayList<Double> getTransactions(String customerName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).findCustomer(customerName)) {
                return branches.get(i).getTransactions(customerName);
            }
        }
        return null;
    }

}

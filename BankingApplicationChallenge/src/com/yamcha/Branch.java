package com.yamcha;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return true;
            }
        }
        return false;
    }

    public boolean addCustomer(String customerName, double initialAmount) {
        Customer newCustomer = new Customer(customerName, initialAmount);
        if(findCustomer(customerName)) {
            return false;
        }
        customers.add(newCustomer);
        return true;
    }

    public boolean addCustomer(Customer newCustomer) {
        String name = newCustomer.getName();
        double amount = newCustomer.getInitialTransaction();
        return addCustomer(name,amount);
    }

    public boolean addCustomer(String customerName) {
        return addCustomer(customerName, 0);
    }

    public boolean addTransaction(String customerName, double amount) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                customers.get(i).addTransaction(amount);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<String> getCustomerNames() {
        ArrayList<String> customerNames = new ArrayList<>();

        for (int i = 0; i < customers.size(); i++) {
            customerNames.add(customers.get(i).getName());
        }
        return customerNames;
    }

    public ArrayList<Double> getTransactions(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return customers.get(i).getTransactions();
            }
        }
        return null;
    }

}

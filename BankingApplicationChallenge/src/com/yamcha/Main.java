package com.yamcha;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank td = new Bank("TD");
        Branch downtown = new Branch("Downtown");
        Customer chad = new Customer("chad");
        downtown.addCustomer(chad);
        td.addBranch(downtown);


        downtown.addCustomer("brian", 67.99);
        System.out.println(downtown.getCustomerNames());
        td.addCustomer("jeff", "Downtown", 234.66);
        td.addTransaction("jeff", "Downtown", 23.56);
        downtown.addCustomer("daniel");
        downtown.addTransaction("daniel", 14.45);
        System.out.println(td.getCustomerList("Downtown"));
        System.out.println(td.getTransactions("daniel"));
        td.addTransaction("chad", "Downtown", 34.56);
        System.out.println(td.getTransactions("chad"));
    }
}

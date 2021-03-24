package com.yamcha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player p1 = new Player("bob", 15, 10);
        System.out.println(p1.toString());

        // a better solution would be to keep fields in base class private, and have the displayOrderInfo() method return a price
        // instead of only printing out messages, then subclasses can super.displayOrderInfo() to retrieve price and then perform
        // their own unique operations. the topping information displayed would have to be separated in this case.

    }
}

package com.yamcha;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger mcdouble = new Hamburger("mcdouble", "white", "beef", 2.69 );
        mcdouble.addHamburgerTopping1("lettuce", 0.34);
        mcdouble.displayOrderInformation();

        HealthyBurger gohan = new HealthyBurger("gohan", "fish", 5.78);
        gohan.addHamburgerTopping1("tomato", 0.23);
        gohan.addHamburgerTopping4("onion", 0.18);
        gohan.addHamburgerTopping6("lettuce", 0.56);
        gohan.displayOrderInformation();

        DeluxeBurger goku = new DeluxeBurger("goku", "whole wheat", "chicken", 5.30);
        goku.addHamburgerTopping3("mayo", 1.3);
        goku.displayOrderInformation();

        // a better solution would be to keep fields in base class private, and have the displayOrderInfo() method return a price
        // instead of only printing out messages, then subclasses can super.displayOrderInfo() to retrieve price and then perform
        // their own unique operations. the topping information displayed would have to be separated in this case.

    }
}

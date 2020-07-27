package com.yamcha;

public class Hamburger {
    protected String name;
    protected String breadType;
    protected String meatType;
    protected double price;
    protected String topping1, topping2, topping3, topping4;
    protected double topping1price, topping2price, topping3price, topping4price;
    protected double finalPrice;

    public Hamburger(String name, String breadType, String meatType, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;
        topping1 = "none";
        topping2 = "none";
        topping3 = "none";
        topping4 = "none";
        if (price >= 0) {
            this.price = price;
        }
        else {
            System.out.println("Please Enter Valid Price");
        }
    }
    public void addHamburgerTopping1(String name, double price){
        this.topping1 = name;
        if (price >= 0) {
            this.topping1price = price;
        }
        else {
            System.out.println("Please Enter Valid Topping Price");
        }
    }
    public void addHamburgerTopping2(String name, double price){
        this.topping2 = name;
        if (price >= 0) {
            this.topping2price = price;
        }
        else {
            System.out.println("Please Enter Valid Topping Price");
        }
    }
    public void addHamburgerTopping3(String name, double price){
        this.topping3 = name;
        if (price >= 0) {
            this.topping3price = price;
        }
        else {
            System.out.println("Please Enter Valid Topping Price");
        }
    }
    public void addHamburgerTopping4(String name, double price){
        this.topping4 = name;
        if (price >= 0) {
            this.topping4price = price;
        }
        else {
            System.out.println("Please Enter Valid Topping Price");
        }
    }
    public void displayOrderInformation() {
        System.out.println("The " + name + " burger has " + breadType + " bread and "
        + meatType + " as the protein with a base price of $" + price);
        System.out.println("The toppings added are: " + topping1 + ", " + topping2 + ", "
        + topping3 + ", " + topping4);
        finalPrice = price + topping1price + topping2price + topping3price + topping4price;
        System.out.println("The total price is: $" + finalPrice);
    }
}

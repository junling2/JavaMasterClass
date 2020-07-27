package com.yamcha;

public class HealthyBurger extends Hamburger {
    private String topping5, topping6;
    private double topping5price, topping6price;

    public HealthyBurger(String name, String meatType, double price) {
        super(name, "brown rye", meatType, price);
        topping5 = "none";
        topping6 = "none";
    }
    public void addHamburgerTopping5(String name, double price){
        this.topping5 = name;
        if (price >= 0) {
            this.topping5price = price;
        }
        else {
            System.out.println("Please Enter Valid Topping Price");
        }
    }
    public void addHamburgerTopping6(String name, double price){
        this.topping6 = name;
        if (price >= 0) {
            this.topping6price = price;
        }
        else {
            System.out.println("Please Enter Valid Topping Price");
        }
    }

    @Override
    public void displayOrderInformation() {
        System.out.println("The " + name + " burger has " + breadType + " bread and "
                + meatType + " as the protein with a base price of $" + price);
        System.out.println("The toppings added are: " + topping1 + ", " + topping2 + ", "
                + topping3 + ", " + topping4 + ", " + topping5 + ", " + topping6);
        finalPrice = price + topping1price + topping2price + topping3price + topping4price + topping5price
        + topping6price;
        System.out.println("The total price is: $" + finalPrice);
    }

}

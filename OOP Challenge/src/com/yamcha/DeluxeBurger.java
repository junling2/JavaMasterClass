package com.yamcha;

public class DeluxeBurger extends Hamburger {
    private String addition1 = "chips";
    private String addition2 = "drink";
    private double additionsPrice = 4.20;

    public DeluxeBurger(String name, String breadType, String meatType, double price) {
        super(name, breadType, meatType, price);
    }

    @Override
    public void displayOrderInformation() {
        System.out.println("The " + name + " burger has " + breadType + " bread and "
                + meatType + " as the protein with a base price of $" + (price + additionsPrice));
        System.out.println("The toppings added are: " + topping1 + ", " + topping2 + ", "
                + topping3 + ", " + topping4);
        System.out.println("This deluxe burger comes with a chips and drink combo that is included in the base price");
        finalPrice = price + topping1price + topping2price + topping3price + topping4price + additionsPrice;
        System.out.println("The total price is: $" + finalPrice);
    }
}

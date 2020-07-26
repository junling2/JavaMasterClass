package com.yamcha;

public class Hamburger {
    private String name;
    private String breadType;
    private String meatType;
    private double price;
    private String topping1, topping2, topping3, topping4;
    private double topping1price, topping2price, topping3price, topping4price;

    public Hamburger(String name, String breadType, String meatType, double price) {
        this.name = name;
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
    }
    public void addHamburgerTopping1(String name, double price){
        this.topping1 = name;
        this.topping1price = price;
    }
    public void addHamburgerTopping2(String name, double price){
        this.topping2 = name;
        this.topping2price = price;
    }
    public void addHamburgerTopping3(String name, double price){
        this.topping3 = name;
        this.topping3price = price;
    }
    public void addHamburgerTopping4(String name, double price){
        this.topping4 = name;
        this.topping4price = price;
    }
    public double getBasePrice(){
        return this.price;
    }
}

package com.junling2;

public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock = 0;
    private int quantityReserved = 0;
    private int availableStock; // * instead, use method to return quantityStock - reserved
    // so available will be updated automatically when this method is called,
    // so will only need a finalize method to reduce stock and reserved at checkout.

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        availableStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if (newQuantity >= 0) {
            this.quantityStock = newQuantity;
            this.availableStock = newQuantity;
        }
    }

    void reserveItem(int quantity) {
        if (quantity > 0 && availableStock - quantity >= 0) {
            quantityReserved += quantity;
            availableStock -= quantity;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 69;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StockItem) {
            StockItem thisObj = (StockItem) obj;
            return this.getName().equals(thisObj.getName());
        }
        return false;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.name.compareToIgnoreCase(o.getName());
        }
        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return
                "item = '" + name + '\'' +
                ", price = " + price +
                ", Available Stock = " + availableStock + ",";
    }
}

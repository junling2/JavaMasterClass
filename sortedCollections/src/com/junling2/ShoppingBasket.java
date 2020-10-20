package com.junling2;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingBasket {
    private final String customerName;
    private final Map<StockItem, Integer> list;

    public ShoppingBasket(String customerName) {
        this.customerName = customerName;
        this.list = new LinkedHashMap<>();
    }

    public int addToCart(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int inCart = list.getOrDefault(item,0);
            list.put(item, inCart + quantity);
            return inCart + quantity;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nShopping Cart for "+ customerName + " has " + list.size() + " items\n");
        double totalCost = 0.0;

        for (Map.Entry<StockItem, Integer> entry : list.entrySet()) {
            s.append(entry.getKey().getName()).append(" : ").append(entry.getKey().getPrice()).append(" ");
            totalCost += entry.getKey().getPrice() * entry.getValue();
        }
        return s + "Total Cost: " + totalCost;
    }
}

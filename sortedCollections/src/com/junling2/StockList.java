package com.junling2;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = list.getOrDefault(item.getName(), item);

            if (inStock != item) {
                // already in the list
                item.adjustStock(inStock.getQuantityStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String itemName, int quantitySold) {
        StockItem inStock = list.get(itemName);
        if ((inStock != null) && (inStock.getQuantityStock() >= quantitySold) && (quantitySold > 0)) {
            inStock.adjustStock(quantitySold * -1);
            list.put(itemName, inStock);
            return inStock.getQuantityStock();
        }
        return 0;
    }

    public int reserveStock(String itemName, int quantity) {
        if (get(itemName) != null && quantity > 0) {
            get(itemName).reserveItem(quantity);
            return get(itemName).getAvailableStock();
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("\nStock List\n");
        double totalCost = 0.0;

        for (Map.Entry<String, StockItem> entry : list.entrySet()) {
            StockItem item = entry.getValue();
            double itemValue = item.getQuantityStock() * item.getPrice();

            s.append(item.toString()).append(" item Value = ").append(itemValue).append(" ");
            totalCost += itemValue;
        }
        return s + "Total Value: " + totalCost;
    }
}

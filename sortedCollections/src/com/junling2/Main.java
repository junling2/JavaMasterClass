package com.junling2;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // using LinkedHashMap is easy with generics, only need to change 1 line of code and sequence will be printed
        // in the order it was added to the map.
        // TreeMap is Sorted using compareTo() method for the keySet, slower performance than unsorted maps.
        StockItem bread = new StockItem("Bread", 1.50, 100);
        StockItem milk = new StockItem("Milk", 2.30, 100);
        StockItem juice = new StockItem("Juice", 3.50, 100);
        StockItem bacon = new StockItem("Bacon", 4.50,100);

        StockList list = new StockList();

        // note that adjustStock method can be made private by nesting StockItem class within StockList
        // to make it more secure from Main. Or make package private if importing to other Main functions.
        list.addStock(bacon);
        list.addStock(bread);
        list.addStock(milk);
        list.addStock(juice);

        System.out.println(list);

        ShoppingBasket basket = new ShoppingBasket("Junling");

        basket.addToCart(milk, 2);
        list.reserveStock("Milk", 2);
        basket.addToCart(bread, 1);
        list.reserveStock("Bread", 1);
        basket.addToCart(juice, 1);
        list.reserveStock("Juice", 1);

        System.out.println(list);

        // Transaction happens, checkout with items in basket
        list.sellStock("Bread", 1);
        list.sellStock("Milk", 2);
        list.sellStock("Juice", 1);

        System.out.println(basket);

        System.out.println(list);
    }
}

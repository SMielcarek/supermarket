package com.supermarket.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Integer,CartItem> listOfItems = new HashMap<>();
    private int totalValue;

    public Cart() {}

    public Map<Integer,CartItem> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(Map<Integer,CartItem> listOfProducts) {
        this.listOfItems = listOfProducts;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
}

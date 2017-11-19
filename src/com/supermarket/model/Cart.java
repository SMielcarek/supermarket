package com.supermarket.model;

import java.util.List;

public class Cart {

    private List<Product> listOfProducts;
    private int totalValue;

    public Cart() {}

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }
}

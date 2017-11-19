package com.supermarket.model;

public class Product {

    private int id;
    private String name;
    private int price;
    // private boolean specialOffer;
    private int specialPrice;
    private int specialQuantity;

    public Product() {}

    public Product(int id, String name, int price, int specialPrice, int specialQuantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.specialPrice = specialPrice;
        this.specialQuantity = specialQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }

    public int getSpecialQuantity() {
        return specialQuantity;
    }

    public void setSpecialQuantity(int specialQuantity) {
        this.specialQuantity = specialQuantity;
    }

}

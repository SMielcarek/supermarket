package com.supermarket.repository;

import com.supermarket.model.Product;

import java.util.List;

public interface ProductsRepository {

    void addProduct(Product product);
    Product getProductById(int id);
    List<Product> getAllProducts();

}

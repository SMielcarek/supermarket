package com.supermarket.repository;

import com.supermarket.model.Product;
import java.util.Map;

public interface ProductsRepository {

    void addProduct(Product product);
    Product getProductById(int id);
    Map<Integer,Product> getAllProducts();

}

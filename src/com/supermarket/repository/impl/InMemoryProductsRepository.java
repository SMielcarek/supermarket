package com.supermarket.repository.impl;

import com.supermarket.model.Product;
import com.supermarket.repository.ProductsRepository;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryProductsRepository implements ProductsRepository {

    private Map<Integer,Product> supermarketProducts = new HashMap<>();

    @PostConstruct
    public void init() {
        addProduct(new Product(1,"Product A",20,45,3));
        addProduct(new Product(2,"Product B",12,20,3));
        addProduct(new Product(3,"Product C",6, 0,0));
        addProduct(new Product(4,"Product D",10,0,0));
        addProduct(new Product(5,"Product E",20,35,2));
    }

    @Override
    public void addProduct(Product product) {
        supermarketProducts.put(product.getId(),product);
    }

    @Override
    public Product getProductById(int id) {
        return supermarketProducts.get(id);
    }

    @Override
    public Map<Integer,Product> getAllProducts() {
        return supermarketProducts;
    }
}

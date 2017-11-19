package com.supermarket.service.impl;

import com.supermarket.model.Cart;
import com.supermarket.model.Product;
import com.supermarket.repository.ProductsRepository;
import com.supermarket.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupermarketCartService implements CartService {

    private ProductsRepository productsRepository;

    @Autowired
    public SupermarketCartService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void addItemToCart() {

    }

    @Override
    public Cart doCheckout() {
        return null;
    }

    public List<Product> retrieveProducts() {
        return productsRepository.getAllProducts();
    }
}

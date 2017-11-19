package com.supermarket.service;

import com.supermarket.model.Cart;
import com.supermarket.model.Product;


import java.util.List;

public interface CartService {

    void addItemToCart();
    Cart doCheckout();
    List<Product> retrieveProducts();

}

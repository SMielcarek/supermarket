package com.supermarket.service;

import com.supermarket.model.Cart;
import com.supermarket.model.Product;
import java.util.Map;

public interface CartService {

    void addItemToCart(int id);
    void deleteItemFromCart(int id);
    Cart doCheckout();

}

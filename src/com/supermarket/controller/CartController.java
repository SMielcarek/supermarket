package com.supermarket.controller;

import com.supermarket.model.Product;
import com.supermarket.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
public class CartController {

    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/cart")
    @ResponseBody
    public String displayCart() {
        return "Cart content...";
    }

    @RequestMapping("/products")
    @ResponseBody
    public List<Product> displayProducts() {
        return cartService.retrieveProducts();
    }
}

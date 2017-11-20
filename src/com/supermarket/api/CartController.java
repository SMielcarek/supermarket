package com.supermarket.api;

import com.supermarket.model.Cart;
import com.supermarket.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cart")
public class CartController {

    private CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map displayCart() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "This is the REST implementation of supermarket cart");
        map.put("author", "Sebastian Mielcarek");
        return map;
    }

    @RequestMapping(value = "/add/{id}", method = RequestMethod.PUT)
    public Cart addToCart(@PathVariable int id) {
        cartService.addItemToCart(id);
        return cartService.doCheckout();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Cart removeFromCart(@PathVariable int id) {
        cartService.deleteItemFromCart(id);
        return cartService.doCheckout();
    }

    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public Cart checkout() {
        return cartService.doCheckout();
    }
}

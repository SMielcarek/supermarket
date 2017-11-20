package com.supermarket.service.impl;

import com.supermarket.model.Cart;
import com.supermarket.model.CartItem;
import com.supermarket.model.Product;
import com.supermarket.repository.ProductsRepository;
import com.supermarket.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;


@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SupermarketCartService implements CartService {

    private ProductsRepository productsRepository;
    private Cart cart = new Cart();

    @Autowired
    public SupermarketCartService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void addItemToCart(int id) {
        if (cart.getListOfItems().containsKey(id)) {
            cart.getListOfItems().get(id).increaseQuantity();
        }
        else {
            Product product = productsRepository.getProductById(id);
            if (product != null) {
                CartItem cartItem = new CartItem(product.getId(), product.getName(), product.getPrice(),1);
                cart.getListOfItems().put(product.getId(), cartItem);
            }
        }
        this.calculateTotalCartValue();
    }

    @Override
    public void deleteItemFromCart(int id) {
        cart.getListOfItems().remove(id);
        this.calculateTotalCartValue();
    }

    @Override
    public Cart doCheckout() {
        this.calculateTotalCartValue();
        return this.cart;
    }

    private void calculateTotalCartValue() {
        int totalValue = 0;
        for(CartItem item : cart.getListOfItems().values()) {
            Product product = productsRepository.getProductById(item.getId());
            int itemsInCart = item.getQuantity();
            int productSpecialQuantity = product.getSpecialQuantity();
            if (product.isMultiPriced() && (itemsInCart >= productSpecialQuantity)) {
                int quotient  = itemsInCart / productSpecialQuantity;
                int remainder = itemsInCart % productSpecialQuantity;
                totalValue += quotient * product.getSpecialPrice() + remainder * item.getPrice();
            }
            else {
                totalValue += itemsInCart * item.getPrice();
            }
        }
        this.cart.setTotalValue(totalValue);
    }

}

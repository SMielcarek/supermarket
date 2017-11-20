package com.supermarket.api;

import com.supermarket.model.Product;
import com.supermarket.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductsRepository productsRepository;

    @Autowired
    public ProductController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return new ArrayList<>(productsRepository.getAllProducts().values());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable int id) throws ProductNotFoundException {
        Product product = productsRepository.getProductById(id);
        if (product == null) {
            throw new ProductNotFoundException();
        }
        return product;
    }
}

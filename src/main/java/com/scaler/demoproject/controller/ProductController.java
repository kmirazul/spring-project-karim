package com.scaler.demoproject.controller;

import com.scaler.demoproject.models.Product;
import com.scaler.demoproject.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    // CRUD APIs around products
    // For the product
    // 1. API to create a product
    // 2. API to get a product
    // 3. API to update the product
    // 4. API to delete the product

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // 1. This will help to create a product
    // @RequestMapping(value = "/products", method = RequestMethod.POST)
    @PostMapping("/products")
    public void createProduct(Product product){}

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        productService.getSingleProduct(id);
        return null;
    }

    public void updateProduct(Product product){

    }

    public void deleteProduct(Long id){

    }
}

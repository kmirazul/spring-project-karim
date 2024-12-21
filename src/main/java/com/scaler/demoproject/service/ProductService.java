package com.scaler.demoproject.service;

import com.scaler.demoproject.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id);
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(long id);
}

package com.example.product.service;

import com.example.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
}

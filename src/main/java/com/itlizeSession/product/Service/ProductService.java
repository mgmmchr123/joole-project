package com.itlizeSession.product.Service;

import com.itlizeSession.product.Entity.Product;

import java.util.List;

public interface ProductService {

    Product findOneById(Integer Id);

    List<Product> findAll();

    void createTwo();

    Product save(Product myProduct);

    List<Product> findByBrand(String b);
}

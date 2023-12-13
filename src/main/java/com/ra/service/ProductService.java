package com.ra.service;


import com.ra.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findById(Integer id);

    Product save(Product product);

    void delete(Integer id);
}

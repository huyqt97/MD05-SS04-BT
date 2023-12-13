package com.ra.service;

import com.ra.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category findById(Integer id);

    Category save(Category category);

    void delete(Integer id);
}

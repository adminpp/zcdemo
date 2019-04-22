package com.service;

import com.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    List<ProductCategory> findAll();
    //根据id查找
    ProductCategory findById(Integer id);
}

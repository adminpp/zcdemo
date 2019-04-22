package com.service.impl;

import com.entity.ProductCategory;
import com.entity.ProductCategoryExample;
import com.mapper.ProductCategoryMapper;
import com.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.security.auth.login.CredentialException;
import java.util.List;

/**
 * @Date: 2019/4/21 19:54
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Resource
    private ProductCategoryMapper productCategoryMapper;
    @Override
    public List<ProductCategory> findAll() {
        List<ProductCategory> productCategories = productCategoryMapper.selectByExample(null);
        return productCategories;
    }

    @Override
    public ProductCategory findById(Integer id) {
        ProductCategory productCategory = productCategoryMapper.selectByPrimaryKey(id);
        return productCategory;
    }
}

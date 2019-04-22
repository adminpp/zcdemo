package com.service;

import com.entity.ProductInfo;
import com.utils.ResultData;

import java.util.List;

public interface ProductInfoService {
    ProductInfo findById(String productId);
    List<ProductInfo> findProductsByStatus();
    ResultData findProductsByPage(Integer page, Integer size);
    void addProductInfo(ProductInfo productInfo);
    void updateProductInfo(ProductInfo productInfo);
}

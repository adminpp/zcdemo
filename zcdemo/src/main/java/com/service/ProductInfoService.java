package com.service;

import com.entity.ProductInfo;
import com.utils.ResultData;

import java.util.List;

public interface ProductInfoService {
    //根据id查询商品信息
    ProductInfo findById(String productId);
    //根据在架状态查询（先忽略）
    List<ProductInfo> findProductsByStatus();
    //分页查询所有商品
    ResultData findProductsByPage(Integer page, Integer size);
    //添加商品
    void addProductInfo(ProductInfo productInfo);
    //修改商品
    void updateProductInfo(ProductInfo productInfo);
    //删除商品(根据id)
    void deleteProductInfo(String productId);
}

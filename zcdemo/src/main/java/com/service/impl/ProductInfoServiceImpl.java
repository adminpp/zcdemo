package com.service.impl;

import com.entity.ProductInfo;
import com.entity.ProductInfoExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.ProductInfoMapper;
import com.service.ProductInfoService;
import com.utils.ResultData;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Date: 2019/4/21 19:16
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Resource
    private ProductInfoMapper productInfoMapper;
    @Override
    public ProductInfo findById(String productId) {
        ProductInfoExample example = new ProductInfoExample();
        ProductInfo productInfo = productInfoMapper.selectByPrimaryKey(productId);
        return productInfo;
    }

    @Override
    public List<ProductInfo> findProductsByStatus() {
        ProductInfoExample example = new ProductInfoExample();
        List<ProductInfo> list = productInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public ResultData findProductsByPage(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<ProductInfo> list = productInfoMapper.selectByExample(null);
        PageInfo info = new PageInfo(list);
        ResultData resultData = new ResultData();
        long total = info.getTotal();
        List list1 = info.getList();
        resultData.setTotal(total);
        resultData.setRows(list1);
        return resultData;
    }

    @Override
    public void addProductInfo(ProductInfo productInfo) {
        productInfoMapper.updateByPrimaryKey(productInfo);
    }

    @Override
    public void updateProductInfo(ProductInfo productInfo) {
        productInfoMapper.updateByPrimaryKey(productInfo);
    }
}

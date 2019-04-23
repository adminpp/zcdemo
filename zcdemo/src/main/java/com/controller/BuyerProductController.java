package com.controller;

import com.service.ProductInfoService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Date: 2019/4/21 19:49
 */
//查询所有商品
@RestController("/buyer/product")
public class BuyerProductController {
    @Resource
    private ProductInfoService productInfoService;


}

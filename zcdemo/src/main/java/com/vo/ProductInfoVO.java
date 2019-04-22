package com.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @Date: 2019/4/21 19:31
 */
public class ProductInfoVO {
    @JsonProperty("id")
    private String productId;
    @JsonProperty("name")
    private String productName;
    @JsonProperty("price")
    private String productPrice;
    @JsonProperty("descripion")
    private String productDescription;
    @JsonProperty("iocn")
    private String productIocn;
    @JsonProperty("age")
    private String productAge;
    @JsonProperty("size")
    private String productSize;
    @JsonProperty("type")
    private String productType;
    @JsonProperty("stock")
    private int productStock;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIocn() {
        return productIocn;
    }

    public void setProductIocn(String productIocn) {
        this.productIocn = productIocn;
    }

    public String getProductAge() {
        return productAge;
    }

    public void setProductAge(String productAge) {
        this.productAge = productAge;
    }

    public String getProductSize() {
        return productSize;
    }

    public void setProductSize(String productSize) {
        this.productSize = productSize;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }
}

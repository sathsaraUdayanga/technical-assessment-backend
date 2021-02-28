package com.store.assessment.dto;

import java.util.List;

public class ProductListDTO {
    private List<ProductDTO> productList;

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }
}
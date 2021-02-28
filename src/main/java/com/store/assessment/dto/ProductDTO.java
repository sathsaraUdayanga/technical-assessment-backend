package com.store.assessment.dto;

import java.util.List;

public class ProductDTO {
    private String productName;
    private List<PriceListDTO> priceList;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<PriceListDTO> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<PriceListDTO> priceList) {
        this.priceList = priceList;
    }
}
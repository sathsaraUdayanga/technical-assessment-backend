package com.store.assessment.service;

import com.store.assessment.dto.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PriceEngine {
    double getPriceOfACarton(String product);
    int getNumberOfUnitsOfACarton(String product);
    double getSingleUnitPrice(String product);
    double calculatePrice(String product, int numberOfCartons, int numberOfSingleUnits);
    List<ProductDTO> getPriceList();
}

package com.store.assessment.service;

import com.store.assessment.dto.PriceRequestDTO;
import com.store.assessment.dto.PriceResponseDTO;
import com.store.assessment.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceCalculatorService {

    @Autowired
    private PriceEngine priceEngine;

    public PriceResponseDTO calculatePrice(PriceRequestDTO requestDTO){
        double penguinEarPrice = priceEngine.calculatePrice(Constants.PENGUIN_EAR, requestDTO.getPenguinEarCartons(), requestDTO.getPenguinEarSingleUnits());
        double horseshoePrice = priceEngine.calculatePrice(Constants.HORSESHOE, requestDTO.getHorseshoeCartons(), requestDTO.getHorseshoeSingleUnits());
        return new PriceResponseDTO(penguinEarPrice, horseshoePrice, penguinEarPrice+horseshoePrice);
    }
}
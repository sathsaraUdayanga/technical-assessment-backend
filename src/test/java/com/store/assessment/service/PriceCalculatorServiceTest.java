package com.store.assessment.service;

import com.store.assessment.dto.PriceRequestDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PriceCalculatorServiceTest {

    @Autowired
    private PriceCalculatorService priceCalculatorService;

    @Test
    void calculatePrice() {
        PriceRequestDTO requestDTO = new PriceRequestDTO();
        requestDTO.setHorseshoeCartons(5);
        requestDTO.setHorseshoeSingleUnits(1);
        requestDTO.setPenguinEarCartons(2);
        requestDTO.setPenguinEarSingleUnits(8);

        double expected = 4368d;
        double actual = priceCalculatorService.calculatePrice(requestDTO).getTotalPrice();
        assertEquals(expected, actual);
    }
}
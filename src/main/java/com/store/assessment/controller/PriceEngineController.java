package com.store.assessment.controller;

import com.store.assessment.dto.PriceRequestDTO;
import com.store.assessment.dto.PriceResponseDTO;
import com.store.assessment.dto.ProductDTO;
import com.store.assessment.service.PriceCalculatorService;
import com.store.assessment.service.PriceEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class PriceEngineController {

    @Autowired
    private PriceEngine priceEngine;

    @Autowired
    private PriceCalculatorService priceCalculatorService;

    @GetMapping("/products")
    public List<ProductDTO> getProducts() {
        return priceEngine.getPriceList();
    }

    @PostMapping("/price")
    public PriceResponseDTO getPrice(@RequestBody PriceRequestDTO requestDTO) {
        return priceCalculatorService.calculatePrice(requestDTO);
    }
}
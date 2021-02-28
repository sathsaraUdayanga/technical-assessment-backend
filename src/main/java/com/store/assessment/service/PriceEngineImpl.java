package com.store.assessment.service;

import com.store.assessment.dto.PriceListDTO;
import com.store.assessment.dto.ProductDTO;
import com.store.assessment.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceEngineImpl implements PriceEngine {
    @Override
    public double getPriceOfACarton(String product) {
        if (product.equals(Constants.PENGUIN_EAR)) {
            return Constants.PENGUIN_EAR_CARTON;
        } else if (product.equals(Constants.HORSESHOE)) {
            return Constants.HORSESHOE_CARTON;
        } else {
            return 0;
        }
    }

    @Override
    public int getNumberOfUnitsOfACarton(String product) {
        if (product.equals(Constants.PENGUIN_EAR)) {
            return Constants.PENGUIN_EAR_CARTON_UNITS;
        } else if (product.equals(Constants.HORSESHOE)) {
            return Constants.HORSESHOE_CARTON_UNITS;
        } else {
            return 0;
        }
    }

    @Override
    public double getSingleUnitPrice(String product) {
        return calculateUnitPrice(getPriceOfACarton(product), getNumberOfUnitsOfACarton(product));
    }

    @Override
    public double calculatePrice(String product, int numberOfCartons, int numberOfSingleUnits) {
        double priceOfACarton = getPriceOfACarton(product);
        double priceForSingleUnits = getSingleUnitPrice(product) * numberOfSingleUnits;
        double priceForCartons = 0;
        if (numberOfCartons < 3) {
            priceForCartons = priceOfACarton * numberOfCartons;
        } else {
            priceForCartons = calculateDiscount(priceOfACarton * numberOfCartons);
        }
        return priceForSingleUnits + priceForCartons;
    }

    @Override
    public List<ProductDTO> getPriceList() {
        List<ProductDTO> productDTOList = new ArrayList<>();

        //penguin-ear
        ProductDTO penguinEar = new ProductDTO();
        penguinEar.setProductName("penguin ear");
        List<PriceListDTO> penguinPriceList = new ArrayList<>();
        for (int i = 1; i <= 50; ++i) {
            int numberOfCartons = i / Constants.PENGUIN_EAR_CARTON_UNITS;
            int numberOfSingleUnits = i % Constants.PENGUIN_EAR_CARTON_UNITS;
            PriceListDTO priceListDTO = new PriceListDTO(i, calculatePrice(Constants.PENGUIN_EAR, numberOfCartons, numberOfSingleUnits));
            penguinPriceList.add(priceListDTO);

        }
        penguinEar.setPriceList(penguinPriceList);
        productDTOList.add(penguinEar);

        //horseshoe
        ProductDTO horseshoe = new ProductDTO();
        horseshoe.setProductName("horseshoe");
        List<PriceListDTO> horseshoePriceList = new ArrayList<>();
        for (int i = 1; i <= 50; ++i) {
            int numberOfCartons = i / Constants.HORSESHOE_CARTON_UNITS;
            int numberOfSingleUnits = i % Constants.HORSESHOE_CARTON_UNITS;
            PriceListDTO priceListDTO = new PriceListDTO(i, calculatePrice(Constants.HORSESHOE, numberOfCartons, numberOfSingleUnits));
            horseshoePriceList.add(priceListDTO);
        }
        horseshoe.setPriceList(horseshoePriceList);
        productDTOList.add(horseshoe);

        return productDTOList;
    }

    private double calculateUnitPrice(double cartonPrice, int noOfUnitsOfACarton) {
        return (cartonPrice * 1.3) / noOfUnitsOfACarton;
    }

    private double calculateDiscount(double amount) {
        return (amount * 0.9); // 10% discount
    }
}
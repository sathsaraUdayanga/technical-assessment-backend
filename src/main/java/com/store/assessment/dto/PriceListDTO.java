package com.store.assessment.dto;

public class PriceListDTO {
    private int numberOfUnits;
    private double price;

    public PriceListDTO() {
    }

    public PriceListDTO(int numberOfUnits, double price) {
        this.numberOfUnits = numberOfUnits;
        this.price = price;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
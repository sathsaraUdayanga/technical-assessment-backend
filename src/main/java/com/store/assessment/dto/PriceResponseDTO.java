package com.store.assessment.dto;

public class PriceResponseDTO {
    private double penguinEarPrice;
    private double horseshoePrice;
    private double totalPrice;

    public PriceResponseDTO() {
    }

    public PriceResponseDTO(double penguinEarPrice, double horseshoePrice, double totalPrice) {
        this.penguinEarPrice = penguinEarPrice;
        this.horseshoePrice = horseshoePrice;
        this.totalPrice = totalPrice;
    }

    public double getPenguinEarPrice() {
        return penguinEarPrice;
    }

    public void setPenguinEarPrice(double penguinEarPrice) {
        this.penguinEarPrice = penguinEarPrice;
    }

    public double getHorseshoePrice() {
        return horseshoePrice;
    }

    public void setHorseshoePrice(double horseshoePrice) {
        this.horseshoePrice = horseshoePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
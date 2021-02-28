package com.store.assessment.dto;

public class PriceRequestDTO {
    private int penguinEarCartons;
    private int penguinEarSingleUnits;
    private int horseshoeCartons;
    private int horseshoeSingleUnits;

    public int getPenguinEarCartons() {
        return penguinEarCartons;
    }

    public void setPenguinEarCartons(int penguinEarCartons) {
        this.penguinEarCartons = penguinEarCartons;
    }

    public int getPenguinEarSingleUnits() {
        return penguinEarSingleUnits;
    }

    public void setPenguinEarSingleUnits(int penguinEarSingleUnits) {
        this.penguinEarSingleUnits = penguinEarSingleUnits;
    }

    public int getHorseshoeCartons() {
        return horseshoeCartons;
    }

    public void setHorseshoeCartons(int horseshoeCartons) {
        this.horseshoeCartons = horseshoeCartons;
    }

    public int getHorseshoeSingleUnits() {
        return horseshoeSingleUnits;
    }

    public void setHorseshoeSingleUnits(int horseshoeSingleUnits) {
        this.horseshoeSingleUnits = horseshoeSingleUnits;
    }
}
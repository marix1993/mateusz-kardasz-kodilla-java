package com.kodilla.good.patterns.food2door;

public class FishProduct extends Product {

    private String typeOfFish;

    public FishProduct(String productName, String typeOfFish) {
        super(productName);
        this.typeOfFish = typeOfFish;
    }
}


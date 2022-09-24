package com.kodilla.good.patterns.food2door;



public class SweetProduct extends Product {

    private String prodDescription;

    public SweetProduct(String productName, String prodDescription) {
        super(productName);
        this.prodDescription = prodDescription;
    }
}


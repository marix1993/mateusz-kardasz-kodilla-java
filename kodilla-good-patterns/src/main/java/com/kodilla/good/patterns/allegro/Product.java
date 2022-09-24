package com.kodilla.good.patterns.allegro;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private BigDecimal productPrice;

    public Product(String productName, BigDecimal productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}

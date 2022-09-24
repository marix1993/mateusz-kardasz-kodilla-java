package com.kodilla.good.patterns.food2door;

import java.util.*;
import java.util.Optional;

public class FishMarket implements FoodProducer {

    private Map<Product, Integer> productsList;

    public FishMarket() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new FishProduct("Filet z dorsza.", "Dorsz."), 14);
        productsList.put(new FishProduct("Filet z pangi.", "Panga."), 21);
        productsList.put(new FishProduct("Filet z łososia.", "Łosoś."), 32);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrder) {
        for (Map.Entry<Product, Integer> entry : productOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("FishMarket: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}



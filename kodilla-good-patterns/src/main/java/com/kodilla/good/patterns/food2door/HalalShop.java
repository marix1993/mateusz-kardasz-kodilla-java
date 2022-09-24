package com.kodilla.good.patterns.food2door;

import java.util.*;

public class HalalShop implements FoodProducer {

    private Map<Product, Integer> productsList;

    public HalalShop() {
        productsList = createProductList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productsList = new HashMap<>();

        productsList.put(new FishProduct("Paluszki rybne.", "Łosoś"), 10);
        productsList.put(new MeatProduct("Steak.", "Wołowina."), 10);
        productsList.put(new MeatProduct("Steak.", "Cielęcina."), 20);

        return productsList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrder) {
        for (Map.Entry<Product, Integer> entry : productOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productsList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("HalalShop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}


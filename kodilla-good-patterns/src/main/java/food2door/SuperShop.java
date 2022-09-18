package food2door;

import java.util.*;

public class SuperShop implements FoodProducer {

    private Map<Product, Integer> productList;

    public SuperShop() {
        productList = createProductList();
    }

    private Map<Product, Integer> createProductList() {

        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new FishProduct("Filet z Dorsza.", "Panga."), 10);
        productList.put(new MeatProduct("Steak.", "Wołowina."), 12);
        productList.put(new SweetProduct("Baton.", "Batonik o smaku czekoladowym."), 10);

        return productList;
    }

    @Override
    public boolean process(Customer customer, Map<Product, Integer> productOrder) {
        for (Map.Entry<Product, Integer> entry : productOrder.entrySet()) {
            Optional<Integer> productQty = Optional.ofNullable(productList.get(entry.getKey()));
            if (productQty.orElse(0) < entry.getValue()) {
                System.out.println("SuperShop: We're sorry. Product is unavailable.");
                return false;
            }
        }
        return true;
    }
}


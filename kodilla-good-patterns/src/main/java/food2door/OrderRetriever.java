package food2door;

import java.util.*;

public class OrderRetriever {

    public List<OrderRequest> retrieve() {
        List<OrderRequest> orderRequestList = new ArrayList<>();

        Customer customer = new Customer("Jan Kowalski");
        FoodProducer foodProducer = new HalalShop();
        Map<Product, Integer> productList = new HashMap<>();
        productList.put(new MeatProduct("Steak.", "Wołowina."), 2);
        productList.put(new FishProduct("Filet z pangi.", "Panga."), 1);

        orderRequestList.add(new OrderRequest(customer, foodProducer, productList));

        Customer customer1 = new Customer("Mateusz Kardi");
        FoodProducer foodProducer1 = new HalalShop();
        Map<Product, Integer> productList1 = new HashMap<>();
        productList.put(new MeatProduct("Steak.", "Cielęcina."), 2);
        productList.put(new FishProduct("Filet z dorsza.", "Dorsz."), 4);
        productList.put(new FishProduct("Filet z łososia.", "Łosoś."), 2);

        orderRequestList.add(new OrderRequest(customer1, foodProducer1, productList1));

        return orderRequestList;
    }
}

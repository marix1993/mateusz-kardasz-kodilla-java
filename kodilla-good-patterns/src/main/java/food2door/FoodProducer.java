package food2door;

import java.util.Map;

public interface FoodProducer {

    boolean process(Customer customer, Map<Product, Integer> productOrder);
}

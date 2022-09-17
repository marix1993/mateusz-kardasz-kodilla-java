package allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        User user = new User("Marix", "Mateusz", "Kardasz");
        LocalDateTime orderDate = LocalDateTime.of(2016, 12, 24, 5, 2);
        Product product = new Phone("Motorola", new BigDecimal(1200));
        int quantity = 1;

        System.out.println("Order start:");
        System.out.println("User: " + user.getUserName() + " Date: " + orderDate + " " + product + ", quantity=" + quantity);

        return new ProductOrderRequest(user, orderDate, product, quantity);
    }

}

package allegro;

import java.time.LocalDateTime;

interface ProductOrderService {
    boolean sold(User user, LocalDateTime orderDate, Product product, int quantity);
}

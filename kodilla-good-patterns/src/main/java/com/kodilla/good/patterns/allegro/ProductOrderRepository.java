package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface ProductOrderRepository {

    boolean createOrder(User user, LocalDateTime orderDate, Product product, int quantity);
}

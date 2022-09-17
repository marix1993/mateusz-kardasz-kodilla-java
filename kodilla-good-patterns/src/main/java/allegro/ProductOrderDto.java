package allegro;

import java.time.LocalDateTime;

public class ProductOrderDto {

    private User user;
    private LocalDateTime localDateTime;
    private Product product;
    private int quantity;
    private boolean isSold;

    public ProductOrderDto(final User user, final LocalDateTime localDateTime, final Product product, final int quantity, final boolean isSold) {
        this.user = user;
        this.localDateTime = localDateTime;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}

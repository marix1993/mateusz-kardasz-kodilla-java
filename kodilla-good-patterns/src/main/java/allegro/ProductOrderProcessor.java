package allegro;

public class ProductOrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(final InformationService informationService, final ProductOrderService productOrderService, final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDto process(ProductOrderRequest productOrderRequest) {
        boolean isSold = productOrderService.sold(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity());

        if (isSold) {
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createOrder(productOrderRequest.getUser(),
                    productOrderRequest.getOrderDate(),
                    productOrderRequest.getProduct(),
                    productOrderRequest.getQuantity());
        } else {
            System.out.println("Order rejected");
        }
        return new ProductOrderDto(productOrderRequest.getUser(),
                productOrderRequest.getOrderDate(),
                productOrderRequest.getProduct(),
                productOrderRequest.getQuantity(),
                isSold);
    }
}

package allegro;

public class Application {

    public static void main(String[] args) {

        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new SendMail(), new PhoneOrderService(), new PhoneOrderRepository());
        productOrderProcessor.process(productOrderRequest);

    }
}

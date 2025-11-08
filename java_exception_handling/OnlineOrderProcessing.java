import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int n = rand.nextInt(2);
        if (n == 0)
            throw new OutOfStockException("Product is out of stock!");
        else
            throw new PaymentFailedException("Payment process failed!");
    }
}

public class OnlineOrderProcessing {
    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}

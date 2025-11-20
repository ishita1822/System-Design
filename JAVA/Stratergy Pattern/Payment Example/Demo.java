import context.ShoppingCart;
import strategy.CreditCardPayment;
import strategy.PaypalPayment;
import strategy.UPIPayment;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        cart.setPaymentStrategy(new PaypalPayment("abc@gmail.com"));
        cart.checkout(200.0);

        cart.setPaymentStrategy(new UPIPayment("110022@ocki"));
        cart.checkout(300.0);

        // Adding another payment method say crpto, is as simple as creating a new
        // strategy class
        // No changes needed in existing code
        // cart.setPaymentStrategy(new CryptoPayment("myCryptoWalletAddress"));
        // cart.checkout(400.0);
    }
}

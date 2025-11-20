package context;

import strategy.PaymentStrategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        System.out.print(this.paymentStrategy.getClass().getSimpleName() + ":");
        paymentStrategy.pay(amount);
    }
}

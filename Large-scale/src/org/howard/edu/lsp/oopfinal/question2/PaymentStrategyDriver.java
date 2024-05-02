package org.howard.edu.lsp.oopfinal.question2;

/// PaymentStrategyDriver.java
public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Creating instances of payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-1234-0000");
        PaymentStrategy paypalPayment = new PayPalPayment("sunishchit@gmail.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1234abcd");

        // Using different payment methods
        ShoppingCart cart = new ShoppingCart();

        // Set Credit Card Payment
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.0);

        // Set PayPal Payment
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(50.0);

        // Set Bitcoin Payment
        cart.setPaymentStrategy(bitcoinPayment);
        cart.checkout(75.0);
    }
}
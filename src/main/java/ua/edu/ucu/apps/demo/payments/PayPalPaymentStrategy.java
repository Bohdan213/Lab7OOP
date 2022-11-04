package ua.edu.ucu.apps.demo.payments;

public class PayPalPaymentStrategy implements Payment{
    public double pay(double price) {
        return price;
    }
}

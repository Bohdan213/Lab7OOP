package ua.edu.ucu.apps.demo.payments;

public class CreditCardPaymentStrategy implements Payment{
    public double pay(double price) {
        return price;
    }
}

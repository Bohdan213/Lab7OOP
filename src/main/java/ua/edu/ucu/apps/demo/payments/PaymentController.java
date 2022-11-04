package ua.edu.ucu.apps.demo.payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RequestMapping(path="api/v1/flowerBucket")
@RestController
public class PaymentController {
    @GetMapping
    public String start() {
        ArrayList<? extends Payment> list = new ArrayList<>();
        Payment paypal = new PayPalPaymentStrategy();
        Payment creditCard = new CreditCardPaymentStrategy();
        list.add(paypal);
        list.add(creditCard);
        return list.pay();
    }
}

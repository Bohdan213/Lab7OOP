package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ua.edu.ucu.apps.demo.delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.delivery.PostDeliveryStrategy;

import java.util.ArrayList;
import java.util.Random;

public class DeliveryTest {

    @Test
    public void testPrice() {
        ArrayList<Delivery> list = new ArrayList<>();
        Delivery postDelivery = new PostDeliveryStrategy();
        Delivery dhlDelivery = new DHLDeliveryStrategy();
        list.add(postDelivery);
        list.add(dhlDelivery);

        Assertions.assertEquals(list.size(), 2);

    }
}
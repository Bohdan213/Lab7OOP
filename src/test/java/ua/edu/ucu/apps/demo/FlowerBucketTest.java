package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.flowers.Item.flower.Flower;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerType;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower(FlowerType.CACTUS);
        flowerBucket.add(flower);
        Assertions.assertEquals(price * quantity, flowerBucket.price());
    }
}


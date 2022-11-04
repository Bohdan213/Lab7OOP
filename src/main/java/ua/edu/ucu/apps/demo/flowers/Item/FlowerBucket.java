package ua.edu.ucu.apps.demo.flowers.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class FlowerBucket extends Item {
    private final List<Flower> bucket = new ArrayList<>();
    public void add(Flower flower) {
        this.bucket.add(flower);
    }

    public double price() {
        double price = 0;
        for (Flower flowerPack : bucket) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    @Override
    public String toString() {
        return "price: " + price() + " flowers: " + bucket;
    }
}

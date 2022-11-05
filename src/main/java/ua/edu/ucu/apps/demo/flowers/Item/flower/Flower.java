package ua.edu.ucu.apps.demo.flowers.Item.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.demo.flowers.Item.Item;

@Getter @AllArgsConstructor
public class Flower extends Item {
    private FlowerColor color;
    private double sepalLenght;
    private double price;
    private FlowerType flowerType;

    public Flower(FlowerType flowerType) {
        switch (flowerType) {
            case CACTUS -> {
                this.flowerType = flowerType;
                this.color = FlowerColor.GREEN;
                this.sepalLenght = 50;
                this.price = 100;
            }
            case CHAMOMILE -> {
                this.flowerType = flowerType;
                this.color = FlowerColor.WHITE;
                this.sepalLenght = 20;
                this.price = 20;
            }
        }
    }

    @Override
    public String toString() {
        return "price: " + getPrice() + " color " + getColor();
    }

    @Override
    public double price() {
        return this.price;
    }
}

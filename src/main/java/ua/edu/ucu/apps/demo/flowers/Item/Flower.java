package ua.edu.ucu.apps.demo.flowers.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
@Getter @AllArgsConstructor
public class Flower {
    private String color;
    private double sepalLenght;
    private double price;

    @Override
    public String toString() {
        return "price: " + getPrice() + " color " + getColor();
    }
}

package ua.edu.ucu.apps.demo.flowers.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.flowers.Item.flower.Flower;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.flowers.Item.flower.FlowerType;


@RequestMapping(path="api/v1/Item")
@RestController
public class ItemController {
    @GetMapping
    public String hello() {
        Flower flower1 = new Flower(FlowerType.CACTUS);
        Flower flower2 = new Flower(FlowerType.CHAMOMILE);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(flower1);
        bucket.add(flower2);
        return bucket.toString();
    }
}

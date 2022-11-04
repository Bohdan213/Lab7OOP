package ua.edu.ucu.apps.demo.flowers.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(path="api/v1/flowerBucket")
@RestController
public class FlowerBucketController {
    @GetMapping
    public String hello() {
        Flower flower1 = new Flower("green", 13, 14);
        Flower flower2 = new Flower("orange", 4323, 1234);
        FlowerBucket bucket = new FlowerBucket();
        bucket.add(flower1);
        bucket.add(flower2);
        return bucket.toString();
    }
}

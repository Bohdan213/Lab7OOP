package ua.edu.ucu.apps.demo.flowers.Item.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path="api/v1/flower")
@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> hello() {
        return List.of(new Flower(FlowerType.CACTUS),
                new Flower(FlowerType.CHAMOMILE));
    }
}

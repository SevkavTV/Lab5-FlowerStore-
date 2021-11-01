package decorators;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    Item decoratedFlowerPack;
    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setPrice(15);
        flower.setSepalLength(5.5);
        flower.setColor(new int[]{127, 0, 0});
        decoratedFlowerPack = new FlowerPack(flower, 3);
        decoratedFlowerPack = new BasketDecorator(new FlowerPack(flower, 3));
    }

    @Test
    void getPrice() {
        assertEquals(decoratedFlowerPack.getPrice(), 49);
    }
}
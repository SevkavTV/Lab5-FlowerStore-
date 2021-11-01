package decorators;

import flowerstore.Flower;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    Item decoratedFlowerPack;
    @BeforeEach
    void setUp() {
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setPrice(15);
        flower.setSepalLength(5.5);
        flower.setColor(new int[]{127, 0, 0});
        decoratedFlowerPack = new FlowerPack(flower, 3);
        decoratedFlowerPack = new RibbonDecorator(new FlowerPack(flower, 3));
    }

    @Test
    void getPrice() {
        assertEquals(decoratedFlowerPack.getPrice(), 85);
    }
}
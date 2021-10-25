package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(15);
        flower.setSepalLength(5.5);
        flower.setColor(new int[]{127, 0, 0});
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(15, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(5.5, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getColor() {
        int[] flowerColor = flower.getColor();
        int[] expectedFlower = new int[]{127, 0, 0};
        for (int i = 0; i < flowerColor.length; i++) {
            assertEquals(flowerColor[i], expectedFlower[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.ROSE, flower.getFlowerType());
    }
}
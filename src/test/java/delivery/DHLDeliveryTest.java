package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryTest {
    DHLDelivery dhl;
    List<Item> order;

    @BeforeEach
    void setUp() {
        dhl = new DHLDelivery();
        order = new ArrayList<>();
        Flower flower = new Flower(FlowerType.TULIP);
        order.add(flower);
    }

    @Test
    void deliver() {
        assertEquals(dhl.deliver(order), "The items will be delivered by DHL!");
    }
}
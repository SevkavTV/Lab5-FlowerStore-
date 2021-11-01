package delivery;

import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostDeliveryTest {
    PostDelivery post;
    List<Item> order;

    @BeforeEach
    void setUp() {
        post = new PostDelivery();
        order = new ArrayList<>();
        Flower flower = new Flower(FlowerType.ROSE);
        order.add(flower);
    }

    @Test
    void deliver() {
        assertEquals(post.deliver(order), "The items will be delivered by post!");
    }
}
package orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import users.Receiver;
import users.User;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    Order order;
    @BeforeEach
    void setUp() {
        order = new Order();
        User user1 = new Receiver();
        User user2 = new Receiver();
        order.addUser(user1);
        order.addUser(user2);
    }

    @Test
    void order() {
        assertEquals(order.order(), true);
    }
}
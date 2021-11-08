package orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    Order quickOrder;
    @BeforeEach
    void setUp() {
        quickOrder = QuickOrder.makeOrder();
    }

    @Test
    void makeOrder() {
        assertTrue(quickOrder instanceof Order);
    }
}
package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentTest {
    PayPalPayment payment;

    @BeforeEach
    void setUp() {
        payment = new PayPalPayment();
    }

    @Test
    void pay() {
        assertEquals(payment.pay(9.2), "You paid 9.2 successfully with PayPal!");
    }
}
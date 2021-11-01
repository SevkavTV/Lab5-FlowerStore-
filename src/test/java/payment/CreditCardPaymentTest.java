package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentTest {
    CreditCardPayment payment;

    @BeforeEach
    void setUp() {
        payment = new CreditCardPayment();
    }

    @Test
    void pay() {
        assertEquals(payment.pay(12.5), "You paid 12.5 successfully with credit card!");
    }
}
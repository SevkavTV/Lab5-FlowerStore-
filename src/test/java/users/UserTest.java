package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;
    @BeforeEach
    void setUp() {
        user = new Receiver();
    }

    @Test
    void update() {
        assertEquals(user.update("in work"), "Your status as receiver is in work");
    }
}
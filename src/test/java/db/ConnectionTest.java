package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    Connection connection1;
    Connection connection2;
    @BeforeEach
    void setUp() {
        connection1 = Connection.getConnection();
        connection2 = Connection.getConnection();
    }

    @Test
    void getConnection() {
        assertEquals(connection1, connection2);
    }
}
package be.thomasmore.elevator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class ElevatorTest {
    private Elevator elevator;

    @Test
    void nullObject() {
        assertNull(elevator);
    }
}

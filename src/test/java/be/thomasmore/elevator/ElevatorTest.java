package be.thomasmore.elevator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevatorTest {
    private final Elevator elevator = new Elevator();

    @Test
    public void noBadge() {
        String result = elevator.scan(null, 0);
        assertEquals("", result);
    }



    @Test
    public void randomBadge() {
        String result = elevator.scan(new String[]{"405"}, 0);
        assertEquals("0 10", result);
    }
}

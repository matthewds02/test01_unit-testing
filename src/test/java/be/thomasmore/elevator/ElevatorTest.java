package be.thomasmore.elevator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElevatorTest {
    private final Elevator elevator = new Elevator();

    @Test
    public void noBadge() {
        String result = elevator.scan(null);
        assertEquals("", result);
    }

    @Test
    public void noValidBadge() {
        String result = elevator.scan("");
        assertEquals("", result);
    }

    @Test
    public void randomBadge() {
        String result = elevator.scan("405");
        assertEquals("0 10", result);
    }

    @Test
    public void badgeWithTooManyCharacters() {
        String result = elevator.scan("405845");
        System.out.println(result);
        assertEquals("", result);
    }

    @Test
    public void badgeStaff() {
        String result = elevator.scan("S");
        System.out.println(result);
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", result);
    }
}

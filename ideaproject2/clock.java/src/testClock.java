import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testClock {

    @Test
    public void testThatgethour() {
        Clock clock = new Clock(10, 20, 30);
        int hour = clock.getHour();
        assertEquals(10, hour);
    }

    @Test
    public void testThatgetminute() {
        Clock clock = new Clock(10, 20, 30);
        int minute = clock.getMinutes();
        assertEquals(20, minute);
    }

    @Test
    public void testThatgetsecond() {
        Clock clock = new Clock(10, 20, 30);
        int second = clock.getSecond();
        assertEquals(30, second);
    }
}


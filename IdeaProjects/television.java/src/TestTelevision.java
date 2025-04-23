import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTelevision {
    @Test
    public void testThattrunOn(){
        Television television = new Television();
        television.turnOn();
        assertTrue(television.turnOn());

    }
    @Test
    public void testThattrunOff(){
        Television television = new Television();
        television.turnOff();
        assertFalse(television.turnOff());
    }
    @Test
    public void testThatincreasevolume(){
        Television television = new Television();
        television.turnOn();
        television.increaseVolume();
        assertEquals(3, television.volumeLevel());
    }
}

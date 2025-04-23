package assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAirConditional {

    @Test
    public void testThatAirConditionalIsOn(){
        AirConditional airConditional = new AirConditional();
        airConditional.isOn();
        assertTrue(airConditional.isOn());
    }
    @Test
    public void testThatAirConditionalIsOff(){
        AirConditional airConditional = new AirConditional();
        airConditional.isOn();
        airConditional.isOff();
        assertFalse(airConditional.isOn());
    }
    @Test
    public void testTheGetTemperatureOfAirConditional(){
        AirConditional airConditional = new AirConditional();
        airConditional.getTemperature();
        assertEquals(16, airConditional.getTemperature());
    }
    @Test
    public void testTheSetTemperatureOfAirConditional(){
        AirConditional airConditional = new AirConditional();
        airConditional.set(20);
        assertEquals(20, airConditional.getTemperature());
    }
    @Test
    public void testIncreaseTemperatureOfAirConditional(){
        AirConditional airConditional = new AirConditional();
        airConditional.set(16);
        int increasedTemperature = airConditional.increase(2);
        assertEquals(18, increasedTemperature);

        int increasedTemperatureTwo = airConditional.increase(25);
        assertEquals(30, increasedTemperatureTwo);
    }
    @Test
    public void testDecreaseTemperatureOfAirConditional(){
        AirConditional airConditional = new AirConditional();
        int increasedTemperature = airConditional.increase(2);
        assertEquals(18, increasedTemperature);

        int decreaseTemperature = airConditional.decrease(5);
        assertEquals(16, decreaseTemperature);

        int decreaseTemperatureTwo = airConditional.decrease(25);
        assertEquals(16, decreaseTemperatureTwo);



    }
}
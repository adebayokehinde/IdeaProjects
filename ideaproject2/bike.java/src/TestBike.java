

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestBike {

    @Test
    public void testThatBikeisOn(){
        Bike bike = new Bike();
        bike.isOn();
        assertTrue(bike.isOn());
    }
    @Test
    public void testThatBikeisOff(){
        Bike bike = new Bike();
        bike.isOn();
        bike.isOff();
        assertFalse(bike.isOn());
    }
    @Test
    public void testThataccelerate(){
        Bike bike = new Bike();
        bike.isOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }
    @Test
    public void testThatdecelerate(){
        Bike bike = new Bike();
        bike.isOn();
        bike.decelerate();
        assertEquals(-1, bike.getSpeed());
    }

    @Test
    public void updateGear(){
        Bike bike = new Bike();
        bike.isOn();
        bike.updateGear();




    }







}

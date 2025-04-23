import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCar {
    @Test
    public void testGetmodel() {
        Car car1 = new Car("Toyota", "2022", 25000.0);
        Car car2 = new Car("BMW", "2024", 3000000.0);
        assertEquals("Toyota", car1.getmodel());
        assertEquals("BMW", car2.getmodel());
    }

    @Test
    public void testGetYear() {
        Car car1 = new Car("Toyota", "2022", 25000.0);
        Car car2 = new Car("BMW", "2024", 3000000.0);
        assertEquals("2022", car1.getYear());
        assertEquals("2024", car2.getYear());
    }

    @Test
    public void testGetPrice() {
        Car car1 = new Car("Toyota", "2022", 25000.0);
        Car car2 = new Car("BMW", "2024", 3000000.0);
        assertEquals(25000.0, car1.getPrice(), 0);
        assertEquals(3000000.0, car2.getPrice(), 0);
    }

    @Test
    public void testSetPrice() {
        Car car1 = new Car("Toyota", "2022", 25000.0);
        Car car2 = new Car("BMW", "2024", 3000000.0);
        assertEquals(20000.0, car1.getPrice(), 0);
        assertEquals(3000000.0, car2.getPrice(), 0);
    }


    @Test
    public void testApplyDiscount() {

    }
}
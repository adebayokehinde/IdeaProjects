import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPetro {

    @Test
    public void testThatgetstationLocation() {
        Petro petro = new Petro("yaba", "kerosen", 23, 23.0, 5.0);
        petro.getstationLocation();
        assertEquals("yaba", petro.getstationLocation());
    }

    @Test
    public void testThatgetpetroType() {
        Petro petro = new Petro("yaba", "kerosen", 23, 23.0, 5.0);
        petro.getpetroType();
        assertEquals("kerosen", petro.getpetroType());
    }

    @Test
    public void testThatgetpetroQuantity() {
        Petro petro = new Petro("yaba", "kerosen", 23, 23.0, 5.0);
        petro.getpetroQuantity();
        assertEquals(23, petro.getpetroQuantity());

    }
    @Test
    public void testThatgetPricePerLiter() {
        Petro petro = new Petro("yaba", "kerosen", 23, 23.0, 5.0);
        petro.getpricePerLiter();
        assertEquals(23.0, petro.getpricePerLiter());
    }
    @Test
    public void testThatgetpercentageDiscount(){
        Petro petro = new Petro("yaba", "kerosen", 23, 23.0, 5.0);
        petro.getpercentageDiscount();
        assertEquals(0.0, petro.getpercentageDiscount());
    }
    @Test
    public void testThatgetpurchaseAmount() {
        Petro petro = new Petro("yaba", "kerosen", 23, 23.0, 5.0);
        petro.getPurchaseAmount();
        assertEquals(529.0, petro.getPurchaseAmount());
    }
}







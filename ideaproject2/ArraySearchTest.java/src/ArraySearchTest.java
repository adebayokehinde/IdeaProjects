import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArraySearchTest {

    @Test
    public void testSearchValueFound() {
        int[] inputArray = {12, 17, 24, 32, 14};
        int valueToSearch = 24;
        int expectedIndex = 2;
        assertEquals(expectedIndex, ArraySearch.equals(inputArray));
    }



    }


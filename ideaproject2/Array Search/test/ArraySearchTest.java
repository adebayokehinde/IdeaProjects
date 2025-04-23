import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchTest {

    @Test
    public void testArraySearch() {
        int[] inputArray = {12, 17, 24, 32, 14};
        int valueToSearch = 24;
        int expectedIndex = 2;
        int actualIndex = ArraySearch.searchValue(inputArray, valueToSearch);
        assertEquals(expectedIndex, actualIndex);
    }
    @Test
    public void testArraySearch2() {
        int[] inputArray = {12, 17, 24, 32, 14};
        int valueToSearch = 17;
        int expectedIndex = 1;
        assertEquals(expectedIndex, ArraySearch.searchValue(inputArray, valueToSearch));
    }
    @Test
    public void testArraySearch3() {

    }

}
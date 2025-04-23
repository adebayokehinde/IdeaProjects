import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchvaluesTest {

    @Test
    public void testSearchValueFound() {
        int[] inputArray = {12, 17, 24, 32, 14};
        int valueToSearch = 24;
        int expectedIndex = 2;
        assertEquals(expectedIndex, ArrayIndex.searchValue(inputArray, valueToSearch));
    }

    @Test
    public void testSearchValueNotFound() {
        int[] inputArray = {12, 17, 24, 32, 14};
        int valueToSearch = 20;
        int expectedIndex = -1;
        assertEquals(expectedIndex, ArraySearch.searchValue(inputArray, valueToSearch));
    }
}


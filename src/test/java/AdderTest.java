import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class AdderTest {

    @Test
    void testAdd() {
        Adder testObject = new Adder();
        int a = 2;
        int b = 2;
        int expected = 4;
        int actual = testObject.add(a,b);
        Assertions.assertEquals(expected, actual);

    }
}
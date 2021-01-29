import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    @Test
    @ParameterizedTest
    @ValueSource(ints = {4,6,8,10,12,20,100})
    void testDie(int input) {
        Die testDie = new Die(input);
        Boolean actual = false;
        testDie.roll();
        if(testDie.getValue() <= input){
            actual = true;
        }
        Assertions.assertTrue(actual);


    }

    @Test
    void testGetValue() {
    }
}
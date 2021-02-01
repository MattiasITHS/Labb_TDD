import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigClass_MTest {

    @Test
    void testSetAndGetNumber() {
        BigClass_M testObject = new BigClass_M();
        int expected = 0;
        testObject.setNumber(expected);
        Assertions.assertEquals(expected, testObject.getNumber());
    }

    @Test
    void testSetAndGetText() {
        BigClass_M testObject = new BigClass_M();
        String expected = "Hej Maria";
        testObject.setText(expected);
        Assertions.assertEquals(expected,testObject.getText());
    }

    @Test
    void textToUpperCase() {
        BigClass_M testObject = new BigClass_M("hej maria");
        String actual = testObject.textToUpperCase();
        String expected = "HEJ MARIA";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void textToNull() {
        BigClass_M testObject = new BigClass_M();
        String actual = testObject.textToNull("hej maria");
        String expected = null;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void addNumber() {
        BigClass_M testObject = new BigClass_M(7);
        int actual = testObject.addNumber(7);
        int expected = 14;
        Assertions.assertEquals(actual,expected);

    }

    @Test
    void testToString() {
    }
}
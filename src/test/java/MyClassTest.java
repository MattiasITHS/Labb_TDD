import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.time.Duration;

class MyClassTest {

    @BeforeAll
    static void init() {
        System.out.println("Starting testsuite for MyClass.");
    }



    @Test
    void testGenerateTrue(TestInfo testInfo) {
        System.out.println("Started test: " + testInfo.getDisplayName());
        MyClass testObject = new MyClass();     // Test Code
        boolean actual = testObject.generateTrue(); // CUT
        Assertions.assertTrue(actual);              // Assertions
        System.out.println("Test " + testInfo.getDisplayName() + " concluded.");
    }

    @ParameterizedTest
    @DisplayName("Tests method negative().")
    @CsvSource({
            "-5, 5",
            "-10, 10",
            "-20, 20",
            "-100, 100",
            "-1000, 1000",
    })
    void testNegative(int expected, int input) {
        MyClass testObject = new MyClass();     // Test Code
        int actual = testObject.negative(input);    // CUT
        Assertions.assertEquals(expected, actual);  // Assertions
    }


    @Test
    void testGenerateFalse() {
        MyClass testObject = new MyClass();     // Test Code
        boolean actual = testObject.generateFalse(); // CUT
        Assertions.assertFalse(actual);              // Assertions
    }

    @Test
    void testAdd() {
        MyClass testObject = new MyClass();     // Test Code
        int input1 = 5;
        int input2 = 7;
        int expected = 12;
        int actual = testObject.add(input1,input2); // CUT
        Assertions.assertEquals(expected, actual);              // Assertions
    }

    @Test
    void subtract() {
        MyClass testObject = new MyClass();
        int input1 = 5;
        int input2 = 5;
        int expected = 0;
        int actual = testObject.subtract(input1,input2);
        Assertions.assertEquals(expected,actual);
    }

    @RepeatedTest(50)
    @DisplayName("Hur lång tid inc metoden tar att exkevera")
    void testTimeoutInc() {
        MyClass testObject = new MyClass(); //Test code
        Assertions.assertTimeout(Duration.ofMillis(200), () -> testObject.inc(100)); // både CUD och assertions

    }
    @RepeatedTest(50)
    @DisplayName("Testar hur lång tid generateTrue metoden tar att köra")
    void testTimeOutGenerateTrue(){
        MyClass testObject = new MyClass();
        Assertions.assertTimeout(Duration.ofNanos(1), () -> testObject.generateTrue());
    }
    @Test
    void testArraySetZeroesToOnes(){
        ArraySetter testObject = new ArraySetter();  //TEST CODE
        int[] testArray = {0,3,5,1,0,5,0};             // TEST CODE
        int[] expectedArray = {1,3,5,1,1,5,1};          //Test Code
        int[] actualArray = testObject.setZeroToOnes(testArray);  // CUT
        Assertions.assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    void testArraySetZeroesToOnesLength(){
        ArraySetter testObject = new ArraySetter();
        int[] testArrayOk = {1,1,1,1};
        int[] testArrayTooLong = {1,1,1,1,1,1,1,1,1,1,1};
        int expectedOk = 4;
        int expectedTooLong = 10;
        int[] actual = testObject.setZeroToOnes(testArrayOk);  // CUT
        int[]actual2 = testObject.setZeroToOnes(testArrayTooLong);
        Assertions.assertEquals(expectedOk,actual.length);
        Assertions.assertEquals(expectedTooLong,actual2.length);

    }
}
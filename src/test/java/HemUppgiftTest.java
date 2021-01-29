import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HemUppgiftTest {

    @Test
    void testPerson(){
        Person testPerson = new Person("Mattias","Hovde",32,true);
        String expected = "Hovde";
        testPerson.setLastName("Jagersten");
        Assertions.assertEquals(expected, testPerson.getLastName());
    }

    @Test
    void testKorvmojj(){
        Korvmojj testmojj = new Korvmojj();
        Assertions.assertEquals(5,testmojj.amountOfSausagesLeft);
    }
}

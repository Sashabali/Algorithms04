import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {
    @Test
    public void BiggerValueTest () {

        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResult = bv.BiggerValueAlgorithm(3333, 9999);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

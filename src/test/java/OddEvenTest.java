import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddEvenHappyPath () {

    String expectedResult1 = "Odd";

    OddEven oe = new OddEven();
    String actualResult1 = oe.OddEvenAlgorithm(-345);

    Assertions.assertEquals(expectedResult1, actualResult1);

    }

    @Test
    public void testOddEvenHappyPathZero () {
        String expectedResult2 = "Even";

        OddEven oe = new OddEven();
        String actualResult2 = oe.OddEvenAlgorithm(0);

        Assertions.assertEquals(expectedResult2, actualResult2);
    }
    @Test
    public void testOddEvanHappyPath3 () {
        String expectedResult3 = "Even";

        OddEven oe = new OddEven();
        String actualResult3 = oe.OddEvenAlgorithm(222222);

        Assertions.assertEquals(expectedResult3, actualResult3);
    }
    @Test
    public void testOddEvenHappyPath4 () {
        long number = 2147483648L;
        String expectedResult4 = "Undefined";

        OddEven oe = new OddEven();
        String actualResult4 = oe.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult4,actualResult4);
    }
}

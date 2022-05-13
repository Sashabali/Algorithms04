import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    @Test
    public void testSumArrayHappyPath () {
        int [] array1 = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array1);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumArrayHappyPath2 () {
        int [] array2 = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array2);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

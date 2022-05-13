import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {
     @Test
    public void testOddIndicesTestHappyPath () {
        int []  testArray = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 234, 12,68};

        OddIndices oi = new OddIndices();
        int [] actualResult = oi.OddIndicesAlgorithm(testArray);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

}

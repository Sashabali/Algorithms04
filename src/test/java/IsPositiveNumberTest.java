import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
//Напишите алгоритм IsPositiveNumber, который возвращает true,
// если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
//Проверьте работу метода на числах 555, 0 и -555.
    @Test
    public void testIsPositiveNumberHappyPath () {
        int a = 555;
        String expectedResult = "true";

        IsPositiveNumber pn = new IsPositiveNumber();
        String actualResult = pn.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testIsPositiveNumberHappyPath2 () {
        int a = -555;
        String expectedResult = "false";

        IsPositiveNumber pn = new IsPositiveNumber();
        String actualResult = pn.isPositiveNumber(a);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    //Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны
    //-1, если первое число меньше второго
    //1, если первое число больше второго
    //
    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1
    @Test
    public void testAreNumbersEqualHappyPath () {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        AreNumbersEqual eq = new AreNumbersEqual();
        int actualResult = eq.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testAreNumbersEqualHappyPath2 () {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        AreNumbersEqual eq = new AreNumbersEqual();
        int actualResult = eq.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Test
    public void testAreNumbersEqualHappyPath3 () {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        AreNumbersEqual eq = new AreNumbersEqual();
        int actualResult = eq.areNumbersEqual(a,b);

        Assertions.assertEquals(expectedResult,actualResult);
    }
}

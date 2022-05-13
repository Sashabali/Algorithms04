import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReturnNumberTest {
    //Given an integer M perform the following conditional actions:
    //If M is multiple of 3 and 5 then return "Good Number".
    //If M is only multiple of 3 and not of 5 then return "Bad Number"
    //If M is only multiple of 5 and not of 3 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"
    @Test
    public void testReturnNumberHappyPath () {
        int m = 15;
        String expectedResult = "Good Number";

        ReturnNumber rn = new ReturnNumber();
        String actualResult = rn.returnNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnNumberHappyPath2 () {
        int m = 5;
        String expectedResult = "Poor Number";

        ReturnNumber rn = new ReturnNumber();
        String actualResult = rn.returnNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    //@Test
    //public void testReturnNumberHappyPath3 () {
        //int m = 9;
       // String expectedResult= "Bad Number";

       // ReturnNumber rn = new ReturnNumber();
       // String actualResult = rn.returnNumber(m);

      //  Assertions.assertEquals(expectedResult, actualResult);
    //}
@Test
    public void testReturnNumberHappyPath4 () {
        int m = 11;
        String expectedResult = "-1";

        ReturnNumber rn = new ReturnNumber();
        String actualResult = rn.returnNumber(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

public class OddEven {

    public String OddEvenAlgorithm (long a) {
        if (a <= 2147483647L && a >= -2147483648L) {
            if (a % 2 == 0 || a == 0) {

                return "Even";
            } else  {

                return "Odd";
            }
        }

        return "Undefined";
    }
}

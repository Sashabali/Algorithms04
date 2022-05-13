public class BiggerValue {

    public int BiggerValueAlgorithm(int a, int b) {
        if (a == b) {
            return a - b;
        }
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

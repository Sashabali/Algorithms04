public class OddIndices {

    public int [] OddIndicesAlgorithm (int [] array) {

        int length = 0;
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                length++;
            }
        }
        int [] newArr = new int [length];
        for (int i = 0; i <array.length; i++) {
            if (array[i] % 2 == 0) {
                newArr[j] = array[i];
                j++;
            }
        }
        return newArr;

    }
}

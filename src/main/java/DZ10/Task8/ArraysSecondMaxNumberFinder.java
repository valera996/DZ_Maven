package DZ10.Task8;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArraysSecondMaxNumberFinder {
    //Старый вариант
//    public int findSecondMax(int[] numbers) {
//       return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
//
//    }
//

    //доработанный метод
    public int findSecondMax(int[] numbers) {
        int[] distinct = Arrays.stream(numbers).distinct().sorted().toArray();
        if (distinct.length < 2) {
            throw new NoSuchElementException();
        }
        return distinct[distinct.length - 2];
    }
}
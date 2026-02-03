package DZ10.Task8;

import java.util.Arrays;

public class ArraysSecondMaxNumberFinder {
    public int findSecondMax(int[] numbers) {
        return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
    }
}

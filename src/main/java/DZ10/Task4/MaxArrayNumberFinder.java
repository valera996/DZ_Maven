package DZ10.Task4;

import java.util.Arrays;

public class MaxArrayNumberFinder {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}

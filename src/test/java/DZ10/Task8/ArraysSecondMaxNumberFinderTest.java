package DZ10.Task8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.NoSuchElementException;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArraysSecondMaxNumberFinderTest extends ArraysSecondMaxNumberFinderTestSetUp{

    /**
     Позитивные сценарии
     1) Обычный массив больше 1 числа, позитивные числа [1,2,3,4,5] -> 4
     2) Обычный массив больше 1 числа , отрицательные числа [-1,-2,-3,-4,-5] -> -2
     Негативные сценарии
     1) Пустой массив -> NoSuchElementException
     2) Массив с одинаковыми числами -> NoSuchElementException
     3) Массив с одним числом -> NoSuchElementException
     */

    public static Stream<Arguments> arrayForTest(){
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5},4),
                Arguments.of(new int[]{-1,-2,-3,-4,-5}, -2)
        );
    }
    @DisplayName("Поиск второго макс числа массива из более чем одного положительного и не положительного числа")
    @ParameterizedTest
    @MethodSource("arrayForTest")
    public void findSecondMaxNumberFromMoreThanOneDigitArray(int[] array, int expectedResult){
        int actualResult = arraysSecondMaxNumberFinder.findSecondMax(array);
        assertEquals(expectedResult,actualResult);
    }


    public static Stream<Arguments> invalidArrayForTest(){
        return Stream.of(
                Arguments.of(new int[]{1}),
                Arguments.of(new int[]{1,1,1,1,1}),
                Arguments.of(new int[]{})
        );
    }
    @DisplayName("Поиск второго макс числа не валибного массива : из одного число, пустого массива, массива с одинаковыми числами")
    @ParameterizedTest
    @MethodSource("invalidArrayForTest")
    public void findSecondMaxNumberFromInvalidArray(int[] array){
        assertThrows(NoSuchElementException.class,() -> {
            arraysSecondMaxNumberFinder.findSecondMax(array);
        });
    }

}

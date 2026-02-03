package DZ10.Task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxArrayNumberFinderTest {
    /**
     Позитивные сценарии
     1)Поиск макс числа в обычном массиве [1,2,3,4,5] -> 5
     2)Поиск макс числа в массиве с одним числом [1] -> 1
     3)Поиск макс числа в массиве с отрицательными числами [-1,-2,-3,-4,-5] -> -1
     Негативный сценарий
     1)Поиск макс числа в пустом массиве [] -> NoSuchElementException
     */
    private MaxArrayNumberFinder maxArrayNumberFinder;
    @BeforeEach
    public void setUp(){
        maxArrayNumberFinder = new MaxArrayNumberFinder();
    }


    public static Stream<Arguments> arraysForTest(){
        return Stream.of(
                Arguments.of(new int[]{1,2,3,4,5},5),
                Arguments.of(new int[]{1},1),
                Arguments.of(new int[]{-1,-2,-3,-4,-5},-1)
        );
    }

    @DisplayName("Поиск макс числа в обычном массиве, в массиве с отрицательными числами, в массиве с одним числом")
    @ParameterizedTest
    @MethodSource("arraysForTest")
    public void findMaxArrayNumberFromValidArray(int[] array,int expectedResult){
        int actualResult = maxArrayNumberFinder.findMax(array);
        assertEquals(expectedResult,actualResult);

    }
    @DisplayName("Выброс исколючения при попытке найти макс число в пустом массиве")
    @Test
    public void findMaxArrayNumberFromEmptyArray(){
        assertThrows(NoSuchElementException.class, () -> {
            maxArrayNumberFinder.findMax(new int[]{});
        });
    }

}

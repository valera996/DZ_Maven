package DZ10.Task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculationTest {

    /**
     Позитивные сценарии
     1) положительное число 1 -> 1, 5 -> 120, 7 -> 5040
     Негативные сценарии
     1) отрицательное число -5 -> IllegalArgumentException
     Угловые сценарии
     1) число 0 -> 1
     */
    private FactorialCalculation factorialCalculation;
    @BeforeEach
    public void setUp(){
        factorialCalculation = new FactorialCalculation();
    }

    @DisplayName("Факториал от положительного числа")
    @ParameterizedTest
    @CsvSource({
            "'1','1'",
            "'5','120'",
            "'7','5040'"
    })
    public void factorialCalculationWithPositiveNumber(int initialNumber, int expectedResult){
        int actualResult = factorialCalculation.factorial(initialNumber);
        assertEquals(expectedResult,actualResult);
    }
    @DisplayName("Выброс исключения при попытке рассчитать факториал отрицательного числа")
    @Test
    public void factorialCalculationWithNegativeNumber(){
        assertThrows(IllegalArgumentException.class,() ->{
            int actualResult = factorialCalculation.factorial(-5);
        });
    }
   @DisplayName("Факториал от 0")
    @Test
    public void factorialCalculationWithNullNumber(){
        int actualResult = factorialCalculation.factorial(0);
        assertEquals(1,actualResult);
    }

}

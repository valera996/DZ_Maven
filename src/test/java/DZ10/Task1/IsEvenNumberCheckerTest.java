package DZ10.Task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class IsEvenNumberCheckerTest {

    /**
     Позитивные сценарии
     1) Проверка четного числа 4 -> true
     2) Проверка нуля 0 -> true
     3) Проверка отрицательного четного числа -6 -> true
     Негативные сценарии
     1) Проверка нечётного числа 5 -> false
     2) Проверка отрицательного нечётного числа -7 -> false
     */
    private IsEvenNumberChecker evenNumberChecker;
    @BeforeEach
    public void setUp(){
        evenNumberChecker = new IsEvenNumberChecker();
    }

    @DisplayName("Проверка позитивного четного числа")
    @Test
    public void isEvenNumberCheckPositiveEvenNumber(){
        boolean actualResult = evenNumberChecker.isEven(4);
        assertTrue(actualResult);
    }

    @DisplayName("Проверка отрицательного четного числа")
    @Test
    public void isEvenNumberCheckNegativeEvenNumber(){
        boolean actualResult = evenNumberChecker.isEven(-6);
        assertTrue(actualResult);
    }

    @DisplayName("Проверка числа 0")
    @Test
    public void isEvenNumberCheckNullNumber(){
        boolean actualResult = evenNumberChecker.isEven(0);
        assertTrue(actualResult);
    }

    @DisplayName("Проверка положительного нечетного числа")
    @Test
    public void isEvenNumberCheckPositiveOddNumber(){
        boolean actualResult = evenNumberChecker.isEven(5);
        assertFalse(actualResult);
    }
    @DisplayName("Проверка отрицательного нечетного числа")
    @Test
    public void isEvenNumberCheckNegativeOddNumber(){
        boolean actualResult = evenNumberChecker.isEven(-7);
        assertFalse(actualResult);
    }






}

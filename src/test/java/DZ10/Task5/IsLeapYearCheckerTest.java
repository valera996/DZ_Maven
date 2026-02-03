package DZ10.Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsLeapYearCheckerTest {

    /**
     Позитивные сценарии
     1)Проверка весокосного года, который % 4 == 0 && % 100 != 0: 2020 -> true
     2)Проверка весокосного года, который % 4 == 0 , % 100 == 0, но % 400 == 0: 2000 -> true, 1600 -> true
     Негаривные сценарии
     1)Проверка невесокосного года, который % 4 != 0 && % 100 != 0 и % 400 != 0: 2019, 2021, 2022 -> false
     2)Проверка невесокосного года, который % 4 == 0 && % 100 == 0 и % 400 != 0: 1900, 2100 -> false
     Угловые сценарии
     1) 0, 4, 400 -> true
     */


    private IsLeapYearChecker isLeapYearChecker;
    @BeforeEach
    public void setUp(){
        isLeapYearChecker = new IsLeapYearChecker();
    }

    @DisplayName("Проверка високосного года")
    @ParameterizedTest
    @ValueSource(ints = {2020, 2000, 1600, 0, 4, 400})
    public void isLeapYearCheckerWithLeapYear(int leapYear){
        boolean actualResult = isLeapYearChecker.isLeapYear(leapYear);
        assertTrue(actualResult);
    }

    @DisplayName("Проверка не високосного года")
    @ParameterizedTest
    @ValueSource(ints = {2019, 2021, 2022, 1900, 2100})
    public void isLeapYearCheckerWithNotLeapYear(int notLeapYear){
        boolean actualResult  = isLeapYearChecker.isLeapYear(notLeapYear);
        assertFalse(actualResult);
    }


}

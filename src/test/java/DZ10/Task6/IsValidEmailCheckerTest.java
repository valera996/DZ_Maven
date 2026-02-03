package DZ10.Task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.regex.PatternSyntaxException;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidEmailCheckerTest {

    /**
     Позититивные сценарии
     1)Корректный email "test@example.com" -> true
     Негатиынй сценарий
     1)email без части после @ "bad@.com" -> false
     2)email без @ и части после @   "no-at-symbol" -> false
     Угловой сценарий
     1) email null -> false
     */

    private IsValidEmailChecker isValidEmailChecker;
    @BeforeEach
    public void setUp(){
        isValidEmailChecker = new IsValidEmailChecker();
    }

    @DisplayName("Проверка валидного email ")
    @Test
    public void isValidEmailCheckerWithValidEmail(){
        boolean actualResult = isValidEmailChecker.isValidEmail("test@example.com");
        assertTrue(actualResult);
    }

    @DisplayName("Проверка не валидного email ")
    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol"})
    public void isValidEmailCheckerWithInvalidEmail(String email){
        boolean actualResult = isValidEmailChecker.isValidEmail(email);
        assertFalse(actualResult);
    }

    @DisplayName("Проверка email null")
    @Test
    public void isValidEmailCheckerWithInvalidEmail(){
        boolean actualResult = isValidEmailChecker.isValidEmail(null);
        assertFalse(actualResult);
    }

}

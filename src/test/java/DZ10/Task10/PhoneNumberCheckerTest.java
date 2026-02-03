package DZ10.Task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberCheckerTest {

    /**
     Позитивные сценарии
     1)Валидный нормер телефона "+1 1234567890" -> true
     Негативныые сценарии
     1)Не валидный номер телеофна "12345", "invalid" -> false
     Угловой сценарий
     1) Номер телефона null -> IllegalArgumentException
     */

    private PhoneNumberChecker phoneNumberChecker;
    @BeforeEach
    public void setUp(){
        phoneNumberChecker = new PhoneNumberChecker();
    }


    @DisplayName("Проверка валидного номера")
    @Test
    public void isValidPhoneNumberWithValidNumber(){
        boolean actualResult = phoneNumberChecker.isValidPhoneNumber("+1 1234567890");
        assertTrue(actualResult);
    }

    @DisplayName("Проверка не валидных номеров")
    @ParameterizedTest
    @ValueSource(strings = {"12345", "invalid"})
    public void isValidPhoneNumberWithInvalidNumber(String phoneNumber){
        boolean actualResult = phoneNumberChecker.isValidPhoneNumber(phoneNumber);
        assertFalse(actualResult);
    }
    @DisplayName("Выброс исключения NullPointerException при проверке номера null")
    @Test
    public void isValidPhoneNumberWithNullNumber(){
        assertThrows(NullPointerException.class, () ->{
            phoneNumberChecker.isValidPhoneNumber(null);
        });
    }

}

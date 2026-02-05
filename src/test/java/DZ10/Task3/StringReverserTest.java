package DZ10.Task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringReverserTest extends StringReverserSetUp{

    /**
     Позитивные сценарии
     1)строка содержащая буквы "яблоко" -> "околбя"
     2)строка содержащая цифры "123" -> "321"
     Негативные сценарии
     1)строка null -> null
     Углавые сценарии
     1) пустая строка "" -> ""
     */


    @DisplayName("Разворот не пустых строк, содержащих буквы и цифры")
    @ParameterizedTest
    @CsvSource({"'яблоко','околбя'","'123','321'"})
    public void reverseValidString(String initialString, String expectedResult){
        String actualResult = stringReverser.reverse(initialString);
        assertEquals(expectedResult,actualResult);
    }
    @DisplayName("Разворот строки null")
    @Test
    public void reverseNullString(){
        String actualResult = stringReverser.reverse(null);
        assertNull(actualResult);
    }
    @DisplayName("Разворот пустой строки")
    @Test
    public void reverseEmptyString(){
        String actualResult = stringReverser.reverse("");
        assertEquals("",actualResult);
    }

}

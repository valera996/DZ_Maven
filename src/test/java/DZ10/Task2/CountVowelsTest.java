package DZ10.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest {
    /**
     Позитивные сценарии
     1) Проверка количества гласных букв в слове содержащим гласные буквы "hello" -> 2, "java" ->2 , "AEIOU" ->5
     Негативные сценарии
     1)Проверка количества гласных букв в слове не содержащим гласные буквы "GGGgg" -> 0
     Угловые сценарии
     1)Проверка количества гласных букв в Null -> IllegalArgumentException
     2)Проверка количества гласных букв в "" -> IllegalArgumentException
     */

    private  CountVowels countVowels;
    @BeforeEach
    public void setUp(){
        countVowels = new CountVowels();
    }

    @DisplayName("Рассчет количества гласных в словах содержащих гласные буквы")
    @ParameterizedTest
    @CsvSource({
            "'hello', '2'",
            "'java', '2'",
            "'AEIOU', '5'"
    })
    public void countVowelsOfStringWithVowels(String word,int expectedResult){
        int actualResult = countVowels.countVowels(word);
        assertEquals(expectedResult,actualResult);
    }
    @DisplayName("Рассчет количества гласных в слове не содержащим гласные буквы")
    @Test
    public void countVowelsOfStringWithOutVowels(){
        int actualResult = countVowels.countVowels("GGGgg");
        assertEquals(0,actualResult);
    }
    @DisplayName("Выброс исключения при поптыке рассчитать гласные в null")
    @Test
    public void countVowelsOfStringNull(){
        assertThrows(IllegalArgumentException.class,() ->{
            countVowels.countVowels(null);
        });
    }
    @DisplayName("Рассчет количества гласных в пустой строке '' ")
    @Test
    public void countVowelsOfEmptyString(){
        int actualResult = countVowels.countVowels("");
        assertEquals(0,actualResult);
    }

}

package DZ10.Task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CounterWordsTest {
    /**
     Позитивные сценарии
     1) Строка с одним словом, без пробелов "яблоко" -> 1
     2) Строка с несколькими словами, с пробелами "яблоко очень вкусное" -> 3
     3) Строка пустая "" -> 0
     Негативные сценарии
     1) Строка null -> IllegalArgumentException
     */
    private CounterWords counterWords;
    @BeforeEach
    public void setUp(){
        counterWords = new CounterWords();
    }

    @DisplayName("Подсчет слов валидных строк: без пробелов, с пробелами, пустая строка")
    @ParameterizedTest
    @CsvSource({
            "'яблоко','1'",
            "'яблоко очень вкусное','3'",
            "'','0'"
    })
    public void countWordsFromValidString(String sentence, int expectedResult){
    int actualResult = counterWords.countWords(sentence);
    assertEquals(expectedResult,actualResult);
    }

    @DisplayName("Выброс исключения при попытке посчитать строку null")
    @Test
    public void countWordsFromNullString(){
        assertThrows(NullPointerException.class, () -> {
            counterWords.countWords(null);
        });
    }
}

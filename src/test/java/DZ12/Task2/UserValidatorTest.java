package DZ12.Task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest extends UserValidatorSetUp {

    /**
     -Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
     Позитивные сценарии:
     1)Проверка юзера с именем начинающимся с заглавной буквы, флаг валидатора true -> ОР true
     Негативные сценарии:
     1)Проверка юзера с именем начинающимся с прописной буквы, флаг валидатора true -> ОР InvalidUserException
     2)Проверка юзера с пустым именем, флаг валидатора true -> ОР InvalidUserException
     3)Проверка юзера с именем null , флаг валидатора true -> ОР InvalidUserException
     Угловой сценарий
     1)Проверка юзера с именем начинающимся с прописной буквы, флаг валидатора false -> ОР true
     2)Проверка юзера с пустым именем, флаг валидатора false -> ОР true
     3)Проверка юзера с именем null , флаг валидатора false -> ОР true

     -Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
     Позитивные сценарии:
     1)Проверка юзера с возрастом 18, 19, 99, 100 лет, флаг валидатора true -> ОР true
     Негативные сценарии:
     1)Проверка юзера с возрастом 17 лет, 101 год, флаг валидатора true -> ОР InvalidUserException
     Угловой сценарий
     1)Проверка юзера с возрастом 17 лет, 101 год, флаг валидатора false -> ОР true


     -Проверка email: Email должен соответствовать стандартному формату электронной почты.
     Позитивные сценарии:
     1)Проверка юзера с валидным email, флаг валидатора true -> ОР true
     Негативные сценарии:
     1)Проверка юзера с не валидным email, флаг валидатора true -> ОР InvalidUserException
     Угловой сценарий
     1)Проверка юзера с не валидным email, флаг валидатора false -> ОР true

     */
    @DisplayName("Проверка юзера с именем начинающимся с заглавной буквы, флаг валидатора true")
    @Test
    public void checkUserByValidNameWithValidatorStatusTrue(){
        User user = new User("Boba",20,"email@mail.ru");
        assertTrue(userValidator.checkUserByName(user));
    }

    public static Stream<Arguments> usersWithInvalidNameForTest(){
        return Stream.of(
                Arguments.of( new User("",20,"email@mail.ru")),
                Arguments.of(new User(null,20,"email@mail.ru")),
                Arguments.of(new User("boba",20,"email@mail.ru"))
        );
    }
    @DisplayName("Проверка юзера с именем начинающимся с прописной буквы/с именем null/с пустым именем, флаг валидатора true")
    @ParameterizedTest
    @MethodSource("usersWithInvalidNameForTest")
    public void checkUserByInvalidNameWithValidatorStatusTrue(User user){
         assertThrows(InvalidUserException.class, () -> userValidator.checkUserByName(user));
    }


    @DisplayName("Проверка юзера с именем начинающимся с прописной буквы/с именем null/с пустым именем, флаг валидатора false")
    @ParameterizedTest
    @MethodSource("usersWithInvalidNameForTest")
    public void checkUserByInvalidNameWithValidatorStatusFalse(User user){
        userValidator.setValidationEnabled(false);
        assertTrue(userValidator.checkUserByName(user));
    }

    public static Stream<Arguments> usersWithValidAgeForTest(){
        return Stream.of(
                Arguments.of(new User("Boba",18,"email@mail.ru")),
                Arguments.of(new User("Boba",19,"email@mail.ru")),
                Arguments.of(new User("Boba",99,"email@mail.ru")),
                Arguments.of(new User("Boba",100,"email@mail.ru"))
                );
    }
    @DisplayName("Проверка юзера с возрастом 18, 19, 99, 100 лет, флаг валидатора true")
    @ParameterizedTest
    @MethodSource("usersWithValidAgeForTest")
    public void checkUserByValidAgeWithValidatorStatusTrue(User user){
        assertTrue(userValidator.checkUserByAge(user));
    }


    public static Stream<Arguments> usersWithInvalidAgeForTest(){
        return Stream.of(
                Arguments.of(new User("Boba",17,"email@email.ru")),
                Arguments.of(new User("Boba",101,"email@email.ru"))
        );
    }
    @DisplayName("Проверка юзера с возрастом 17 лет, 101 год, флаг валидатора true")
    @ParameterizedTest
    @MethodSource("usersWithInvalidAgeForTest")
    public void checkUserByInvalidAgeWithValidatorStatusTrue(User user){
        assertThrows(InvalidUserException.class, () -> userValidator.checkUserByAge(user));
    }

    @DisplayName("Проверка юзера с возрастом 17 лет, 101 год, флаг валидатора false")
    @ParameterizedTest
    @MethodSource("usersWithInvalidAgeForTest")
    public void checkUserByInvalidAgeWithValidatorStatusFalse(User user){
        userValidator.setValidationEnabled(false);
        assertTrue(userValidator.checkUserByAge(user));
    }

    @DisplayName("Проверка юзера с валидным email, флаг валидатора true")
    @Test
    public void checkUserByValidEmailWithValidatorStatusTrue(){
        User user = new User("Boba", 20,"email@email.ru");
        assertTrue(userValidator.checkUserByEmail(user));
    }

    @DisplayName("Проверка юзера с не валидным email, флаг валидатора true")
    @Test
    public void checkUserByInvalidEmailWithValidatorStatusTrue(){
        User user = new User("Boba", 20,"emailemail.ru");
        assertThrows(InvalidUserException.class, () -> userValidator.checkUserByEmail(user));
    }

    @DisplayName("Проверка юзера с не валидным email, флаг валидатора False")
    @Test
    public void checkUserByInvalidEmailWithValidatorStatusFalse(){
        userValidator.setValidationEnabled(false);
        User user = new User("Boba", 20,"emailemail.ru");
        assertTrue(userValidator.checkUserByEmail(user));
    }

}

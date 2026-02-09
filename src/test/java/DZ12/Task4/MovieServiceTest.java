package DZ12.Task4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieServiceTest extends MovieServiceTestSetUp {

    /**
     Метод для добавления оценки к фильму.
      Позитивный сценарий
     1)Добавление оценки  1, 2, 9, 10 к уже существующему в списке фильму -> ОР оценка добавлена к остальным оценкам в список рейтинга фильма
     2)Добавление оценки  1, 2, 9, 10 к ещё не существующему в списке фильму -> ОР фильм и оценка содержится в списке
     Негативный сценарий
     1)Добавление оценки 0, 11 -> ОР IllegalArgumentException

     Расчет средней оценки для каждого фильма.
      Позитивный сценарий
     1)Расчет средней оценки фильмов при не пустом списке рейтинга -> ОР таблица с ключом -фильм- и значнием -средним из всех оценок-
      Негативный сценарий
     2)Расчет средней оценки фильмов при пустом списке рейтинга -> ОР созданная мапа пустая

     Сортировка фильмов по средней оценке.
      Позитивный сценарий
     1)Сортировка фильмов при не пустом списке рейтинга -> ОР все фильмы отсортированы по возрастанию средней оценки
      Негативный сценарий
     1)Сортировка фильмов при пустом списке рейтинга -> ОР созданная мапа пустая

     */

    public static Stream<Arguments> validRatingForFilm(){
        return Stream.of(
                Arguments.of(new Movie("Пираты"), new Rating<Integer>(1)),
                Arguments.of(new Movie("Пираты"), new Rating<Integer>(2)),
                Arguments.of(new Movie("Пираты"), new Rating<Integer>(9)),
                Arguments.of(new Movie("Пираты"), new Rating<Integer>(10))
        );
    }

    @DisplayName("Добавление оценки  1, 2, 9, 10 к ещё не существующему в списке фильму")
    @ParameterizedTest
    @MethodSource("validRatingForFilm")
    public void addRatingForNotContainedFilm(Movie movie, Rating<Integer> rating){
        movieService.addRating(movie,rating);
        assertTrue(movieService.getAll().get(movie).contains(rating));
    }

    @DisplayName("Добавление оценки  1, 2, 9, 10 к уже существующему в списке фильму")
    @ParameterizedTest
    @ValueSource(ints ={
            1,2,9,10
    })
    public void addRatingForContainedFilm(int numberForRating){
        Movie pirates = new Movie("Пираты");
        Rating<Integer> firstGrade = new Rating<Integer>(5);
        movieService.addRating(pirates, firstGrade);

        Rating<Integer> rating = new Rating<Integer>(numberForRating);

        movieService.addRating(pirates,rating);
        assertTrue(movieService.getAll().get(pirates).contains(firstGrade)&& movieService.getAll().get(pirates).contains(rating));
    }

    @DisplayName("Добавление не валидной оценки 0, 11")
    @ParameterizedTest
    @ValueSource(ints = {0,11})
    public void addInvalidRatingFilm(int numberForRating){
        Movie pirates = new Movie("Пираты");
        Rating<Integer> rating = new Rating<Integer>(numberForRating);

        assertThrows(IllegalArgumentException.class, () -> movieService.addRating(pirates,rating));
    }

    @DisplayName("Расчет средней оценки фильмов при не пустом списке рейтинга")
    @Test
    public void averageRatingOfAllFilms(){
        Movie pirates = new Movie("Пираты");
        Rating<Integer> rating = new Rating<>(2);
        Rating<Double> rating2 = new Rating<>(4.0);

        movieService.addRating(pirates,rating);
        movieService.addRating(pirates,rating2);

        assertTrue(movieService.averageRatingOfAllFilm().containsKey(pirates)
                && movieService.averageRatingOfAllFilm().get(pirates) == 3.0);
    }
    @DisplayName("Расчет средней оценки фильмов при пустом списке рейтинга")
    @Test
    public void averageOfEmptyRatingList(){

        assertTrue(movieService.averageRatingOfAllFilm().isEmpty());
    }

    @DisplayName("Сортировка фильмов при не пустом списке рейтинга")
    @Test
    public void sortFilmsByRatingOfNotEmptyMap(){
        Movie pirates = new Movie("Пираты");
        Movie stitch = new Movie("Стич");
        Rating<Integer> rating = new Rating<>(2);
        Rating<Double> rating2 = new Rating<>(4.0);

        movieService.addRating(pirates,rating);
        movieService.addRating(pirates,rating2);
        movieService.addRating(stitch,rating2);

        assertTrue(movieService.sortFilmsByRating().firstEntry().getKey().equals(pirates));
    }
    @DisplayName("Сортировка фильмов при пустом списке рейтинга")
    @Test
    public void sortFilmsByRatingOfEmptyMap(){
        assertTrue(movieService.sortFilmsByRating().isEmpty());
    }

}

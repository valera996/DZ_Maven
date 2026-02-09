package DZ12.Task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    /**
      Метод для добавления оценки
     Позитивный сценарий
     1) Добавление оценки больше 0 -> ОР студент,предмет,оценка доюавлены в список
     Негативные сценарии
     1) Добавление оценки меньше 0 -> ОР InvalidGradeException

      Метод для расчёта среднего значения оценок по конкретному предмету
     Позитивный сценарий
     1)Рассчет средней оценки по предмету, который есть в списке -> ОР средняя оценка по запрашиваемому предмету
     Негативный сценарий
     1)Рассчет средней оценки по предмету, которого нет в списке -> ОР NoSuchElementException

     */
    protected GradeService gradeService;
    @BeforeEach
    public void setUp(){
        gradeService = new GradeService();
    }




    @DisplayName("Добавление оценки больше 0")
    @Test
    public void addValidGrade(){
        StudentGrade<Integer> student = new StudentGrade<>("Vanya","Math",5);
        gradeService.addGrade(student);

        assertTrue(gradeService.getAll().contains(student));
    }

    @DisplayName("Добавление оценки меньше 0")
    @Test
    public void addInvalidGrade(){
        StudentGrade<Integer> student = new StudentGrade<>("Vanya","Math",-5);

        assertThrows(InvalidGradeException.class, () -> gradeService.addGrade(student));
    }

    @DisplayName("Рассчет средней оценки по предмету, который есть в списке")
    @Test
    public void averageGradeOfContainedSubject(){
        StudentGrade<Integer> student = new StudentGrade<>("Vanya","Math",5);
        StudentGrade<Integer> student2 = new StudentGrade<>("Petya","Math",5);

        gradeService.addGrade(student);
        gradeService.addGrade(student2);

        double expectedAverage = 5.0;
        assertEquals(expectedAverage,gradeService.averageGradeOfSubject("Math"));
    }

    @DisplayName("Рассчет средней оценки по предмету, которого не в списке")
    @Test
    public void averageGradeOfNotContainedSubject(){
        StudentGrade<Integer> student = new StudentGrade<>("Vanya","Math",5);
        gradeService.addGrade(student);

        assertThrows(NoSuchElementException.class, () -> gradeService.averageGradeOfSubject("Физра"));
    }

}

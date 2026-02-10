package DZ12.Task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskServiceTest {

    /**

     Метод для добавления новой задачи в список.
            Позитивный сценарий:
        1)Добавление задачи с уникальным id -> ОР задча добавлена в список
            Негативный сценарий:
        1)Добавление задачи с неуникальным id -> ОР задача не добавлена в список


     Метод для удаления задачи по ID.
            Позитивный сценарий:
        1)Удаление задачи по id содержащемуся в списке -> ОР задча с введём id удалена из списка
             Негативный сценарий:
        1)Удаление задачи по id не содержащемуся в списке -> ОР список не изменился


     Методы для фильтрации задач по статусу.
            Позитивный сценарий:
        1)Фильтрация списка содержащего задачи с искомым статусом -> ОР список содержит только задачи с соответствующим статусом
            Негативный сценарий:
        1)Фильтрация списка не содержащего задачи с искомым статусом -> ОР список пуст


     Методы для фильтрации задач по приоритету.
            Позитивный сценарий:
        1)Фильтрация списка содержащего задачи с искомым приоритетом -> ОР список содержит только задачи с соответствующим приоритетом
            Негативный сценарий:
        1)Фильтрация списка не содержащего задачи с искомым приоритетом -> ОР список пуст



     Методы для сортировки задач по дате.
            Позитивный сценарий:
        1)Сортировка не пустого списка задач -> ОР отсоритированный по дате список(от более старых задач к новым)

     */

    private TaskService taskService;

    @BeforeEach
    public void setUp(){
        taskService = new TaskService();
    }



    @DisplayName("Добавление задачи с уникальным id ")
    @Test
    public void addTaskWithUniqueId(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));

        taskService.addTask(task);
        assertTrue(taskService.getAll().contains(task));
    }

    @DisplayName("Добавление задачи с неуникальным id ")
    @Test
    public void addTaskWithNotUniqueId(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        Task<Integer> task2 = new Task(1,"InProgress","High", LocalDate.of(2025,03,11));
        taskService.addTask(task);
        taskService.addTask(task2);
        assertTrue(taskService.getAll().contains(task) && taskService.getAll().size() == 1);
    }

    @DisplayName("Удаление задачи по id содержащемуся в списке")
    @Test
    public void removeTaskByContainedAtListId(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        taskService.addTask(task);
        taskService.removeTask(1);

        assertTrue(taskService.getAll().isEmpty());
    }
    @DisplayName("Удаление задачи по id не содержащемуся в списке")
    @Test
    public void removeTaskByNotContainedAtListId(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        taskService.addTask(task);
        taskService.removeTask(2);

        assertTrue(taskService.getAll().contains(task));
    }

    @DisplayName("Фильтрация списка содержащего задачи с искомым статусом")
    @Test
    public void filterTaskByContainedAtListStatus(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        Task<Integer> task2 = new Task(2,"InProgress","Low", LocalDate.of(2026,02,11));
        taskService.addTask(task);
        taskService.addTask(task2);

        assertTrue(taskService.filterTaskByStatus("New").contains(task)
                && taskService.filterTaskByStatus("New").size() == 1);
    }
    @DisplayName("Фильтрация списка не содержащего задачи с искомым статусом")
    @Test
    public void filterTaskByNotContainedAtListStatus(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        Task<Integer> task2 = new Task(2,"InProgress","Low", LocalDate.of(2026,02,11));
        taskService.addTask(task);
        taskService.addTask(task2);

        assertTrue(taskService.filterTaskByStatus("Done").isEmpty());
    }


    @DisplayName("Фильтрация списка содержащего задачи с искомым приоритетом")
    @Test
    public void filterTaskByContainedAtListPriority(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        Task<Integer> task2 = new Task(2,"InProgress","High", LocalDate.of(2026,02,11));
        taskService.addTask(task);
        taskService.addTask(task2);

        assertTrue(taskService.filterTaskByPriority("Low").contains(task)
        && taskService.filterTaskByPriority("Low").size() == 1);
    }
    @DisplayName("Фильтрация списка несодержащего задачи с искомым приоритетом")
    @Test
    public void filterTaskByNotContainedAtListPriority(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,10));
        Task<Integer> task2 = new Task(2,"InProgress","High", LocalDate.of(2026,02,11));
        taskService.addTask(task);
        taskService.addTask(task2);

        assertTrue(taskService.filterTaskByPriority("Medium").isEmpty());
    }

    @DisplayName("Сортировка не пустого списка задач")
    @Test
    public void sortTaskByDate(){
        Task<Integer> task = new Task(1,"New","Low", LocalDate.of(2026,02,11));
        Task<Integer> task2 = new Task(2,"InProgress","High", LocalDate.of(2026,02,10));

        taskService.addTask(task);
        taskService.addTask(task2);

        assertTrue(taskService.sortTaskByDate().getFirst().equals(task2));

    }

}

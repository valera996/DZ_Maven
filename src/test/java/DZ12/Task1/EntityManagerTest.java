package DZ12.Task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest extends EntityManagerSetUp {

    /**
     -Метод для добавления объекта в коллекцию
     Позитивные сценарии:
     1)Добавление сущности с типом данных Entities -> ОР сущность добавлена в список
     Негативные сценарии:
     ???? 2)Попытка добавления сущности с типом данных не Entities -> ОР сущность добавлена в список -> Выбрасывается исколючение

     -Метод для удаления объекта из коллекции.
     Позитивные сценарии:
     1)Удаление существующего в коллекции объекта -> ОР сущности нет в коллекции, возвращается true
     Негативные сценарии:
     2)Удаление не существующего в коллекции объекта -> ОР  возвращается false

     -Метод для получения копии списка всех элементов.
     Позитивные сценарии:
     1)Вызов метода для колллекции содежащая сущности -> ОР копия равна оригиналу
     Угловой сценарий:
     1)Вызов метода для пустой колллекции -> ОР список пуст

     -Метод для фильтрации по возрасту.
     Позитивные сценарии:
     1)Попытка отфильровать коллекцию по диапазону возрастов,включающему в себя хотябы одну сущность коллекции
     -> ОР список содержит только сущности с подходящим возрастом
     Негативные сценарии:
     1)Попытка отфильровать коллекцию по диапазону возрастов,не включающему в себя ни одну сущность коллекции
     -> ОР список пуст

     -Метод для фильтрации по имени.
     Позитивные сценарии:
     1)Попытка отфильровать коллекцию по имени,соответствующему имени хотя бы одной сущности коллекции
     -> ОР список содержит только сущности с подходящим именем
     Негативные сценарии:
     1)Попытка отфильровать коллекцию по имени,не соответствующему ни одному имени сущности коллекции
     -> ОР список пуст


     -Метод для фильтрации по статусу.
     Позитивные сценарии:
    1)Попытка отфильровать коллекцию по статусу,который содержит хотя бы одна сущность коллекции
     -> ОР список содержит только сущности с подходящим статусом
     Негативные сценарии:
     1)Попытка отфильровать коллекцию по статусу,который не содержит ни одна сущность коллекции
     -> ОР список пуст

     */


    @DisplayName("Добавление сущности с типом данных Entities")
    @Test
    public void addValidEntity(){
        User user = new User("Boba", 15,true);
        entityManager.add(user);
        assertTrue(entityManager.getAll().contains(user));
    }

    @DisplayName("Удаление существующего в коллекции объекта")
    @Test
    public void removeExistingUser(){
        User user = new User("Boba", 15,true);
        entityManager.add(user);

        assertTrue(entityManager.removeEntity(user) && entityManager.getAll().isEmpty() );
    }

    @DisplayName("Удаление не существующего в коллекции объекта")
    @Test
    public void removeNonExistingUser(){
        User user = new User("Boba", 15,true);
        User user2 = new User("Boba", 15,true);
        entityManager.add(user2);

        boolean removeStatus = entityManager.removeEntity(user);
        assertFalse(removeStatus && entityManager.getAll().isEmpty());
    }

    @DisplayName("Получение копии коллекции содержащей сущности")
    @Test
    public void getCopyOfNotEntityList(){
        User user = new User("Boba", 15,true);
        entityManager.add(user);

        assertTrue(entityManager.getAll().contains(user));
    }

    @DisplayName("Получение копии коллекции не содержащей сущности")
    @Test
    public void getCopyOfEmptyEntityList(){
        assertTrue(entityManager.getAll().isEmpty());
    }

    @DisplayName("Фильрация коллекции по диапазону возрастов,включающему в себя хотя бы одну сущность коллекции")
    @Test
    public void filterByContainedAge(){
        User user1 = new User("Boba", 15,true);
        User user2 = new User("Goga", 25,true);
        User user3 = new User("Gena", 35,true);

        entityManager.add(user1);
        entityManager.add(user2);
        entityManager.add(user3);

        int filteredListSize = entityManager.filterByAge(14,26).size();

        assertTrue(entityManager.filterByAge(14,26).contains(user1) &&
                entityManager.filterByAge(14,26).contains(user2) && filteredListSize == 2);
    }

    @DisplayName("Фильрация коллекции по диапазону возрастов,не включающему в себя ни одну сущность коллекции")
    @Test
    public void filterByNotContainedAge(){
        User user1 = new User("Boba", 15,true);
        User user2 = new User("Goga", 25,true);
        User user3 = new User("Gena", 35,true);

        entityManager.add(user1);
        entityManager.add(user2);
        entityManager.add(user3);

        assertTrue(entityManager.filterByAge(10,14).isEmpty());
    }

    @DisplayName("Фильрация коллекци по имени, соответствующему имени хотя бы одной сущности коллекции")
    @Test
    public void filterByContainedName(){
        User user1 = new User("Boba", 15,true);
        User user2 = new User("Goga", 25,true);
        entityManager.add(user1);
        entityManager.add(user2);

        int filteredListSize = entityManager.filterByName("Boba").size();
        assertTrue(entityManager.filterByName("Boba").contains(user1) && filteredListSize == 1);
    }

    @DisplayName("Фильрация коллекци по имени, не соответствующему ни одному имени сущности коллекции")
    @Test
    public void filterByNotContainedName(){
        User user1 = new User("Boba", 15,true);
        User user2 = new User("Goga", 25,true);
        entityManager.add(user1);
        entityManager.add(user2);

        assertTrue(entityManager.filterByName("Anna").isEmpty());
    }

    @DisplayName("Фильрация коллекции по статусу,который содержит хотя бы одна сущность коллекции")
    @Test
    public void filterByContainedIsActiveStatus(){
        User user1 = new User("Boba", 15,true);
        User user2 = new User("Goga", 25,false);
        entityManager.add(user1);
        entityManager.add(user2);

        int filteredListSize = entityManager.filterByIsActive(true).size();

        assertTrue(entityManager.filterByIsActive(true).contains(user1) && filteredListSize == 1);
    }

    @DisplayName("Фильрация коллекции по статусу,который не содержит ни одна сущность коллекции")
    @Test
    public void filterByNotContainedIsActiveStatus(){
        User user1 = new User("Boba", 15,false);
        User user2 = new User("Goga", 25,false);
        entityManager.add(user1);
        entityManager.add(user2);

        assertTrue(entityManager.filterByIsActive(true).isEmpty());
    }

}

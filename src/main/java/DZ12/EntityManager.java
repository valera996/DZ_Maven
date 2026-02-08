package DZ12;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    //Добавление элементов: Метод для добавления объекта в коллекцию
    public void add(T entity){
        entities.add(entity);
    }

    //Удаление элементов: Метод для удаления объекта из коллекции.
    public boolean removeEntity(T entity){
        if(entities.contains(entity)){
            entities.remove(entity);
            return true;
        } else return false;
    }

    //Получение всех элементов: Метод возвращает копию списка всех элементов.
    public List<T> getAll(){
        return List.copyOf(entities);
    }

    //Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
    public List<T> filterByAge(int minAge, int maxAge){
        return entities.stream()
                .filter(n -> n.getAge() >= minAge && n.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    //Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
    public List<T> filterByName(String name){
        return entities.stream()
                .filter(n -> n.getName().equals(name))
                .collect(Collectors.toList());
    }

    //Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.
    public List<T> filterByIsActive( boolean isActive){
        return entities.stream()
                .filter(n -> n.getIsActive() == isActive)
                .collect(Collectors.toList());
    }




}

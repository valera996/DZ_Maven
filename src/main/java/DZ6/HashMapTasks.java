package DZ6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {


//        Задача 1:
//        Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.

        Map<String, Integer> nameOld = new HashMap<>();
        nameOld.put("Vanya",12);
        nameOld.put("Stepan",30);
        nameOld.put("Vova",20);
        nameOld.put("Vika",22);
        nameOld.put("Slava",17);

        System.out.println("Вывод результата первого задания");
        for(Map.Entry<String,Integer> map : nameOld.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }


//        Задача 2:
//        Проверьте, есть ли определённое имя в HashMap.
        System.out.println("Вывод результата второго задания");
        System.out.println("Имя Vova содержится в коллекции - " + nameOld.containsKey("Vova"));

    }
}

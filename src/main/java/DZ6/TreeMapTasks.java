package DZ6;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {

//        Задача 1:
//        Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.

        Map<String, Integer> testMap = new TreeMap<>();
        testMap.put("Ваня",50);
        testMap.put("Таня",60);
        testMap.put("Аня",70);
        testMap.put("Юля",100);
        testMap.put("Жора",30);

        //TreeMap при добавлении сортирует данные по ключу, раз ключ это строка, то сортирует по алфавиту
        for(Map.Entry<String,Integer> map : testMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}

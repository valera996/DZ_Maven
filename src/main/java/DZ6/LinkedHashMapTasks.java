package DZ6;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTasks {
    public static void main(String[] args) {


//        Задача 1:
//        Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        Map<String ,Integer> elementsLinkedHashMap = new LinkedHashMap<>();
        elementsLinkedHashMap.put("Element1",1);
        elementsLinkedHashMap.put("Element2",2);
        elementsLinkedHashMap.put("Element3",3);
        elementsLinkedHashMap.put("Element4",4);
        elementsLinkedHashMap.put("Element5",5);

        //LinkedHashMap сохраняет порялдок добавления
        for(Map.Entry<String, Integer> map : elementsLinkedHashMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}

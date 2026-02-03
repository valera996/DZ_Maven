package DZ6;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTasks {
    public static void main(String[] args) {


//        Задача 1:
//        Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("string 1");
        stringSet.add("string 2");
        stringSet.add("string 3");
        stringSet.add("string 4");
        stringSet.add("string 5");

        //Порядок вывода должен сохраниться т.к. это LinkedHashSet
        for(String str : stringSet){
            System.out.println(str);
        }
    }
}

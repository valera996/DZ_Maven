package DZ6;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTask {
    public static void main(String[] args) {

//        Задача 1:
//        Создайте HashSet из 5 чисел и выведите его содержимое.

        Set<Integer> numberSet = new HashSet<>(List.of(1,2,3,4,5));
        System.out.println("Вывод результата первой задачи");
        for(Integer num : numberSet){
            System.out.println(num);
        }


//        Задача 2:
//        Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.

        Set<Integer> numberSet2 = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Вывод результата второй задачи");
        System.out.println("Число 5 содержится в списке - " + numberSet2.contains(5));
    }
}

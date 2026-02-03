package DZ6;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {

//        Задача 1:
//        Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
        Set<Integer> numberTreeSet = new TreeSet<>();
        numberTreeSet.add(10);
        numberTreeSet.add(9);
        numberTreeSet.add(8);
        numberTreeSet.add(7);
        numberTreeSet.add(6);

        //В TreeSet при добавлении происходит сортировка(минимальное значение занимает верхнюю позицию),
        // и при выводе сначала будут наименьшие значение
        for(Integer num : numberTreeSet){
            System.out.println(num);
        }





    }
}

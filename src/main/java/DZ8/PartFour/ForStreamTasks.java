package DZ8.PartFour;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForStreamTasks {
    public static void main(String[] args) {


//        1. Группировка строк по первой букве
//        Задача: Напишите программу, которая принимает список строк
//        и группирует их по первой букве, используя Stream API.

        List<String> stringList = new LinkedList<>(List.of("aa","vb","ac","va","vg","vd"));
        Map<Character, List<String>> filteredString = stringList.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));

        for(Map.Entry<Character, List<String>> str : filteredString.entrySet()){
            System.out.println(str);
        }

//
//        2. Группировка чисел по чётности
//        Задача: Напишите программу, которая принимает список
//        чисел и группирует их на чётные и нечётные, используя Stream API.

        List<Integer> number = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));
        Map<Boolean, List<Integer>> filteredNumber = number.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        for(var num : filteredNumber.entrySet()){
            System.out.println(num);
        }

//        3. Поиск среднего значения чисел
//        Задача: Напишите программу, которая принимает список чисел
//        и находит их среднее значение, используя Stream API.

        List<Integer> number2 = new LinkedList<>(List.of(2,2,3));
        Double average = number2.stream()
                .collect(Collectors.averagingInt(n->n));

        System.out.println(average);
    }
}

package DZ8.PartTwo;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ForStreamTasks {
    public static void main(String[] args) {


//        1. Фильтрация строк по длине больше 5
//        Задача: Напишите программу, которая принимает список строк
//        и удаляет из него все строки длиной 5 символов и менее, используя Stream API.

        List<String> stringList = new LinkedList<>(List.of("rrr","rrrr","rr","aaaaaa","aaaaaaa"));
        List<String> filteredList = stringList.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredList);

//        2. Фильтрация чисел, кратных 5
//        Задача: Напишите программу, которая принимает список чисел
//        и отбирает только те, которые делятся на 5 без остатка, используя Stream API.

        List<Integer> numberList = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10,15,20));
        List<Integer> filteredNumber = numberList.stream()
                .filter(num -> num % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumber);

//        3. Преобразование строк в их длины
//        Задача: Напишите программу, которая принимает список строк
//        и заменяет каждую строку на её длину, используя Stream API

        List<String> stringList2 = new LinkedList<>(List.of("aa","sss","dddd","fffff"));
        List<Integer> lengthOfString = stringList2.stream()
                .map(str ->str.length())
                .collect(Collectors.toList());

        System.out.println(lengthOfString);

//        4. Создание списка квадратов чисел
//        Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
//                где каждое число заменено на его квадрат, используя Stream API.
        List<Integer> number = new LinkedList<>(List.of(1,2,3,4,5));
        List<Integer> newNumber = number.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(newNumber);

//        5. Удаление дубликатов из списка
//        Задача: Напишите программу, которая принимает список элементов
//        и удаляет из него все дубликаты, используя Stream API.

        List<String> stringList3 = new LinkedList<>(List.of("a","b","a","b","c","d","d"));
        List<String> filteredStringList3 = stringList3.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filteredStringList3);



    }
}

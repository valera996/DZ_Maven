package DZ8.PartThree;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ForStreamTask {
    public static void main(String[] args) {



//        1. Поиск максимального элемента
//        Задача: Напишите программу, которая принимает список чисел
//        и находит в нём самое большое число, используя Stream API.

        List<Integer> number = new LinkedList<>(List.of(2,1,4,3,5,6));
        Integer maxNumber = number.stream()
                .max(Comparator.naturalOrder())
                .get();


        System.out.println(maxNumber);


//        2. Поиск минимального элемента
//        Задача: Напишите программу, которая принимает список чисел
//        и находит в нем наименьшее число, используя Stream API.

        List<Integer> number2 = new LinkedList<>(List.of(1,2,3,4,5,6));
        Integer minNumber = number2.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(minNumber);

//        3. Сумма всех элементов списка
//        Задача: Напишите программу, которая принимает список чисел
//        и вычисляет их сумму, используя Stream API.

        List<Integer> number3 = new LinkedList<>(List.of(1,2,3));
        Integer sumOfNumber = number3.stream()
                .mapToInt(n->n)
                .sum();
        System.out.println(sumOfNumber);

//        4. Поиск первого элемента, начинающегося на "Б"
//        Задача: Напишите программу, которая принимает список строк и находит первую строку
//        , начинающуюся на букву "Б", используя Stream API.

        List<String> stringList = new LinkedList<>(List.of("Вова","Галя","Юля","Борис","Баря"));
        String filteredName = stringList.stream()
             .filter(str -> str.startsWith("Б"))
                .findFirst()
                .get();

        System.out.println(filteredName);

//        5. Проверка наличия хотя бы одного элемента по условию
//        Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
//                который удовлетворяет
//        заданному условию (например, является чётным числом), используя Stream API.

        List<Integer> number4 = new LinkedList<>(List.of(1,2,3,4,5,6,7,8));
        boolean filteredNumber = number4.stream()
                .anyMatch(num -> num % 2 == 0);

        System.out.println("В списке есть четное число - " + filteredNumber);





    }
}

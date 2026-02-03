package DZ8.PartOne;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTask {
    public static void main(String[] args) {


//        3. Лямбда-выражение с Predicate
//        Задача: Напишите лямбду, которая проверяет, является ли число чётным.
        Predicate<Integer> evenNumber = number -> number % 2 == 0;
        System.out.println(evenNumber.test(2));


//        4. Лямбда-выражение с Function
//        Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
        Function<String,Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Три"));

//        5. Использование Consumer
//        Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> printString = str -> System.out.println(str);
        printString.accept("Для проверки Consumer");
    }
}

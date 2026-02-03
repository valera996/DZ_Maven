package DZ6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTasks {
    public static void main(String[] args) {


//        Задача 1:
//        Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        List<String> string = new LinkedList<>();
        System.out.println("Вывод результата первого задания:");
        string.add("Строка1");
        string.add("Строка2");
        string.add("Строка3");
        string.add("Строка4");
        string.add("Строка5");

        for (String str : string){
            System.out.println(str);
        }

//        Задача 2:
//        Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
//        List<String> queue = new LinkedList<>();
//        queue.add("Task 1");
//        queue.add("Task 2");
//        queue.add("Task 3");
//        System.out.println("Вывод результата второго задания:");
//        while (!queue.isEmpty()){
//            System.out.println(queue.removeFirst());
//        }

//        Задача 2: Исправленный вариант
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");
        System.out.println("Вывод результата второго задания:");
        while (!queue.isEmpty()){
            System.out.println(queue.removeFirst());
        }

    }
}

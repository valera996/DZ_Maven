package DZ6;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeTasks {
    public static void main(String[] args) {


//        Задача 1:
//        Создайте ArrayDeque, добавьте 5 элементов и выведите их.

        Queue<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Элемент1");
        arrayDeque.add("Элемент2");
        arrayDeque.add("Элемент3");
        arrayDeque.add("Элемент4");
        arrayDeque.add("Элемент5");

        for(String str : arrayDeque){
            System.out.println(str);
        }
    }
}

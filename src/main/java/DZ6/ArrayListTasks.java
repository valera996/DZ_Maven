package DZ6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTasks {
    public static void main(String[] args){

//        Задача 1:
//        Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.

        List<Integer> number = new ArrayList<>(List.of(1,2,3,4,5));
        number.add(6);
        System.out.println("Вывод результата первой задачи:");
        for(Integer num : number){
            System.out.print(num + " ");
        }


//        Задача 2:
//        Напишите программу, которая выводит все чётные числа из ArrayList.

        List<Integer> number2 = new ArrayList<>(List.of(4,5,6,7,88,9,10));
        System.out.println();
        System.out.println("Вывод результата второй задачи:");
        for (Integer num : number2){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}

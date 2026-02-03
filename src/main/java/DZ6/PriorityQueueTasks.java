package DZ6;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTasks {
    public static void main(String[] args) {

//        Задача 1:
//        Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        //PriorityQueue сортирует элементы при добавлении, и наименьшие становятся во главе очереди
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}

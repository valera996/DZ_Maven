package DZ9;

public class TaskThree {


//    3. Задача: использование volatile
//    Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
//    В основном потоке через 2 секунды
//    установите флаг stop = true, чтобы остановить поток.

    public static volatile boolean stop = false;
    public static int count;

    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(() -> {
            while (!stop) {
                count++;
                System.out.println(count);
            }
        });


        t1.start();
        Thread.sleep(2000);
        stop = true;
        System.out.println("Поток завершил работу");


    }
}
